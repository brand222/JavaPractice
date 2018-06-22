package InheritanceAndInterfaceExample;

public class mainClass {
	
	public static void main(String[] args) {
		animal[] animals = new animal[3];
		cat cat = new cat();
		dog dog = new dog();
		mouse mouse = new mouse();
		animals[0] = cat;
		animals[1] = dog;
		animals[2] = mouse;
		
		for (animal a : animals) {
			a.makeSound();
			a.makeAngrySound();
			a.run();
			a.scareMe();
		}
	}

}
