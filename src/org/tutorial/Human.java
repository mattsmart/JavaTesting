package org.tutorial;

public class Human {
	
	// some fields
	private String name; // give your human a name
	private int age;
	
	// constructor
	public Human () {
		name = "unkown name";
		age = 7;
	}
	
	// methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String anyName) {
		this.name = anyName;
	}
	public void setAge(int anyAge) {
		this.age = anyAge;
	}
	
	// main
	/*public static void main(String []args){
		System.out.println("hello");		
	}
	*/
}