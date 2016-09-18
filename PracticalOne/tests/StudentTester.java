package tests;

import java.util.ArrayList;

import people.Person;
import people.Student;

public class StudentTester {

	public static void main(String [] args) {

		Student dave = new Student();
		Student sue = new Student("Sue", 24, "l007812324");
		
		Person paul = new Person("Paul", 22);
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(paul);
		people.add(sue);

		System.out.println(dave.toString());
		System.out.println(sue.toString());
		
		for (Person person : people) {
			
			System.out.println(person);
		}
	}
}
