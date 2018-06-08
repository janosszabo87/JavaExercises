package methods;

public class AverageAndTotal2 {
	
	public double getAverage(double num1,double num2,int num3) {
		
		double average=(num1+num2+num3)/3;
		
		return average;
	}
	
	public double getTotal(double num1,double num2,int num3) {
		
		double total=num1+num2+num3;
		
		return total;
	}
	
	
	
	public static void main(String[] args) {
		
		/*This exercise is similar to exercise AverageAndTotal except the values should be returned from the method and displayed in main.*/
		
		double num1 = 27;
		double num2 = 56.67;
		int num3 = 34;
		
		AverageAndTotal2 avr = new AverageAndTotal2();
		
		System.out.printf("This is the average of the three numbers %.2f%n",avr.getAverage(num1, num2, num3) );
		System.out.printf("This is the total: %.2f%n", avr.getTotal(num1, num2, num3) );
	

	}

}
