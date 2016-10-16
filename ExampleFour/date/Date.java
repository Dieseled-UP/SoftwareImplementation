package date;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Date {

	private int day;
	private int month;
	private int year;

	/**
	 * create 2 sets one for the months that contain 30 days and one for the
	 * months that contain 31 days
	 */
	private final Set<Integer> MONTHS30 = new HashSet<>(Arrays.asList(4, 6, 9, 11));
	private final Set<Integer> MONTHS31 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

	// variable for comparison
	private final int FEB = 2;

	/**
	 * Default constructor setting all values to 0/null
	 */
	public Date() {
		this(0, 0, 0);
	}

	/**
	 * Constructor with user set variables
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {

		if (errorCheck(day, month, year)) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	/**
	 * @param day
	 *            the day to set
	 */
	public void setDay(int day) {

		int previousDay = this.day;

		if (checkDay(day)) {
			this.day = day;
		}

		this.day = previousDay;
	}

	/**
	 * Method to get the day as an integer value
	 * 
	 * @return day
	 */
	public int getDay() {

		return day;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(int month) {

		int previousMonth = this.month;

		if (checkMonth(month)) {
			this.month = month;
		}

		this.month = previousMonth;
	}

	/**
	 * Method to get the month as an integer value
	 * 
	 * @return month
	 */
	public int getMonth() {

		return month;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {

		if (checkYear(year)) {
			this.year = year;
		}
	}

	/**
	 * Method to get the year as an integer value
	 * 
	 * @return year
	 */
	public int getYear() {

		return year;
	}

	/**
	 * Method to check that the dates are entered correctly
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return boolean
	 */
	public boolean errorCheck(int day, int month, int year) {

		return checkYear(year) || checkMonth(month) || checkDay(day);
	}

	/**
	 * Method to check that the year is valid
	 * 
	 * @param year
	 * @return boolean
	 */
	public boolean checkYear(int year) throws IllegalArgumentException {

		// First check that the year is valid
		if (year < 1870 || year > 2016) {

			// We now have our methods throwing an exception that must
			// be dealt with when we use them in our classes
			throw new IllegalArgumentException("Sorry invalid entry for year\nPlease select again");
		}

		return true;
	}

	/**
	 * Method to check that the month is valid
	 * 
	 * @param month
	 * @return boolean
	 */
	public boolean checkMonth(int month) throws IllegalArgumentException {

		// Then check that the month is correct
		if (month < 1 || month > 12) {

			// We now have our methods throwing an exception that must
			// be dealt with when we use them in our classes
			throw new IllegalArgumentException("Sorry invalid entry for month\nPlease select a date between 1 - 12");
		}

		return true;
	}

	/**
	 * Method to check that the day is valid
	 * 
	 * @param day
	 * @return boolean
	 */
	public boolean checkDay(int day) throws IllegalArgumentException {

		// We need to check that we have the right amount of days in February
		if (month == FEB) {

			if (day < 1 || day > 28) {

				// We now have our methods throwing an exception that must
				// be dealt with when we use them in our classes
				throw new IllegalArgumentException("Sorry invalid entry for day\nPlease select again");
			}

			return true;

		} else if (MONTHS30.contains(month)) {

			// This checks that the all months with 30 days is correct
			if (day < 1 || day > 30) {

				// We now have our methods throwing an exception that must
				// be dealt with when we use them in our classes
				throw new IllegalArgumentException("Sorry invalid entry for day\nPlease select again");
			}

			return true;

		} else if (MONTHS31.contains(month)) {

			// This checks that the all months with 31 days is correct
			if (day < 1 || day > 31) {

				// We now have our methods throwing an exception that must
				// be dealt with when we use them in our classes
				throw new IllegalArgumentException("Sorry invalid entry for day\nPlease select again");
			}

			return true;

		}

		return false;
	}

	/**
	 * Method to compare two Date objects
	 * 
	 * @param date
	 * @return boolean
	 */
	public boolean equal(Date date) {

		return date.day == day && date.month == month && date.year == year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]\n";
	}
}
