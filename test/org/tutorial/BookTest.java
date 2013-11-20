package org.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unkown author", b1.author);
	}
	
	@Test
	public void testGetPerson() {
		Book b2 = new Book("War and Peace");
		
		// create a new human to hold the book
		Human h2 = new Human();
		h2.setName("Frank");
		
		// method to say book is loaned to human
		b2.setHuman(h2);
		
		// get the name of the human who has book
		Human testHuman = b2.getHuman();
		String testName = testHuman.getName();
		//String testName = b2.getHuman().getName();
		
		assertEquals("Frank",testName);
	}
	
	@Test
	public void testToString() {
		Book b2 = new Book("War and Peace");
		Human h2 = new Human();
		h2.setName("Frank");
		
		assertEquals("War and Peace by unkown author; Available",
				b2.toString());
		
		b2.setHuman(h2);
		assertEquals("War and Peace by unkown author; Checked out to Frank",
				b2.toString());
	}
	
}
