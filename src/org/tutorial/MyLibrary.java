package org.tutorial;

import java.util.ArrayList;

public class MyLibrary {

	String name;
	ArrayList<Book> books;
	ArrayList<Human> humans;
	
	public MyLibrary(String name) {
		this.name = name;
		books = new ArrayList<Book>();
		humans = new ArrayList<Human>();
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Book> getBooks() {
		return this.books;
	}

	public ArrayList<Human> getHumans() {
		return this.humans;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void removeBook(Book book) {
		this.books.remove(book);
	}
	
	public void addHuman(Human human) {
		this.humans.add(human);
	}
	
	public void removeHuman(Human human) {
		this.humans.remove(human);
	}
	
}
