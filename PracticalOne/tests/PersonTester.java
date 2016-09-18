package tests;

import people.Address;
import people.Person;

public class PersonTester {

	public static void main(String [] args) {

		/* 
		 * We can create new Person objects,
		 * Here is one set with null values and another
		 * set with a name and an age
		 */
		Person dave = new Person("Dave", 32, new Address("1", "Port Road", "Letterkenny", "Donegal"));
		Person sue = new Person("Sue", 24, new Address("Nakatomi Plaza", "Main Street", "Galway", "Galway"));

		/*
		 * Here we can print out the details of each Person
		 */
		System.out.println(dave.toString());
		System.out.println(sue.toString());
		
		/*
		 * Now that we have added our Address class we can now
		 * test how Composition works
		 */
		
		// We create a new Person with a new Address
		Person jason = new Person("Jason", 25, new Address("10", "Cloverfield", "Letterkenny", "Donegal"));
		
		// If we print out the Person we also get their address
		System.out.println(jason.toString());
		
		// Lets test our equals method
		System.out.println(sue.equals(jason));
	}
}
