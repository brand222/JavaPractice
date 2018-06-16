package abstractVersusInterface;

public class mainClass {

	public static void main(String[] args) {
		//
		Vehicle car = new Vehicle(4, 1.3);
		
		
		System.out.println("Cars max speed" + car.getSpeed());
		
		System.out.println("Cars wheel count" + car.getWheel());
		
		car.setCarStrength(10);
		
		
		System.out.println("Strength" + car.getCarStrength());
		
		
	}
}
