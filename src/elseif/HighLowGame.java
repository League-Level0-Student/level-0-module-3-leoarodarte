//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		for(int i=0; i<11; i++) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window,  save their response 
String r=JOptionPane.showInputDialog("Guess a number bettween 1 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(r);
			// 5. if the guess is correct
			if(guess==random) {
				JOptionPane.showMessageDialog(null, "You win!");
				System.exit(0);
			}
			
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if(guess>random) {
		JOptionPane.showMessageDialog(null, "Too high!");
		JOptionPane.showMessageDialog(null, "You Lose!");
		
	}
// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
			else if(guess<random) {
		JOptionPane.showMessageDialog(null, "Higher!");
		JOptionPane.showMessageDialog(null, "You Lose!");
		// 13. Tell them they lose
		
	
	
}
		}
}
}
