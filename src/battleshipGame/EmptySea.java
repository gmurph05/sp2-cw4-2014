/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class EmptySea extends Ship{
	
	/**
	 * Constructs a new EmptySea location for the current game.
	 */
	public EmptySea() {
		// TODO Auto-generated constructor stub
		length = 0;
	}

	/* (non-Javadoc)
	 * Overrides shootAt(int row, int column) inherited from Ship
	 * and always returns false indicating nothing was hit.
	 * @see battleshipGame.Ship#shootAt(int, int)
	 */
	@Override
	boolean shootAt(int row, int column) {
		// TODO Auto-generated method stub
		return super.shootAt(row, column);
	}

	/* (non-Javadoc)
	 * Overrides isSunk inherited from Ship, and always returns false
	 * indicating nothing has been sunk.
	 * @see battleshipGame.Ship#isSunk()
	 */
	@Override
	boolean isSunk() {
		// TODO Auto-generated method stub
		return super.isSunk();
	}

	/* (non-Javadoc)
	 * Overrides the toString method from Java's Object superclass
	 * to return a single character String to be used in the Ocean's print method.
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
