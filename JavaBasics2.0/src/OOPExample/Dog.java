package OOPExample;

public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public Dog() {
		//reference the constructor file
		super();
		
		setSound("Bark");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		
		System.out.println("randNUm in method: " + randNum);
	}
}
