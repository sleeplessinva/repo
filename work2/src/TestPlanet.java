
public class TestPlanet {

	public static void main(String[] args) {
    
		// iterate through the planets
		// and obtain statistics
    
		for (Planet x : Planet.values()) {
			
			double mass		= x.mass();
	    	double radius 	= x.radius();
	    	
	    	System.out.println("The planet is " + x.toString());
	    	System.out.println(" - The mass is " + mass);
	    	System.out.println(" - The radius is " + radius);
	    	System.out.println(" - The surface gravity is " + x.surfaceGravity());
		}
    	
    }
}
