package abstractVersusInterface;

//here is our interface class
//everything inside this class is already considered final and abstract in nature
//when we implement this class in our main class, we must implement all methods in this too

public interface Driveable {

	double PI = 3.14;

	int getWheel();

	void setWheels(int numWheels);

	double getSpeed();

	void setSpeed(double speed);
}
