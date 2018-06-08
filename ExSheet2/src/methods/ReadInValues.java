package methods;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadInValues {
	
	public double getTotal(double num1,double num2, double num3) {
		double total = num1+num2+num3;
		return total;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the Second number: ");
		double b = sc.nextDouble();
		
		//System.out.println("Enter the Third number: ");
		//double c = sc.nextDouble();
		
		String s = JOptionPane.showInputDialog("Hello");
		double c = Double.parseDouble(s);
		
		System.out.println("The total is: "+ new ReadInValues().getTotal(a, b, c));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
