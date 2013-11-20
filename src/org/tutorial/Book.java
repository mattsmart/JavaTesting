package org.tutorial;

public class Book {

	String title;
	String author;
	Human human;
	
	public Book(String anyTitle) {
		this.title = anyTitle;
		this.author = "unkown author";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String anyTitle) {
		this.title = anyTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String anyAuthor) {
		this.author = anyAuthor;
	}

	public void setHuman(Human h2) {
		this.human = h2;
	}

	public Human getHuman() {
		return this.human;
	}
	
	public String toString() {
		String available;
		if (this.getHuman() == null) {
			available = "Available";
		}
		else {
			available = "Checked out to " +
					this.getHuman().getName();	
		}
		return this.getTitle() + " by " + this.getAuthor() + 
				"; " + available;
	}
	
}
