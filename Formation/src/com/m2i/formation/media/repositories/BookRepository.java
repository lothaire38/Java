package com.m2i.formation.media.repositories;

import java.io.*;
import java.util.*;
import com.m2i.formation.media.entities.*;

public class BookRepository implements IRepository<Book>
{
	// -------------------------------------------------------------------
	// Attributs
	private String uri;
	private List<String> str = new ArrayList<String>();
	private List<Book> cache= new ArrayList<Book>() ;
	// private List<Book> books = new ArrayList<Book>();
	// -------------------------------------------------------------------
	// -------------------------------------------------------------------
	// Beans
	@Override
	public String getUri()
	{
		// return this.uri;
		return uri;
	}

	@Override
	public void setUri(String uri)
	{
		this.uri = uri;
	}
	// -------------------------------------------------------------------
	// -------------------------------------------------------------------

	@Override
	public List<Book> getAll() throws IOException
	{
		List<Book> bo = new ArrayList<Book>();

		str = readFile();
		for (String s : str)
		// for (int i = 0; i < str.size(); i++)
		{
			try
			{
				bo.add(readData(s));
			} catch (MediaException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bo;
	}

	@Override
	public Book getById(int id) throws IOException
	{
		List<Book> bi = new ArrayList<Book>();		
		bi = this.getAll();		

		for (Book b : bi)
		{
			if (b.getId() == id)
			{
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException
	{
		List<Book> bi = new ArrayList<Book>();
		List<Book> bo = new ArrayList<Book>();
		
		bi = this.getAll();		

		for (Book b : bi)
		{
			if (b.getPrice() <= price)
			{
				bo.add(b);
			}
		}
		return bo;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException
	{
		List<Book> bi = new ArrayList<Book>();
		List<Book> bo = new ArrayList<Book>();
		bi = this.getAll();		
		String result;

		for (Book b : bi)
		{
			result = b.getTitle().toUpperCase();

			if (result.contains(word.toUpperCase()))
			{
				bo.add(b);
			}
		}
		return bo;
	}
	private List<Book> getCache() throws IOException
	{
		
		if (cache == null)
		{
			cache = cacheFactory();
		}
		return cache;
	}
	private List<Book> cacheFactory() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(uri));
		
		List<Book> bo = new ArrayList<Book>();
		str = readFile();
		for (String s : str)
		// for (int i = 0; i < str.size(); i++)
		{
			try
			{
				bo.add(readData(s));
			} catch (MediaException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bo;
	}
	
	private List<String> readFile() throws IOException
	{
		FileReader fileRead = new FileReader(this.uri);
		BufferedReader br = new BufferedReader(fileRead);
		List<String> lines = new ArrayList<String>();

		String line;
		String entete;

		entete = br.readLine();
		line = br.readLine();

		while (line != null)
		{
			lines.add(line);
			line = br.readLine();
		}
		return lines;
	}

	private Book readData(String line) throws MediaException
	{
		Book b = new Book();
		StringTokenizer st = new StringTokenizer(line, ";");

		b.setId(Integer.parseInt(st.nextToken()));
		b.addAuthor(authorManage(st.nextToken()));
		b.setTitle(st.nextToken());

		b.setPublisher(publishManage(st.nextToken()));
		b.setPrice(Double.parseDouble(st.nextToken().replace(",", ".")));

		return b;

	}

	private Author authorManage(String auth)
	{
		StringTokenizer aut = new StringTokenizer(auth, " ");
		Author a = new Author();
		a.setFirstName(aut.nextToken());
		a.setLastName(aut.nextToken());

		return a;
	}

	private Publisher publishManage(String publishName)
	{
		Publisher p = new Publisher();
		p.setName(publishName);
		return p;

	}
}
