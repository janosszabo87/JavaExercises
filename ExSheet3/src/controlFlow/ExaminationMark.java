package controlFlow;

import java.util.Scanner;

public class ExaminationMark {
	
		public String passOrFail(double score1,double score2,double score3) {
			
			double average = (score1+score2+score3)/3;
			String mark="default";
			
			if(score1 >=40 && score2 >=40 && score3 >=40) {
				mark="Pass";
			}else if (score1  <40 && score2>=40 && score3 >=40 && average>=50) {
				mark="Pass";
			}else if (score2  <40 && score1>=40 && score3 >=40 && average>=50) {
				mark="Pass";
			}else if (score3  <40 && score1>=40 && score2 >=40 && average>=50) {
				mark="Pass";
			}else {
				mark="Fail";
			}
			
			System.out.println("The average is: "+ average);
			return mark;
		}

	public static void main(String[] args) {
		
		/*Percentage marks attained by a student in three exams are to be stored in variables in your program. 
		Pass the values to a method that will output an indication of Pass or Fail for the three marks. 
		The criteria for passing are as follows: 
		A student passes if all three examinations are passed. 
		Additionally a student may pass if only one subject is failed 
		and the overall average is greater than or equal to 50. 
		The pass mark for an individual subject is 40.*/
		
		System.out.println("Enter 1. first mark in percentage: ");
		Scanner input = new Scanner(System.in);
		Double score1= input.nextDouble();
		
		
		System.out.println("Enter the 2. mark in percentage: ");
		Double score2= input.nextDouble();
		
		
		System.out.println("Enter the 2. mark in percentage: ");
		Double score3= input.nextDouble();
		
		
		System.out.println("The 1. mark is: "+ score1);
		System.out.println("The 2. mark is: "+ score2);
		System.out.println("The 3. mark is: "+ score3);
		System.out.printf("The student: %s", new ExaminationMark().passOrFail(score1, score2, score3));

	}

}
