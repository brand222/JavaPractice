package InheritanceAndInterfaceExample;
public abstract class animal implements abilities {
	String word;
	
	public abstract void eat();
	
	public abstract void makeSound();
	
	public abstract void makeAngrySound();
	
	public void scareMe() {
		System.out.println("The animal scared me!");
	}

}
