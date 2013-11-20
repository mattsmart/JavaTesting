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

	public boolean checkOut(Book b1, Human h1) {
		// TODO Auto-generated method stub
		int booksOut = this.getBooksForHuman(h1).size();
		
		if ((b1.getHuman() == null) &&
				(booksOut < h1.getMaxBooks())) {
			b1.setHuman(h1);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean checkIn(Book b1) {
		// TODO Auto-generated method stub
		if (b1.getHuman() != null) {
			b1.setHuman(null);
			return true;
		}
		else {
			return false;
		}
	}

	public ArrayList<Book> getBooksForHuman(Human h1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if ((aBook.getHuman() != null) && 
					(aBook.getHuman().getName()
							.equals(h1.getName())))
			{
				result.add(aBook);
			}
		}
		return result;
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> availBooks = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getHuman() == null) {
				availBooks.add(aBook);
			}
		}
		return availBooks;
	}

	public ArrayList<Book> getUnavailableBooks() {
		ArrayList<Book> unavailBooks = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getHuman() != null) {
				unavailBooks.add(aBook);
			}
		}
		return unavailBooks;
	}

	public String toString() {
		return this.getName() + ": " + 
			this.getBooks().size() + " books; " +
			this.getHumans().size() + " humans.";
	}
	
}