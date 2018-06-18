package abstractVersusInterface;

public class Vehicle extends Crasheable implements Driveable{
//as you can see, our vehicle class is INHERITING the abstract class
	//and this class is also IMPLEMENTING the interface class
	//we are creating our getters and setters in this class so that we can
	//incorporate 'encapsulation' in our code when we use these methods
	//in our main class. 
	
	int numOfWheels = 4;
	
	double theSpeed = 0;
	
	int carStrength = 0;
	
	@Override
	public int getWheel() {
		return this.numOfWheels;
	}

	@Override
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
		
	}

	@Override
	public double getSpeed() {
		return this.theSpeed;
	}

	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;
		
	}
	//here is our constructor for when we create an object (in our main class) of type vehicle
	//we MUST pass the wheels and speed arguments as parameters
	// then we are able to access wheels and speed of vehicle class.
	public Vehicle(int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}

	@Override
	public void setCarStrength(int carStrength) {
		this.carStrength = carStrength;
		
	}

	@Override
	public int getCarStrength() {
		return this.carStrength;
	}

}
