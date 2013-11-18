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

	private void addItems() {
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addHuman(h1);
		ml.addHuman(h2);
	}
	
	@Test
	// test add and remove methods
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
	
	@Test
	// test checkout related methods
	public void testCheckOut() {
		// setup objects
		setup();
		
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addHuman(h1);
		ml.addHuman(h1);
		
		assertTrue("Book did not check out correctly",
				ml.checkOut(b1,h1));
		assertEquals("Fred", b1.getHuman().getName());
		assertFalse("Book was already checked out", ml.checkOut(b1,h2));
		assertTrue("Book check in failed", ml.checkIn(b1));
		assertFalse("Book was already checked in", ml.checkIn(b1));
		assertFalse("Book was never checked out", ml.checkIn(b2));
		
		// additional test for max books field
		setup();
		h1.setMaxBooks(1);
		addItems();
		
		assertTrue("First book did not check out", ml.checkOut(b2, h1));
		assertFalse("Second book should not have checked out", ml.checkOut(b1, h1));
	}
	
	@Test
	// test getBooksForHuman method
	public void testGetBooksForHuman() {
		setup();
		addItems();
		assertEquals(0, ml.getBooksForHuman(h1).size());
		
		ml.checkOut(b1, h1);
		ArrayList<Book> testBooks = ml.getBooksForHuman(h1);
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b1));
		
		ml.checkOut(b2, h1);
		testBooks = ml.getBooksForHuman(h1);
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
	}
	
}