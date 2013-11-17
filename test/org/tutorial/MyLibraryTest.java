package org.tutorial;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MyLibraryTest {

	private Book b1;
	private Book b2;
	private Human h1;
	private Human h2;
	private MyLibrary ml;

	@Test
	// test constructor
	public void testMyLibrary() {
		MyLibrary ml = new MyLibrary("Test");
		assertEquals("Test", ml.name);
		
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.humans instanceof ArrayList);
	}
	
	public void setup() {
		b1 = new Book("Book1");
		b2 = new Book("Book2");
		
		h1 = new Human();
		h2 = new Human();
		h1.setName("Fred");
		h2.setName("Sue");
		
		ml = new MyLibrary("Test");
	}
	
	@Test
	public void testAddBook() {
		// create test objects
		setup();
		
		//test init size is 0
		assertEquals(0, ml.getBooks().size());
		
		ml.addBook(b1);
		ml.addBook(b2);
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b2);
		assertEquals(0, ml.getBooks().size());

		//test init size is 0
		assertEquals(0, ml.getHumans().size());

		ml.addHuman(h1);
		ml.addHuman(h2);
		assertEquals(2, ml.getHumans().size());
		assertEquals(0, ml.getHumans().indexOf(h1));
		assertEquals(1, ml.getHumans().indexOf(h2));
		
		ml.removeHuman(h1);
		assertEquals(1, ml.getHumans().size());
		assertEquals(0, ml.getHumans().indexOf(h2));
		
		ml.removeHuman(h2);
		assertEquals(0, ml.getHumans().size());	
		
	}
	
	
	
}