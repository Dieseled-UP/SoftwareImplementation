package tests;

import people.Person;

public class PersonTester {

	public static void main(String [] args) {

		Person dave = new Person();
		Person sue = new Person("Sue", 24);

		System.out.println(dave.toString());
		System.out.println(sue.toString());
	}
}
