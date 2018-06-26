package interfacesAndAbstractClasses;

//you implement the interface
public class Vehicle implements Driveable {
	
	//you must implement everything that is inside of your interface

	
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;
	
	
	
	@Override
	public int getWheel() {
		return 0;
	}

	@Override
	public void setWheels(int numWheels) {
		
	}

	@Override
	public void setSpeed(double speed) {
		
	}

}
