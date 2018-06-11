package controlFlow;

public class InvoiceSystems {
	
	public void totalCost(String refN, double price, int quantity) {
		double total;
		if(price >0 && quantity>0) {
			if(quantity<101 && quantity>0) {
				total= quantity*price;
				System.out.printf("The total cost of product %s for %d units are: %.2f ",refN,quantity,total);
			}else{
				total=100*price+(quantity-100)*(price*0.75);
				System.out.printf("The total cost of product %s for %d units are: %.2f ",refN,quantity,total);
			}
		}else {
			System.out.println("Price and quantity has to be greater than 0");
		}
		
		
		
		
	}

	/*A program is required as part of an invoicing system to enter 
	the reference number of a product, 
	its unit price in Euros and Cents and a quantity ordered. 
	The program should output the total cost of the order given that the
	first 100 items ordered are charged at the unit price 
	and that the remainder are charged at 75% of unit price. 
	Write a program that holds each of the values required 
	as variables and pass the values to a method to work out the total cost of the order.*/
	
	public static void main(String[]args) {
		String refN="jhgasdj";
		int quantity = 200;
		double price = 100;
		
		new InvoiceSystems().totalCost(refN, price, quantity);
		
	}
	
}
