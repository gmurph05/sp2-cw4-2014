/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */
public class Cruiser extends Ship{

	
	/**
	 * Constructs a new Cruiser for the current game.
	 */
	public Cruiser() {
		// Sets the length of this ship which identifies the ship type.
		length = 3;
		for(int i = 0; i < hit.length; i++) {
			hit[i] = false;
		}
	}//end of Cruiser constructor method.

	/* (non-Javadoc)
	 * @see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		// TODO Auto-generated method stub
		return "cruiser";
	}//end of getShipType method.

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}//end of toString method.

}
