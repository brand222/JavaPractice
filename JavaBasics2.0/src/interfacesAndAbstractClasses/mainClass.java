package interfacesAndAbstractClasses;

public class mainClass {

	public static void main(String[] args) {

		Vehicle car = new Vehicle(4, 100.00);

		System.out.println("Cars max speed " + car.getSpeed());
		System.out.println("Num of wheels " + car.getWheel());

		car.setCarStrength(10);
		System.out.println("Strength: " + car.getCarStrength());

		// object class example

		Object superCar = new Vehicle(2, 50.00);

		// here is an example of casting a specific object type to an undefined
		// object
		System.out.println(((Vehicle) superCar).getSpeed());
		System.out.println(((Vehicle) superCar).getCarStrength());
		System.out.println(((Vehicle) superCar).getWheel());
		
		
		Vehicle superTruck = new Vehicle();

		//here we are comparing two objects to one another
		System.out.println(superCar.equals(superTruck));
		//each time you create a new object, it creates a unique identifier
		//this is called a: "Hashcode"
		System.out.println(superCar.hashCode());
		
		//finalize is a method a java collector method where it cleans up memory
		
		//here we will get the value of the class of the object
		System.out.println(superCar.getClass());
		//prints the class name without the 'class' indicator
		System.out.println(superCar.getClass().getName());
		
		//check if two object are of same class
		if (superCar.getClass() == superTruck.getClass()) {
			System.out.println("the same");
		}
		
		System.out.println();
		
		System.out.println(superCar.getClass().getSuperclass());
		
		System.out.println(superCar.toString());
		
		int randNum = 100;
		System.out.println(Integer.toString(randNum));
		
		superTruck.setWheels(6);
		
		Vehicle superTruck2 = (Vehicle)superTruck.clone();
		
		System.out.println(superTruck.getWheel());
		System.out.println(superTruck2.hashCode());
		
	
		
		
	}
}
