package org.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanTest {

	@Test
	public void testHuman() {
		Human h1 = new Human();
		assertEquals("unkown name", h1.getName());
		assertEquals(7, h1.getMaxBooks());
	}

	@Test
	public void testSetName() {
		Human h2 = new Human();
		h2.setName("Bob");
		assertEquals("Bob", h2.getName());
	}

	@Test
	public void testSetMaxBooks() {
		Human h3 = new Human();
		h3.setMaxBooks(10);
		assertEquals(10, h3.getMaxBooks());
	}
	
	@Test
	public void testToString() {
		Human h4 = new Human();
		h4.setName("Lettuces");
		h4.setMaxBooks(9001);
		String testString = "Lettuces (9001 books)";
		assertEquals(testString, h4.toString());
	}
}
