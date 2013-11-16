package org.tutorial;

public class Human {
	
	// some fields
	private String name; // give your human a name
	private int maxBooks;
	
	// constructor
	public Human () {
		name = "unkown name";
		maxBooks = 7;
	}
	
	// methods
	public String getName() {
		return name;
	}
	public int getMaxBooks() {
		return maxBooks;
	}
	public void setName(String anyName) {
		this.name = anyName;
	}
	public void setMaxBooks(int anyMaxBooks) {
		this.maxBooks = anyMaxBooks;
	}
	public String toString() {
		return this.getName() + " (" + this.getMaxBooks() + " books)";
	}
	
	// main
	/*public static void main(String []args){
		System.out.println("hello");		
	}
	*/
}