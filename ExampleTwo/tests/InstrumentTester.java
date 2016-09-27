package tests;

import subs.BassGuitar;
import subs.ElectricGuitar;

public class InstrumentTester {

	public static void main(String[] args) {

		// Create a ElectricGuitar object and a BassGuitar
		ElectricGuitar electricGuitar = new ElectricGuitar();
		BassGuitar bassGuitar = new BassGuitar();
		
		// Play the default message
		electricGuitar.play();
		bassGuitar.play();
		
		// Create new objects that have their own names
		electricGuitar = new ElectricGuitar("Fender", 5);
		bassGuitar = new BassGuitar("Hagstrom", 4);
		
		// Play the message again
		electricGuitar.play();
		bassGuitar.play();
	}

}
