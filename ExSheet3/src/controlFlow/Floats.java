package controlFlow;

public class Floats {
	
	public void compareNumbers(float num1,float num2, float num3) {
		if(num1 == num2 && num1 ==num3) {
			System.out.println("All the numbers are the same ");
		}else if(num1==num2 || num1==num3 || num2 ==num3){
			System.out.println("Two numbers are the same");
		}else {
			System.out.println("All numbers are different");
		}
	}
	
	public void smallestAndLargest(float a,float b,float c) {
		float smallest;
		float largest;
		
		if(a<b && a<c) {
			System.out.printf("the smallest number is: %.2f%n",a);
			smallest=a;
		}else if(b<a && b<c) {
			System.out.printf("the smallest number is: %.2f%n",b);
			smallest =b;
		}else if(c<a && c<b){
			System.out.printf("the smallest number is: %.2f%n",c);
			smallest =c;
		}else if (a==b && b<c) {
			System.out.println("The smallest is: " + a+" and "+ b);
		}else if (a==c && c<b) {
			System.out.println("The smallest is: " + a+" and "+ c);
		}else if (c==b && a<c) {
			System.out.println("The smallest is: " +b+" and "+ c);
		}
		
		if(a>b && a>c) {
			System.out.printf("the largest number is: %.2f",a);
			largest=a;
		}else if(b>a && b>c) {
			System.out.printf("the largest number is: %.2f",b);
			largest=b;
		}else if(c>a && c>b){
			System.out.printf("the largest number is: %.2f",c);
			largest=c;
		}else if (a==b && b>c) {
			System.out.println("The largest is: " + a+" and "+ b);
		}else if (a==c && c>b) {
			System.out.println("The largest is: " + a+" and "+ c);
		}else if (c==b && c>a) {
			System.out.println("The largest is: " +b+" and "+ c);
		}else {
			System.out.println("All the same");
		}
		
		
		
	}
	
	public double getAverage(float a,float b,float c) {
		double average= (a+b+c)/3;
		return average;
	}

	public static void main(String[] args) {
		/*Write a program that declares and initialised three floats. 
		Create the three methods that will do the following:
		Output whether the numbers are all different or whether two or more are the same.
		Output which number is the largest and which is the smallest number
		Output the average of the three numbers*/
		
		float num1 = 37;
		float num2 = 37;
		float num3 = 37;
		
		new Floats().compareNumbers(num1, num2, num3);
		new Floats().smallestAndLargest(num1, num2, num3);
		System.out.println("The average is: "+new Floats().getAverage(num1, num2, num3));
		
		
		
	}

}
