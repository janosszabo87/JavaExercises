package controlFlow;

import java.util.Scanner;

public class RectangleCalc {
	
	public double calRectArea(double height,double breadth ) {
		double area= height*breadth;
		return area;
	}
	
	public double calRectPerimeter(double height,double breadth) {
		double perimeter= (height+breadth)*2;
		return perimeter;
	}

	public static void main(String[] args) {
		/*Write a program, which will calculate the area and the length of the perimeter of the rectangle. 
		Declare two variables in main to store the height and breadth values. 
		Write one method to perform and display the calculations.  
		You should pass the two values from main into your method.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height: ");
		double height=input.nextDouble();
		System.out.println("Enter breadth: ");
		double breadth=input.nextDouble();
		
		System.out.printf("The area of the rectangle is: %.2f%n",new RectangleCalc().calRectArea(height, breadth));
		RectangleCalc p = new RectangleCalc();
		System.out.printf("The perimeter of the rectangle is: %.2f%n",p.calRectPerimeter(height, breadth));
		
		
		
		
		
		
		
	}

}
