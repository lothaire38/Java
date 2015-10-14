package com.m2i.formation.media;

import java.util.Date;

public class Book
{
	private String title;
	// public String authors;
	// public String editor;
	private int id;
	private String isbn;
	private int nbPage;
	private Date date;
	private String lang; // code ISO
	private Publisher house;
	private int nbAut = 0;
//	private BookType category;
	
	
//	public BookType getCategory()
//	{
//		return category;
//	}
//
//	public void setCategory(BookType category)
//	{
//		this.category = category;
//	}

	public int getNbAut()
	{
		return nbAut;
	}

	public Author[] getAuthors()
	{
		return authors;
	}

	private Author[] authors = new Author[10];

//	public void setHouse(Publisher house)
//	{
//		this.house = house;
//	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;	
		//autoInc(id);
	}

//	private void autoInc(int id2)
//	{
//		// TODO Auto-generated method stub
//		this.id += 1;
//	}

	public int getId()
	{
		return id;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	public int getNbPage()
	{
		return nbPage;
	}

	public void setNbPage(int nbPage)
	{
		this.nbPage = nbPage;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public String getLang()
	{
		return lang;
	}

	public void setLang(String lang)
	{
		this.lang = lang;
	}

	public void addAuthor(Author aut)
	{
		authors[nbAut++] = aut;
	}
	
//	public String toString()
//	{
//		String about = "Livre :\n";
//		
//		Publisher publish = new Publisher();
////		publish.setNom("Edition Glenat");
////		publish.setSiret("12345678901234");
//		
//		about += " Titre   : "+ this.getTitle()+"\n";
//		about += " Nb page : "+ this.getNbPage()+"\n";
////		about += " Edité par :\n";
////		about += publish.toString();
//		return about;
//	}

	public Publisher getHouse()
	{
		return house;
	}

	public void setHouse(Publisher house)
	{
		this.house = house;
	}
}
