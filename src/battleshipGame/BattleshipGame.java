/**
 * 
 */
package battleshipGame;

import java.util.Scanner;

/**
 * @author  Gary Murphy
 * @version 1.0
 * @since   2014-12-14
 * @date	2015-03-29
 * 
 * This is the main class of the Battleship Game.
 */
public class BattleshipGame {

	/**
	 * This is the main method of the Battleship Game.
	 * Creates a new instance of the Ocean class.
	 * Prints instructions for the user
	 *
	 */
	public static void main(String[] args) {
		Ocean ocean = new Ocean();

        ocean.placeAllShipsRandomly();

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Battleship Game!");

        while (!ocean.isGameOver()) {

            System.out.print("Enter row: ");

            int row = input.nextInt();
            System.out.print("Enter column: ");

            int column = input.nextInt();

            if (row >= 0 && row <= 9 && column >= 0 && column <= 9) {

                if (ocean.shootAt(row, column)) {
                    System.out.println("\nHIT");
                }
                else {
                    System.out.println("\nMISS");
                }

                ocean.print();
                System.out.println();
            }
            else {
                System.out.println("\nPlease enter values between 0-9");
            }
        }

        System.out.println("GAME OVER");

        ocean.print();
        input.close();

    }//end of main method.
}
