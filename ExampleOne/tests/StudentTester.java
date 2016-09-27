package tests;

import java.util.ArrayList;

import people.Address;
import people.Person;
import people.Student;

public class StudentTester {

	public static void main(String [] args) {

		/* 
		 * We can create new Student objects.
		 * The Student constructors set the the name, age, and address through
		 * the parent class
		 */
		Student dave = new Student("Dave", 32, new Address("24", "Rocky View", "Enniscorthy", "Wexford"), "l00123456");
		Student sue = new Student("Sue", 24, new Address("3600", "Prospect Street", "Tallaght", "Dublin"), "l007812324");
		
		// Print out the Student objects
		System.out.println(dave.toString());
		System.out.println(sue.toString() + "\n\n");
		
		// To further show how Inheritance works lets create another Person
		Person paul = new Person("Paul", 22, new Address("112", "Ocean Avenue", "Ballyhauns", "Meath"));
		
		// Create a new ArrayList for the Person class
		ArrayList<Person> people = new ArrayList<Person>();
		
		/**
		 * Now lets add the new Person object 'paul' to the List.
		 * Add because The Student object 'sue' is a child class of
		 * Person we can also add it to the List.
		 */
		people.add(paul);
		people.add(sue);
		
		// We can display all the objects in the List through a foreach statement
		for (Person person : people) {
			
			System.out.println(person.toString());
		}
	}
}
