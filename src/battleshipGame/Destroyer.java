/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Destroyer extends Ship{

	/**
	 * Constructs a new Destroyer for the current game.
	 */
	public Destroyer() {
		// Sets the length of this ship which identifies the ship type.
		length = 2;
		for(int i = 0; i < hit.length; i++) {
			hit[i] = false;
		}
	}

	/* (non-Javadoc)
	 * @see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		return "destroyer";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
