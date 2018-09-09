package interfacesAndAbstractClasses;

//you implement the interface
public class Vehicle extends Crasheable implements Driveable {
	
	//you must implement everything that is inside of your interface

	
	int numOfWheels = 2;
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
	
	public double getSpeed() {
		return this.theSpeed;
	}

	@Override
	public void setSpeed(double speed) {
		this.theSpeed = speed;
	}
	
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
	
	public String toString() {
		return "num of Wheels: " + this.numOfWheels;
	}
	
	public Object clone() {
		Vehicle car;
		try {
			car = (Vehicle) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
		return car;
	}
	
	public Vehicle() {
		
	}

}
