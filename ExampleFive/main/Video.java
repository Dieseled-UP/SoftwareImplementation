package main;

import java.io.Serializable;
import java.util.Scanner;

public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	private String vidNumber;
	private String vidTitle;
	private String vidCategory;
	private String vidRentalCost;

	/**
	 * Default constructor
	 */
	public Video() {

		this(null, null, null, null);
	}

	/**
	 * User defined constructor
	 * 
	 * @param number
	 * @param title
	 * @param category
	 * @param rentalCost
	 */
	public Video(String vidNumber, String vidTitle, String vidCategory, String vidRentalCost) {

		this.vidNumber = vidNumber;
		this.vidTitle = vidTitle;
		this.vidCategory = vidCategory;
		this.vidRentalCost = vidRentalCost;
	}

	/**
	 * @return the vidNumber
	 */
	public String getVidNumber() {

		return vidNumber;
	}

	/**
	 * @param vidNumber
	 *            the vidNumber to set
	 */
	public void setVidNumber(String vidNumber) {

		this.vidNumber = vidNumber;
	}

	/**
	 * @return the vidTitle
	 */
	public String getVidTitle() {

		return vidTitle;
	}

	/**
	 * @param vidTitle
	 *            the vidTitle to set
	 */
	public void setVidTitle(String vidTitle) {

		this.vidTitle = vidTitle;
	}

	/**
	 * @return the vidCategory
	 */
	public String getVidCategory() {

		return vidCategory;
	}

	/**
	 * @param vidCategory
	 *            the vidCategory to set
	 */
	public void setVidCategory(String vidCategory) {

		this.vidCategory = vidCategory;
	}

	/**
	 * @return the vidRentalCost
	 */
	public String getVidRentalCost() {

		return vidRentalCost;
	}

	/**
	 * @param vidRentalCost
	 *            the vidRentalCost to set
	 */
	public void setVidRentalCost(String vidRentalCost) {

		this.vidRentalCost = vidRentalCost;
	}

	/**
	 * Method to create a video menu to add details of a video
	 * which then gets added to the ArrayList
	 */
	public void read() {

		@SuppressWarnings("resource")
		Scanner kbString = new Scanner(System.in);

		System.out.println("VIDEO DETAILS ==>");
		System.out.print("NUMBER : ");
		vidNumber = kbString.nextLine();
		System.out.print("TITLE : ");
		vidTitle = kbString.nextLine();
		System.out.print("CATEGORY : ");
		vidCategory = kbString.nextLine();
		System.out.print("RENTAL COST : ");
		vidRentalCost = kbString.nextLine();
	}

	/**
	 * Method to check if to video objects are the same
	 * 
	 * @param videoIn
	 * @return boolean
	 */
	public boolean equals(Video videoIn) {

		return (videoIn.vidNumber.equalsIgnoreCase(this.vidNumber) && videoIn.vidTitle.equalsIgnoreCase(this.vidTitle)
				&& videoIn.vidCategory.equalsIgnoreCase(this.vidCategory) && videoIn.vidRentalCost.equalsIgnoreCase(this.vidRentalCost));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Video [vidNumber=" + vidNumber + ", vidTitle=" + vidTitle + ", vidCategory=" + vidCategory + ", vidRentalCost=" + vidRentalCost + "]";
	}

}
