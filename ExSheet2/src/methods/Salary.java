package methods;

public class Salary {
	
	public void printMonthlySalary(int yearlySalary) {
		double monthly=yearlySalary/12;
		System.out.printf("This is your monthly salary: %.2f%n",monthly);
	}
	
	public void printWeeklylySalary(int weeklySalary) {
		double weekly=weeklySalary/52;
		System.out.printf("This is your weekly salary: %.2f%n",weekly);
	}
	
		public void salaryAfterRise(int salary, double percent) {
		double risedSalary= salary*(percent/100+1);
		System.out.printf("This is your salary after "+percent+"%% rise: %.2f%n",risedSalary);
	}
	
	public static void main(String[] args) {
		/*Create the following methods: printMonthlySalary and printWeeklySalary, 
		both methods should take in an int argument of the yearlySalary and display the monthly/weekly salary. 
		Create a method called salaryAfterPayRise. 
		This method should take in an int for the salary and a double for the percentage pay increase. The method should work out the new salary after the percentage pay increase.*/
		
		Salary sal = new Salary();
		int yearlySal=30000;
		sal.printMonthlySalary(yearlySal);
		sal.printWeeklylySalary(yearlySal);
		sal.salaryAfterRise(yearlySal, 3.5);
	}

}
