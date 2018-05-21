package polymorphism;

public class potpie extends food {

	// here we created an override method that is a behavior specific to potpie class
	// any time you override a method, you must take the same amount of
	// arguments as the superclass method
	@Override
	void eat() {
		System.out.println("This potpie is great!");
	}
}
