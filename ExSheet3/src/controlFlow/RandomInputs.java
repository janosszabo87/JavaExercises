package controlFlow;

import java.util.Scanner;

public class RandomInputs {

	public static void main(String[] args) {
		
		/*Using a loop, allow the user input integer values, keep looping until the user enters -1.  
		When the user enters -1 output the total of all the values entered. 
		Alter this program to out the average of all values.*/
		
		
		int total =0;
		int counter=0;
		System.out.println("Enter  whole numbers to get their total and average. Once you finished enter -1");
		
		for(; ;) {
			counter++;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the "+counter+". number");
			int number = input.nextInt();
			
			if(number==-1) {
				break;
			}else {
				total += number;
			}
		}
		System.out.println("The total is: "+total);
		int numberOfInputs=counter-1;
		System.out.println("The average is: "+ total/numberOfInputs);
		
	}

}
