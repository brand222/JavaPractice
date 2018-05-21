package abstractClassesAndMethods;

public class potpie extends food {
	//here we overrided the required abstract method of eat 
	//we inherited from the 'food' class
	@Override
	public void eat() {
		System.out.println("Yum! I just ate some potpie!");
	}
}
