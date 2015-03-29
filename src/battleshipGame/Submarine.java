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
	 * 
	 */
	public Submarine() {
		// TODO Auto-generated constructor stub
		length = 1;
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
