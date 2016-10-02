package main;

public abstract class StringedInstrument extends Instrument {

	/**
	 * We create another class called StringedInstrument
	 * which extends an Instrument because a StringInstrument 'is a'
	 * Instrument.
	 * This contains one variable the number of strings that
	 * the instrument has. We set the 'name' variable to protected this allows
	 * sub-classes access.
	 */
	protected int numberOfStrings;
}
