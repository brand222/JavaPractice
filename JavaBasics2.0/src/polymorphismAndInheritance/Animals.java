package polymorphismAndInheritance;

public class Animals {
	//the only thing that has access to name is Animals class
	private String name = "Animal";
	//other classes can access this field
	public String favFood = "Food";
	
	// if we want subclasses to access this method, we need it to be 'protected'
	//the final means that this method cannot be overrided
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("Yum " + favFood);
	}
	
	public void walkAround() {
		System.out.println(this.name + " walks around");
	}
	
	public Animals() {
		
	}
	
	public Animals(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
}
