/**
 * 
 */
package battleshipGame;

import java.util.Scanner;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 * 
 * This is the main class of the Battleship Game.
 */
public class BattleshipGame {

	/**
	 * Constructs a new BattleshipGame for the current game.
	 */
	public BattleshipGame() {
		// TODO Auto-generated constructor stub
		Ocean warZone 	= new Ocean();
	}//end of BattleshipGame constructor method.

	/**
	 * This is the main method of the Battleship Game.
	 * Creates a new instance of the Ocean class.
	 * Prints instructions for the user
	 * Accepts shots from the user (Prompts the user for input).
	 * Displays statistical information or results.
	 * Prints final scores.
	 * Asks the user if he/she wants to play again.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Scanner variable to accept user input
		Scanner input 	= new Scanner(System.in);
		String guess 	= input.nextLine();
		checkGuess(guess);
		input.close();

	}//end of main method.
	
	public static String checkGuess(String playerGuess){
		String result = "";
		int guess 	= 	0;
		guess		=	Integer.parseInt(playerGuess);
		
		for(int i = 0; i > guess; i++){
			
		}
		return result;
	}
	
	

}
