package polymorphism;

public class tuna extends food {
	// here we created an override method that is a behavior specific to tuna
	// class
	// NOTE: You must have the EXACT same access modifiers and parameters to
	// this method if you are overriding this method method
	@Override
	void eat() {
		System.out.println("This tuna is great!");
	}

}
