package methods;

public class AverageAndTotal {
	
	public void getAverage(double num1,double num2,int num3) {
		double average=(num1+num2+num3)/3;
		
		System.out.printf("The average is: %.2f",average);
	}
	
	public static void main(String[] args) {
		/*Create a method called getAverage. 
		getAverage should take in two doubles and one int and work out and display the average of the three numbers. 
		Call the method from main and pass in the required values.*/
		
		double a = 11.1;
		double b = 27.9997;
		int c = 10;
		
		AverageAndTotal n = new AverageAndTotal();
		n.getAverage(a, b, c);
		
	}

}
