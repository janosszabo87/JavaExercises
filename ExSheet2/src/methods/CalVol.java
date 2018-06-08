package methods;

public class CalVol {

	private void calculateVolume(double depth, double width, double breadth) {
		double volume=depth*width*breadth;
		System.out.printf("The volume is: %.2fcm2", volume);
	}
	public static void main(String[] args) {
		/*Create a method called calculateVolume, 
		it should take in three doubles for depth, width and breadth, 
		the method should calculate and display the volume.  
		In main declare three variables for depth, 
		width and breadth and pass these values into the method.*/
		double d = 30.1;
		double w = 22.1;
		double b = 56;
		
		CalVol vol = new CalVol();
		vol.calculateVolume(d, w, b);
		
	}

}
