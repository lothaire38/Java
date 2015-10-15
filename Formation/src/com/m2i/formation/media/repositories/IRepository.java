package com.m2i.formation.media.repositories;

import java.io.IOException;
import java.util.*;
import com.m2i.formation.media.entities.*;
/**
 * Repository to manage any books
 * @author Christophe
 *
 */
public interface IRepository<T>
{
	// -------------------------------------------------------------------
	//							Beans
	String getUri();
	void setUri(String uri);
	// -------------------------------------------------------------------
	// -------------------------------------------------------------------
	//							Manage
	List<Book> getAll() throws IOException;
	Book getById(int ind) throws IOException;
	List<Book> getByPrice(double price) throws IOException;
	List<Book> getByTitle(String word) throws IOException;
	// -------------------------------------------------------------------
}
