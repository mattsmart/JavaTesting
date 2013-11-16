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
		// TODO Auto-generated method stub
		this.human = h2;
	}

	public Human getHuman() {
		// TODO Auto-generated method stub
		return this.human;
	}

}
