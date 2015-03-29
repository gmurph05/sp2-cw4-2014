/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Ship {

	/**
	 * Constructor not required or provided here. Uses default Java Constructor.
	 */

	//start of instance variables
	
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
	
	//end of instance variables

	//start of getters
	/**
	 * Gets the front location of a horizontally placed <code>Ship</code> instance.
	 * @return the bowRow 
	 */
	public int getBowRow() {
		return bowRow;
	}

	/**
	 * Gets the front location of a vertically placed <code>Ship</code> instance.
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}

	/**
	 * This method exists only to be overridden, so it doesn't matter what it returns.
	 * An abstract ship does not have a fixed length.
	 * @return the length of this particular <code>Ship</code>. 
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Checks if <code>Ship</code> instance is horizontal.
	 * @return true if the <code>Ship</code> instance is horizontal.
	 */
	public boolean isHorizontal() {
		return horizontal;
	}


	/**
	 * This method exists only to be overridden, so it does not matter what it returns.
	 * @return shipType
	 */
	String getShipType(){
		return shipType;
	}
	//end of getters
	
	
	//start of setters
	/**
	 * Sets the grid location value of the bowRow (the front of the horizontal ship).
	 * 
	 * @param bowRow        
	 */
	public void setBowRow(int bowRow) {
		this.bowRow = bowRow;
	}

	/**
	 * Sets the grid location value of bowColumn(the front of the vertical ship).
	 * 
	 * @param bowColumn
	 */
	public void setBowColumn(int bowColumn) {
		this.bowColumn = bowColumn;
	}

	/**
	 * Sets the number of squares occupied by the ship.
	 * @param length 
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Sets the value of the instance variable 'horizontal'.
	 * @param horizontal
	 */
	public void setHorizontal(boolean horizontal) {
		if(horizontal){
			this.horizontal = horizontal;
		}else{
			this.horizontal = true;
		}
		
	}
	//end of setters
	
	
	//start of instance methods
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
		boolean isOK = false;
		for(int i = 0; i < ocean.ships.length; i++)
			for(int j = 0; j < ocean.ships[i].length; j++){
				if(!ocean.isOccupied(row, column)){
					isOK = true;
				}else{
					isOK = false;
				}
			}
		return isOK;
	}

	/**
	 * <i>Puts</i> the ship in the Ocean.
	 * 
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 */
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		if(okToPlaceShipAt(row, column, horizontal, ocean)){
			if(ocean.ships.length < 5){
				
			}
			
		}
		
		

	}

	/**
	 * Marks part of this ship as 'hit'.
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
		boolean sunk = false;
		for(int i = 0; i < this.getShipType().length();){
			if(hit[i] == true){
				return !sunk;
			}else{
				return sunk;
			}
		}
		return sunk;
	}//end of isSunk method
	
	//end of instance methods
}//end of Ship class.

