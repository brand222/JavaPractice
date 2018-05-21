package polymorphism;

public class fatty {
	//here we created a function that takes a food object as a parameter
	//upon calling this function, it will call the corresponding eat method for the 
	//food object that was passed in
	public void digest(food x) {
		x.eat();
	}
}
