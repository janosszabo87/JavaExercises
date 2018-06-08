package methods;

public class AddandMultiply {
	
	public void addN(int a,int b) {
		int result = a+b;
		System.out.println(result);
	}
	
	public void multiplyN(int a,int b) {
		int result = a*b;
		System.out.println(result);
	}
	
	public void divideN(int a,int b) {
		int result = a/b;
		System.out.println(result);
	}
	
	public void remainderN(int divident,int divisor) {
		int result = divident%divisor;
		System.out.println(result);
	}
	
	

	public static void main(String[] args) {
		/*Create five methods called add, multiply, divide, subtract and remainder.  
		 *Each method should take two integer parameters. 
		 *Each method should display the result, i.e. the add methods should add the two numbers together and display the result,
		 *the multiply method should multiply the two numbers and display the result, etc.  
		 *The remainder method should use the modulus operator to get the remainder when one integer is divided by another.
 
		In main() declare two integers and pass both variables to all five methods. 
		This will test if your methods are working correctly.*/
		
		int n1=10;
		int n2 =3;
		
		AddandMultiply num = new AddandMultiply();
		
		num.addN(n1, n2);
		num.divideN(n1, n2);
		num.multiplyN(n1, n2);
		num.remainderN(n1, n2);
		 
	}

}
