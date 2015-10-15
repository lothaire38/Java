import java.io.*;
import java.util.*;

import com.m2i.formation.media.entities.*;

public class TestFile
{
	// private FileReader fileRead = new
	// FileReader("file::C:\\Users\\adminlocal\\Documents\\ExoIO\\Livres.csv");
	// private BufferedReader br = new BufferedReader(fileRead);

	private List<String> titles = new ArrayList<String>();
	private List<String> authors = new ArrayList<String>();
	private List<Double> prices = new ArrayList<Double>();
	private List<String> publishes = new ArrayList<String>();

	private String title;
	private String author;
	private String publish;
	private double price;
	
	public void readFile(String fileName) throws IOException 
	{
		FileReader fileRead = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileRead);
		String line;
		StringTokenizer st;	
		String prix;
		line = br.readLine();
		line = br.readLine();
		// compte le nombre de separateur
		// nbSep = st.countTokens();
		System.out.println("Livres : ");
		System.out.println();
		while (line != null)
		{
			// titles.add(st.nextToken());
			// authors.add(st.nextToken());
			// publishes.add(st.nextToken());
			// prices.add(Double.parseDouble(st.nextToken()));
			st = new StringTokenizer(line, ";");
			title = st.nextToken();
			author = st.nextToken();
			publish = st.nextToken();			
			prix = st.nextToken();			
			price = Double.parseDouble(prix.replace(",","."));
//			System.out.println("\tTitres  : " + st.nextToken());
//			System.out.println("\tAuteurs : " + st.nextToken());
//			System.out.println("\tEditeur : " + st.nextToken());
//			System.out.println("\tPrix : " + st.nextToken());
			
			System.out.println("\tTitres  : " + title);
			System.out.println("\tAuteurs : " + author);
			System.out.println("\tEditeur : " + publish);
			System.out.println("\tPrix : " + price);
			System.out.println();
			line = br.readLine();
		}
		br.close();
	}
	public List<Book> readBooks (String line)
	{
		List<Book> books = new ArrayList<Book>();
		StringTokenizer st = new StringTokenizer(line, ";");
		Book book = new Book();
		Author author = new Author();
		book.setTitle(st.nextToken());
		//author.setLastName(line);
//		book.addAuthor(newAuthor);
		
		
		
		
		books.add(book);
		
		
		
		return null;
		
	}

}
