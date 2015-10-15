

import java.util.*;

import com.m2i.formation.media.entities.*;

public class CollectTest
{
	public List<Book> listTest() throws MediaException
	{
		// ---------------------------------------------------------------
		// variables
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Collection
		List<Book> listTest = new ArrayList<Book>();
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Livres
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Auteurs
		// .............................
		// Livre 1
		Author aut1 = new Author();
		aut1.setLastName("ROWLING");
		aut1.setFirstName("Johannes");
		// .............................
		// .............................
		// Livre 2

		Author aut2 = new Author();
		Author aut3 = new Author();

		aut2.setLastName("EINSTEIN");
		aut2.setFirstName("Albert");
		aut3.setLastName("HAWKING");
		aut3.setFirstName("Stephen");
		// .............................
		// .............................
		// Livre 3
		Author aut4 = new Author();
		aut4.setLastName("COOPER");
		aut4.setFirstName("Sheldon");
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Publisher
		Publisher pub1 = new Publisher();
		Publisher pub2 = new Publisher();
		Publisher pub3 = new Publisher();

		/*
		 * Author aut1 = new Author(); Author aut2 = new Author(); Author aut3 =
		 * new Author(); Author aut4 = new Author(); Author aut5 = new Author();
		 * Author aut6 = new Author();
		 * 
		 * Publisher publish1 = new Publisher(); Publisher publish2 = new
		 * Publisher(); Publisher publish3 = new Publisher();
		 */
		// ---------------------------------------------------------------
		// ---------------------------------------------------------------
		// création objet
		// ++++++++++++++++++++++++++++++++++++++++++++++
		// 1 er livre
		book1.setTitle("Harry Potter et le java");
		book2.setTitle("Relativite de la physique quantique");
		book3.setTitle("Java dans la vie courante");
		book4.setTitle("C# versus Java");

		book1.addAuthor(aut1);
		book1.addAuthor(aut2);
		book2.addAuthor(aut3);
		book3.addAuthor(aut4);
		book4.addAuthor(aut1);
		// aut1.setLastName("Rowling");
		// aut1.setFirstName("Johannes");
		//
		// publish1.setName("Glenat");
		// b1.setTitle("Harry Potter et Java");
		// b1.setPrice(19.99);
		// b1.addAuthor(aut1);
		// ++++++++++++++++++++++++++++++++++++++++++++++
		// ++++++++++++++++++++++++++++++++++++++++++++++
		// 2 eme livre

		// ++++++++++++++++++++++++++++++++++++++++++++++

		listTest.add(book1);
		listTest.add(book2);
		listTest.add(book3);
		listTest.add(1, book4);
		listTest.remove(1);
		return listTest;

	}

	public Set<Book> setTest()
	{
		Set<Book> setTest = new HashSet();
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Livres
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		// +++++++++++++++++++++++++++++++++++++++++++++++
		// Auteurs
		// .............................
		// Livre 1
		Author aut1 = new Author();
		aut1.setLastName("ROWLING");
		aut1.setFirstName("Johannes");
		// .............................
		// .............................
		// Livre 2

		Author aut2 = new Author();
		Author aut3 = new Author();

		aut2.setLastName("EINSTEIN");
		aut2.setFirstName("Albert");
		aut3.setLastName("HAWKING");
		aut3.setFirstName("Stephen");
		// .............................
		// .............................
		// Livre 3
		Author aut4 = new Author();
		aut4.setLastName("COOPER");
		aut4.setFirstName("Sheldon");
		// +++++++++++++++++++++++++++++++++++++++++++++++
		setTest.add(book1);
		setTest.add(book1);
		setTest.add(book2);
		return setTest;

	}
	public Map<Integer, Book> mapTest()
	{
		Map<Integer,Book> mapTest = new HashMap<Integer, Book>();
		Book b = new Book();
		b.setId(123);
		b.setTitle("Harry et le C#");
//		b.addAuthor("EINSTEIN");
		mapTest.put(b.getId(), b);
		
		
		return mapTest;
		
	}
	// @Override
	// public String toString()
	// {
	// String about;
	// about =
	//
	// return about;
	//
	// }
}
