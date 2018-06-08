package methods;

public class CalP {

	public void calculateTotal(double price, int quantity) {
		double totalCost = price* quantity;
		System.out.printf("The total cost is: %.2f", totalCost);
	}
	
	public static void main(String[] args) {
		/*Write a method called calculateTotal that takes in two parameters; price and quantity. 
		Assign appropriate data types to these parameters (int, double, String?).  
		The method should calculate the total and print it out. 

		In main declare two variables: price and quantity, 
		assign then appropriate values and pass them to the calculateTotal method.*/
		
		double price=7.89;
		int quantity = 27;
		
		CalP t=new CalP();
		t.calculateTotal(price, quantity);
	}

}
