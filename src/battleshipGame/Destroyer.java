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
		// TODO Auto-generated constructor stub
		length = 2;
	}

	/* (non-Javadoc)
	 * @see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		// TODO Auto-generated method stub
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
