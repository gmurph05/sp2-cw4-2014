/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Submarine extends Ship {

	/**
	 * Constructs a new Submarine for the current game.
	 */
	public Submarine() {
		// Sets the length of this ship which identifies the ship type.
		length = 1;
		for(int i = 0; i < hit.length; i++) {
			hit[i] = false;
		}
	}

	/* (non-Javadoc)
	 * @see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		// TODO Auto-generated method stub
		return "submarine";
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
