package controlFlow;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ifElseEx {

	public static void main(String[] args) {
		/*Using an if else statement, get the user to input a value into the Console.  
		After the user has entered a value, display whether the number is between 1 and 10, between 11 and 20, between 21 and 30, 
		between 31 and 40, between 41 and 50, over 50 or some other number.*/
		
		JFrame frame = new JFrame("Enter a numbers");
		JOptionPane input =new JOptionPane();
		
		String enteredNumber = input.showInputDialog(frame, "Enter a whole number");
		int value = Integer.parseInt(enteredNumber);
		
		if(value<11) {
			JOptionPane.showMessageDialog(frame, "The number is 1-10");
			
		}else if(value<21 ) {
			JOptionPane.showMessageDialog(frame, "The number is 11-20");
		}else if(value<31 ) {
			JOptionPane.showMessageDialog(frame, "The number is 21-30");
		}else if(value<41 ) {
			JOptionPane.showMessageDialog(frame, "The number is 31-40");
		}else if(value<51 ) {
			JOptionPane.showMessageDialog(frame, "The number is 41-50");
		}else if(value>50 ) {
			JOptionPane.showMessageDialog(frame, "The number is greater than 50");
		}else {
			JOptionPane.showMessageDialog(frame, "The number is less than 1");
		}

	}

}
