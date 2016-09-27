package main;

public abstract class Instrument {

	/**
	 * In this class we have a variable 'name'
	 * that will be used for naming an instrument.
	 * We set the 'name' variable to protected this allows
	 * sub-classes access.
	 */
	protected String name;
	
	/**
	 * Also there is one abstract method that must be
	 * used by any sub-classes
	 */
	public abstract void play();
}
