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
		// TODO Auto-generated constructor stub
		length = 3;
	}

	/* (non-Javadoc)
	 * @see battleshipGame.Ship#getShipType()
	 */
	@Override
	String getShipType() {
		// TODO Auto-generated method stub
		return "cruiser";
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
