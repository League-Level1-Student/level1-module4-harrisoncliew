package fortune_teller;
import javax.swing.JOptionPane;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random r = new Random();
		int hi = r.nextInt(4);

	// 3. Print out this variable
		System.out.println(hi);

	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Enter a yes or no question in the box below.");

	// 5. If the random number is 0
		if(hi==0) {
			JOptionPane.showMessageDialog(null, "Yes.");
		}

	// -- tell the user "Yes"

	// 6. If the random number is 1
		else if(hi==1) {
			JOptionPane.showMessageDialog(null, "No.");
		}

	// -- tell the user "No"

	// 7. If the random number is 2
		else if(hi==2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
		}

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		else if(hi==3) {
			JOptionPane.showMessageDialog(null, "You will die.");
		}

	// -- write your own answer
	}
}
