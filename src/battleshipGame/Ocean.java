/**
 * 
 */
package battleshipGame;

import java.util.Random;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 */

public class Ocean {
	//start of variables
	/** Ocean row and column sizes defined here only.*/
	final int ROWS = 10;
	final int COLS = 10;
			
	/**
	 * Used to determine which ship is in any given location.
	 */
	Ship[][] ships = new Ship [ROWS][COLS];
	
	/**
	 * Generates fleet of required ship types.
	 */
	private Ship[] shipsToPlace = {
		//Ship[0] = 
			new Battleship(),
		//Ship[1] = 
			new Cruiser(),
		//Ship[2] = 
			new Cruiser(),
		//Ship[3] = 
			new Destroyer(),
		//Ship[4] = 
			new Destroyer(),
		//Ship[5] = 
			new Destroyer(),
		//Ship[6] = 
			new Submarine(),
		//Ship[7] = 
			new Submarine(),
		//Ship[8] = 
			new Submarine(),
		//Ship[9] = 
			new Submarine()
	};
											
	
	/**
	 * The total number of shots fired by the user.
	 * This number is incremented by 1 in the current <code>BattleshipGame</code> 
	 * every time the user takes a shot (provides valid input).
	 */
	int shotsFired = 0;
	
	/**
	 * The number of times a shot hit a <code>Ship</code>.
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
	
	//END of variables

	/**
	 * Constructs a new Ocean for the current game.
	 * This contains a 10x10 array of ships, representing the "ocean".
	 */
	public Ocean() {
		
		EmptySea e = new EmptySea();
		
		// variable used to label rows
		int rowNum = 0;								
		System.out.printf("%-1s","");
		for(int i = 0; i < ships.length; i++){
			System.out.print(" " + i);
		}
		System.out.println();
		for(int i = 0; i < ships.length; i++){
			System.out.print(rowNum);
			for(int j = 0; j < ships[i].length; j++ ){
				ships[i][j] = e;
				System.out.print(" " + ships[i][j]);
			}
			//end of inner for loop populating columns
			System.out.println();
			rowNum++;
		}//end of outer for loop incrementing rows
		 	
		this.shipsSunk = 0;
		this.shotsFired = 0;
		this.hitCount = 0;
		
		placeAllShipsRandomly();
		
	}

	/**
	 * @return the shotsFired (in this game)
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * @return the hitCount (in this game)
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * @return the shipsSunk (in this game)
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}
	
	/**
	 * Checks if all <code>Ships</code> are sunk.
	 * @return true if all <code>Ships</code> are sunk. 
	 */
	boolean isGameOver(){
		if(getShipsSunk() == 10){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Places all ten ships randomly on the (initially empty) <code>Ocean</code>.
	 * 		Places larger ships before smaller ones.
	 */
	void placeAllShipsRandomly(){
		
		Random random = new Random();
		int row, col;

		for(int i = 0; i < shipsToPlace[i].length; i++){
			for(int j = 0; j < shipsToPlace[i].length; j++){
				row = random.nextInt(10);
				col = random.nextInt(10);
				if(!isOccupied(i,j)){
					ships[i][j] = shipsToPlace[i].getBowColumn();
				}else{
					
				}//end of if conditional statement
			}//end of inner for loop (columns)
		}//end of outer for loop (rows)	
	}//end of placeAllShipsRandomly method
	
	
	/**
	 * Checks to see if given location contains a ship.
	 * @param row
	 * @param column
	 * @return true if locations contains a ship. False otherwise.
	 */
	boolean isOccupied(int row, int column){
		Ship[][] checked = new Ship[ROWS][COLS];
		boolean occupiedResult = true;
		
		//populate the checked array with EmptySea objects
		for(int i = 0; i < checked.length; i++){
			for(int j = 0; j < checked[i].length; j++ ){
				checked[i][j] = new EmptySea();
			}
		}
		
		if(this.ships[row][column] != checked[row][column]){
			occupiedResult = true; // grid location IS occupied
		}else{
			occupiedResult = false; //grid location NOT occupied
		}
		return occupiedResult;	
	}//end of isOccupied method
	
	/**
	 * Checks if user location contains part of a real <code>Ship</code>.
	 * Updates the <code>shotsFired</code> value by 1 for every shot fired.
	 * Updates the <code>hitCount</code> value by 1 for every hit on a real ship,
	 * 				regardless of whether the location was hit before.
	 * @param row
	 * @param column
	 * @return true if the given location contains a part of any type of <code>Ship</code>
	 * except the <code>EmptySea</code> ship type. it returns
	 */
	boolean shootAt(int row, int column){
		boolean result = false;
		for(int shipRow = 0; shipRow < ships.length; shipRow++){
			for(int shipCol = 0; shipCol < ships[shipRow].length; shipCol++){
				if(isOccupied(row,column) && ships[row][column].toString() != "x"){
					hitCount++;
					result = true;
				}else{
					result = false;
				}
			}
		}
		shotsFired++;
		return result;	
	}
	
	Ship[][] getShipArray(){
		// TODO - perhaps have in test class only
		return ships;
	}
	
	/**
	 * Prints the Ocean.
	 * 
	 * <p>  Displays the ocean grid of (default) 10 rows and 10 columns
	 * 		with column numbers from 0 to 9 from left to right at the top and
	 * 		row numbers running from 0 to 9 from top to bottom no the left side
	 * 		of the grid.
	 * 	
	 * <p>	Uses the character 'S' to indicate a location where a (real) ship has been hit.
	 * 		Uses the character '-' to indicate the location of a shot fired where 
	 * 						  	   no part of any ship is located. 
	 * 		Uses the character 'x' to indicate the location of a sunken ship. 
	 * 		Uses the character '.' to indicate a location not fired upon.
	 * 
	 */
	void print(){
		//TODO print the ocean board
		System.out.println(ships);
	}

}//end of Ocean class.
