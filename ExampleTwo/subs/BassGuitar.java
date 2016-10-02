package subs;

import main.StringedInstrument;

public class BassGuitar extends StringedInstrument {

	/**
	 * Default constructor
	 */
	public BassGuitar() {
		this.name = "Bass";
		this.numberOfStrings = 4;
	}
	
	/**
	 * The loaded constructor will take user input
	 * @param name
	 * @param numberOfStrings
	 */
	public BassGuitar(String name, int numberOfStrings) {
		
		this.name = name;
		this.numberOfStrings = numberOfStrings;
	}
	
	/**
	 * The play method must be overridden from the
	 * Instrument class. Even though ElectricGuitar does
	 * not extend Instrument directly the StringedInstrument
	 * class does.
	 */
	@Override
	public void play() {
		
		System.out.println("A bass " + numberOfStrings + "-string " + name
               + " is rocking!");
	}

}
