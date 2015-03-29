/**
 * 
 */
package battleshipGame;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Ocean {
	
	/**
	 * Can be used to determine which ship is in any given location.
	 */
	Ship[][] ships = new Ship [10][10];
	
	/**
	 * The total number of shots fired by the user
	 */
	int shotsFired = 0;
	
	/**
	 * The number of times a shot hit the ship.
	 * 
	 * <p> If the user shoots the same part of a ship more than once, 
	 * every hit is counted, even though the additional <i>hits</i>
	 * don't do the user any good.
	 */
	int hitCount = 0;
	
	/**
	 * Counts the number of ships sunk. There should be 10 ships in total.
	 */
	int shipsSunk = 0;

	/**
	 * Constructs a new Ocean for the current game.
	 */
	public Ocean() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the shotsFired (in this game)
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * @param shotsFired the shotsFired to set
	 */
	public void setShotsFired(int shotsFired) {
		this.shotsFired = shotsFired;
	}

	/**
	 * @return the hitCount (in this game)
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * @param hitCount the hitCount to set
	 */
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

	/**
	 * @return the shipsSunk (in this game)
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}

	/**
	 * @param shipsSunk 
	 */
	public void setShipsSunk(int shipsSunk) {
		this.shipsSunk = shipsSunk;
	}
	
	void placeAllShipsRandomly(){
		// TODO
	}
	
	/**
	 * @param row
	 * @param column
	 * @return
	 */
	boolean isOccupied(int row, int column){
		// TODO
		return false;
	}
	
	/**
	 * @param row
	 * @param column
	 * @return
	 */
	boolean shootAt(int row, int column){
		// TODO
		
		return false;	
	}
	
	/*Ship[][] getShipArray(){
		// TODO - perhaps have in test class only
	}*/
	
	/**
	 * Prints the Ocean.
	 * 
	 * <p> Displays the ocean grid of 10 rows and 10 columns
	 * with column numbers running from 0 to 9 at the top from left to right and
	 * row numbers running from 0 to 9 running down the left from top to bottom 
	 * of the grid.
	 * 
	 * <p>Uses the character 'S' to indicate a location where a (real) ship has been hit.
	 * Uses the character '-' to indicate the location of a shot fired where 
	 * no part of any ship is located. Uses the character 'x' to indicate the 
	 * location of a sunken ship. Uses the character '.' to indicate a location not fired upon.
	 * 
	 */
	void print(){
		
	}

}
