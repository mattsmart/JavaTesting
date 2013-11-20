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
	
	public static void main(String[] args) {
		// create a new MyLibrary
		MyLibrary testLibrary = new MyLibrary("Test Run Library");
		Book b1 = new Book("War and Peace");
		Book b2 = new Book("Great Expectations");
		b1.setAuthor("Tolstoy");
		b2.setAuthor("Dickens");
		Human jim = new Human();
		Human sue = new Human();
		jim.setName("Jim");
		sue.setName("Sue");
		testLibrary.addBook(b1);
		testLibrary.addBook(b2);
		testLibrary.addHuman(jim);
		testLibrary.addHuman(sue);
		
		System.out.println("Just created a new library"); // SHORTCUT - highlight text, ctrl space, up arrow
		testLibrary.printStatus();
		
		System.out.println("Check out War and Peace to Sue");
		testLibrary.checkOut(b1, sue);
		testLibrary.printStatus();
		
		System.out.println("Do some other stuff");
		testLibrary.checkIn(b1);
		testLibrary.checkOut(b2, jim);
		testLibrary.printStatus();	
	}
	
	public void printStatus() {
		System.out.println("Status Report of MyLibrary \n" + this.toString());
		for (Book thisBook : this.getBooks()) {
			System.out.println(thisBook);
		}
		for (Human thisHuman : this.getHumans()) {
			int count = this.getBooksForHuman(thisHuman).size();
			System.out.println(thisHuman + " (has " + count + " of my books)");
		}
		System.out.println("Books Avaliable: " + this.getAvailableBooks().size());
		System.out.println("--- End of Status Report ---");
	}
	
}