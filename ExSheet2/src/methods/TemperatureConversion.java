package methods;

public class TemperatureConversion {
	
	public double getInCelcius(double fahrenheit) {
		double celcius = (fahrenheit-32) *5/9;
		
		return celcius;
	}
	
	public double getInFahrenheit(double celcius) {
		double fahrenheit= celcius*9/5+32;
		return fahrenheit;
	}

	public static void main(String[] args) {
		/*Write a program that can convert temperatures from Fahrenheit to Celsius and vice versa. 
		Create variables in main for storing values for Fahrenheit and Celsius. 
		Create two methods, one to convert from Fahrenheit to Celsius and one to convert Celsius to Fahrenheit, 
		each method should take in one double parameter. 
		Call each method from main and pass in the value for conversion.
		
		°C  x  9/5 + 32 = °F
		(°F  -  32)  x  5/9 = °C
		*/
		
		double fah = 220;
		double cel = 30;
		
		System.out.printf("%.2f Fahreinheit is: %.2f Celcius%n",fah, new TemperatureConversion().getInCelcius(fah));
		System.out.printf("%.2f Celcius is: %.2f Fahreheit%n",cel, new TemperatureConversion().getInFahrenheit(cel));
		
		
		

	}

}
