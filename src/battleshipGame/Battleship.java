/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Battleship extends Ship{
	
	/**
	 * Constructs a new Battleship for the current game.
	 */
	public Battleship() {
		// Sets the length of this ship which identifies the ship type.
		length = 4;	
		for(int i = 0; i < hit.length; i++) {
			hit[i] = false;
		}
	}

	/**	(non-Javadoc)
	 * 	@see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		return "Battleship";
	}

	/** (non-Javadoc)
	 * 	@see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO write the proper code!
		String oceanLocationDisplay = new String();
		int x = 10;
		int y = 10;
		
		//Displays "S" for location user has fired upon and hit.
		if(shootAt(x, y)){oceanLocationDisplay = "S";}
		
		//Displays "-" for location user has fired upon but missed.
		if(shootAt(x, y)){oceanLocationDisplay = "-";}
		
		//Displays "." for location user has never fired upon.
		if(shootAt(x, y)){oceanLocationDisplay = ".";}
		
		return oceanLocationDisplay;
	}

}
