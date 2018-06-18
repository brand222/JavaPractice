package abstractVersusInterface;

//here we can use either non-abstract methods (methods we do not have to use)
//or we can use abstract methods, which we HAVE to use
//when we are inheriting from this class
public abstract class Crasheable {

	boolean carDriveable = true;
	
	public void youCrashed() {
		this.carDriveable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
}
