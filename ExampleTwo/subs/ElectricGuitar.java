package subs;

import main.StringedInstrument;

public class ElectricGuitar extends StringedInstrument {

	/**
	 * Default constructor
	 */
	public ElectricGuitar() {
		this.name = "Guitar";
		this.numberOfStrings = 6;
	}
	
	public ElectricGuitar(String name, int numberOfStrings) {
		
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
		
		System.out.println("An electric " + numberOfStrings + "-string " + name
                + " is rocking!");
	}

}
