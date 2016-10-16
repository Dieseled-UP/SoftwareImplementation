package tests;

import java.util.ArrayList;

import date.Date;

public class DateTester {

	public static void main(String[] args) {

		// Create an ArrayList of Date objects
		ArrayList<Date> dates = new ArrayList<>();

		// Add new Date objects
		dates.add(new Date(3, 6, 1989));
		dates.add(new Date(18, 2, 2001));
		dates.add(new Date(25, 10, 1995));
		dates.add(new Date(3, 6, 1989));

		// Test all getter and setter methods
		System.out.println(dates.get(0).getDay());
		System.out.println(dates.get(1).getMonth());
		System.out.println(dates.get(2).getYear());

		dates.get(1).setDay(2);
		System.out.println(dates.get(1).getDay());

		dates.get(2).setMonth(4);
		System.out.println(dates.get(2).getMonth());

		dates.get(2).setYear(2000);
		System.out.println(dates.get(2).getYear());

		// Check for errors and deal with them
		try {

			dates.get(1).setDay(30);
		} catch (IllegalArgumentException e) {

			System.err.println("Please enter a valid day");
		}
		System.out.println(dates.get(1).getDay());

		// If exceptions are not dealt with correctly the program crashes out
		dates.get(1).setMonth(14);
		System.out.println(dates.get(1).getMonth());

		// Test the equals method
		System.out.println(dates.get(0).equal(dates.get(3)));
		System.out.println(dates.get(0).equal(dates.get(1)));

	}

}
