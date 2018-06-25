package polymorphismAndInheritance;

//copy all methods and fields of the superclass (animal)
public class Cat extends Animals {
	
	public String favToy = "Yarn";
	
	public void playWith() {
		System.out.println("Yay! " + favToy);
	}
	
	@Override
	public void walkAround() {
		System.out.println(this.getName() + " stalks around");
	}
	
	public String getToy() {
		return this.favToy;
	}
	//empty constructor
	public Cat() {
		
	}
	//constructor with all possible combos
	public Cat(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}

}
