package exSheet1;

public class Variables {

	public static void main(String args[]) {
		
		/*Exercise 1 – Print lines
		Print out some text using println() and print() statements.  
		Insert \t and \n into the double quotes to give a tab and a newline.  
		You can use + to add two “strings” together inside a println() statement.*/
		
		System.out.println("This is\ta tab");
		System.out.println("This is\na new line ");
		
		/*Exercise 2 – Variables and Operators
		In main declare and initialise four variables.Declare two more variables, called sum. 
		Perform the calculations and display the result.*/
		
		int num1 =25;
		double num2 = 3.6;
		double num3;
		num3 = 12.99;
		short num4 = 42;
		
		double sum;
		
		sum= num1+num2+num3+num4;
		System.out.println(sum);
		
		/*Exercise 3 – Salary 
		In main create a variable called salary and assign it a value - 
		a salary you would like to be earning, e.g. 28000. 
		Print out the following using meaningful messages:
		
		Your monthly salary (divide the salary by 12)
		Your weekly salary (divide the salary by 52)
		The total amount you will earn in 5 years.
		Your new salary if you get an 8% pay rise.*/
		
		int salary = 32000;
		
		int monthly = salary/12;
		int weekly = salary/52;
		int in5years=salary*5;
		double afterRaise;
		afterRaise= salary * 1.08;
		
		System.out.println("Monthly salary: "+monthly+"\nWeekly Salary: "+ weekly+"\nSalary earned in 5 years"+in5years+"\nSalary after 8% raise: "+afterRaise );
		
		/*Exercise 4 – Average 
		Write a program that declares three numbers and assign them the following values:
		1.25, 2.65 and 22.65.
		Using the appropriate operators, print out the total and average of these values*/
		
		
		double n1= 1.25;
		double n2 =2.65;
		double n3=22.65;
		
		double total, average;
		total = n1+n2+n3;
		average = total/3;
		
		System.out.println("Average: "+average);
		System.out.printf("Total: %.2f",total);
	}
	
}
