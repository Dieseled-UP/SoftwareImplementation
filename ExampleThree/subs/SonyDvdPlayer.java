package subs;

import interfaces.DvdPlayer;
import main.ElectricProduct;

public class SonyDvdPlayer extends ElectricProduct implements DvdPlayer {
	
	/**
	 * In this example we show how Java OOP really
	 * can work using Inheritance, abstraction, and
	 * interfaces 
	 */
	
	/**
	 * When we finally create a sub-class we must
	 * include all inherited functions.  These functions
	 * can then be implemented to suit the class. You can
	 * now see how we can take a large problem and break it
	 * down into smaller reusable classes/tasks
	 */
	
	/**
	 * Default constructor with default values
	 */
	public SonyDvdPlayer() {
		
		this.productNumber = "L009RT";
		this.manufactureNumber = "Q678TY";
		this.ampage = 13;
	}
	
	/**
	 * User defined constructor
	 * @param productNumber
	 * @param manufactureNumber
	 * @param ampage
	 */
	public SonyDvdPlayer(String productNumber, String manufactureNumber, int ampage) {
		
		this.productNumber = productNumber;
		this.manufactureNumber = manufactureNumber;
		this.ampage = ampage;
	}
	
	/**
	 * Functions that can be overridden with your own
	 * implementation
	 */

	@Override
	public boolean loadDvd(String dvdName) {
		return false;
	}

	@Override
	public boolean eject() {
		return false;
	}

	@Override
	public boolean play() {
		return false;
	}

	@Override
	public boolean pause() {
		return false;
	}

	@Override
	public boolean stop() {
		return false;
	}

	@Override
	public boolean rewind() {
		return false;
	}

	@Override
	public boolean fastForward() {
		return false;
	}

	@Override
	public boolean plugedIn() {
		return false;
	}	
}
