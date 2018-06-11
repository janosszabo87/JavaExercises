package controlFlow;

public class Loops {
	
	public static void main(String[]args) {
		/*A)Using a while loop output the following:
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22
		B)Using a do while loop output the same data.
		C)Using a for loop output the same data.*/
		
		int a=0;
		while(a<23) {
			
			if(a<22) {
			System.out.print(a+", ");
			a++;
			}else {
				System.out.println(a);
				a++;
			}
		}
		
		a=0;
		do{
			System.out.print(a+", ");
			a++;
		}while(a<22);
		System.out.println(a);
		
		a=0;
		for(int i=0;i<22;i++) {
			System.out.print(a+", ");
			a++;
		}
		System.out.println(a);
		
		/*Write a while loop that counts from 100 to 200 in increments of 2s, 
		print out the number to the screen.
		Use a for loop to do the same thing.*/
		
		a=100;
		while(a<200) {
			if(a%2==0) {
				System.out.print(a+", ");
			}
			a++;
		}
		System.out.println(a);
		
		a=100;
		for(int i = 100;i<200;i++) {
			if(a%2==0) {
				System.out.print(a+", ");
			}
			a++;
		}
		System.out.println(a);
		
		/*Declare a variable called numOfLives and assign it 8.
		Write a loop that will keep looping until numOfLives reaches 0.  
		The loop should print out the value of numOfLives and subtract one each time around. */
		
		int numLives=8;
		System.out.print("Number of lives: ");
		for(int i=numLives;i>=0;i--) {
			System.out.print(numLives--+" ");
			
		/**/
			
			
		}
		
	}
}
