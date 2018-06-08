package methods;

public class CalVol2 {
	
	private double getVolume(double depth, double width, double breadth) {
		double volume=depth*width*breadth;
		return volume;
	}

	public static void main(String[] args) {
		//This is similar to exercise to CalVol
		
		double a = 11.1;
		double b = 98;
		int c = 22;
		
		System.out.printf("Volume: %.2f", new CalVol2().getVolume(a, b, c));

	}

}
