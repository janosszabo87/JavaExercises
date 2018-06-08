package methods;

public class Salary2 {
	
	public double getMonthlySalary(int yearlySalary) {
		double monthly=yearlySalary/12;
		return monthly;
	}
	
	public double getWeeklylySalary(int weeklySalary) {
		double weekly=weeklySalary/52;
		return weekly;
		//System.out.printf("This is your weekly salary: %.2f%n",weekly);
	}
	
	public double salaryAfterRise(int salary, double percent) {
		double risedSalary= salary*(percent/100+1);
		return risedSalary;
		//System.out.printf("This is your salary after "+percent+"%% rise: %.2f%n",risedSalary);
	}
	
	public static void main(String[] args) {
		int yearly =30000;
		double raiseInPercent =4.5;
		
		System.out.printf("This is your weekly salary: %.2f%n",new Salary2().getWeeklylySalary(yearly));
		
		Salary2 s = new Salary2();
		System.out.printf("This is your monthly salary: %.2f%n",s.getMonthlySalary(yearly));
		
		System.out.printf("This is your salary after "+raiseInPercent+"%% rise: %.2f%n",new Salary2().salaryAfterRise(yearly, raiseInPercent));
		

	}

}
