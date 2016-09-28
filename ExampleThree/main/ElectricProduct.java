package main;

public abstract class ElectricProduct extends Product {
	
	/**
	 * In this example we show how Java OOP really
	 * can work using Inheritance, abstraction, and
	 * interfaces 
	 */
	
	/**
	 * In this class we extend the product class and
	 * decide what type of product we are dealing with.
	 * In this case we are going to produce an electrical device
	 */

	protected int ampage;
	
	public abstract boolean plugedIn();
}
