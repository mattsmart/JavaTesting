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
	
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
}
