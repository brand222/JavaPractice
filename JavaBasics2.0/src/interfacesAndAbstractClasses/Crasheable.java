package interfacesAndAbstractClasses;


//all of these methods do not necessarily have to be used
public abstract class Crasheable {

	boolean carDriveable = true;
	
	public void youCrashed() {
		this.carDriveable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
}
