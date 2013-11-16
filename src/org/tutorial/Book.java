package org.tutorial;

public class Book {

	public String title;
	public String author;
	
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

}
