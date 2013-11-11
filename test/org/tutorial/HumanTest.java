package org.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class HumanTest {

	@Test
	public void testHuman() {
		Human h1 = new Human();
		assertEquals("unkown name", h1.getName());
		assertEquals(7, h1.getAge());
	}

	@Test
	public void testSetName() {
		Human h2 = new Human();
		h2.setName("Marina");
		assertEquals("Marina", h2.getName());
	}

	@Test
	public void testSetAge() {
		Human h3 = new Human();
		h3.setAge(10);
		assertEquals(10, h3.getAge());
	}

}
