package controlFlow;

import java.util.Scanner;

public class TotalOf10Values {

	public static void main(String[] args) {
		/*Use a loop to read in ten values from the Console. 
		Display what the user entered after each input (use a System.out.println() statement for this).  
		Use a running total to sum each entered value.  
		When the user has finished inputting ten values, 
		display the sum and the average.*/ 
		double total =0;
		int a=0;
		for (int i = 0; i < 10; i++) {
			
			a++;
			System.out.print("Write the "+a+". number: ");
			Scanner input = new Scanner(System.in);
			
			double number = input.nextDouble();
			total+=number;
			
			
			}
		System.out.printf("The sum is: %.2f%n",total);
		System.out.printf("The average is: %.2f%n", total/a);
	}

}
