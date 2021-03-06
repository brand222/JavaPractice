package OOPExample;

public class workWithAnimals {
	

	public static void main(String[] args) {
		
		
		
		Dog fido = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		
		fido.setWeight(-1);
		
		int randNum = 10;
		
		fido.changeVar(randNum);
		
		System.out.println("randNum after method call: " + randNum);
		changeObjectName(fido);
		System.out.println("Dog name after method call " + fido.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says:" + kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Doggy says:" + animals[0].getSound());
		System.out.println("Doggy says:" + animals[1].getSound());
		
		speakAnimal(doggy);
		
		//here we are casting this doggy variable to type Dog
		//digHole method is not accessible unless we cast
		//animal class only knows about methods in animal class
		((Dog)doggy).digHole();
		
		
	}
	//what does static mean? 
	/*
	 * Static means that any method that are in a class (which are not tied to an object), are all static (methods and variables)
	 */
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}
}
