package interfaces;

public interface DvdPlayer {
	
	/**
	 * In this example we show how Java OOP really
	 * can work using Inheritance, abstraction, and
	 * interfaces 
	 */
	
	/**
	 * As explained in the lectures all DVD players
	 * run the same basic functions, to ensure that this
	 * behavior is implemented across to all DVD players
	 * we produce this interface. Of course this is just
	 * a blueprint the functions themselves are implemented
	 * in the sub-class
	 */

	boolean loadDvd(String dvdName);
	
	boolean eject();
	
	boolean play();
	
	boolean pause();
	
	boolean stop();
	
	boolean rewind();
	
	boolean fastForward();
}
