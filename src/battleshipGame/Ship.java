/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy (g.m.murphy@live.co.uk)
 * @version 1.0
 * @since   2014-12-14
 */

public class Ship {

	/**
	 * Constructor not required or provided here. Uses default Java Constructor.
	 */

	/**
	 * Is the row which contains the bow (front) of any <code>Ship</code>
	 */
	int bowRow = 0; 
	/**
	 * Is the column which contains the bow (front) of any <code>Ship</code>
	 */
	int bowColumn = 0;
	/**
	 * Designates the number of squares occupied by the <code>Ship</code>
	 * An "empty sea" location has length 1
	 * 
	 */
	int length = 1;

	/**
	 * Tells whether a ship is horizontal or vertical. 
	 * True for horizontal. False otherwise.
	 */
	boolean horizontal = true; 
	
	String shipType = "";
	

	/**
	 * Tells whether a part of a ship has been hit.
	 * <p> a <code>Battleship</code> use all 4 locations
	 * <p> a <code>Cruiser</code> uses the first 3 locations
	 * <p> a <code>Destroyer</code> uses the first 2 locations
	 * <p> a <code>Submarine</code> uses the first location
	 * <p> <i>'Empty Sea'<\i> uses the first location or uses none.
	 */
	boolean[] hit = new boolean[4];

	
	/**
	 * @return the bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}

	/**
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}

	/**
	 * @return the length of Ship instance. 
	 * <p>This method exists only to be overridden, so it
	 *         doesn't matter what it returns.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @return true if the <code>Ship</code> instance is horizontal.
	 */
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * @param bowRow
	 *            the bowRow to set
	 */
	
	String getShipType(){
		return shipType;
	}
	
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}

	/**
	 * @param bowColumn
	 *  sets the value of bowColumn
	 */
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}

	/**
	 * @param length 
	 *            the length to set the number of squares occupied by the ship
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @param horizontal
	 *            - Sets the value of the instance variable 'horizontal'
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	/**
	 * Instance methods
	 */

	/**
	 * Returns true if it is okay to put a ship in this location. 
	 * 
	 * <p> The method does not change either the ship or the Ocean. 
	 * It only signals whether it is legal to do so.
	 * 
	 * <p> The ship must not overlap another ship, or touch another ship 
	 * (vertically, horizontally, or diagonally), 
	 * and it must not <i>stick out</i> beyond the array.
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 * @return
	 */
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		boolean isOK = true;
		return isOK;
	}

	/**
	 * <i>Puts</i> the ship in the Ocean
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 */
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {

	}

	/**
	 * Marks part of this ship as hit
	 * 
	 * <p> If a part of the ship occupies the given row and column,
	 * and the ship hasn't been sunk, mark that part of the ship as <i>hit</i>
	 * and return true, otherwise return false.
	 * @param row
	 * @param column
	 * @return
	 */
	boolean shootAt(int row, int column){

		return true; 		
	}

	/**
	 * Returns true if every part of the ship has been hit, false otherwise.
	 * 
	 * @return
	 */
	boolean isSunk(){
		return true;
	}
}
