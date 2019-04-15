package com.neuedu.printer;

public class Person {

	public static void main(String[] args) {
		Person person = new Person();
		
		Printer blackWhitemachine = new Colorful();
		
		blackWhitemachine.print();
		
		person.print(blackWhitemachine);
		
	}
	public void print(Printer p) {
		p.print();
	}
}
