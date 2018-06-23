package InheritanceAndInterfaceExample;
import java.util.concurrent.SynchronousQueue;

public class cat extends animal {

	@Override
	public void run() {
		System.out.println("The cat runs under his bed.");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		System.out.println("The cat eats icecream and fish");

	}
	
	@Override 
	public void scareMe() {
		System.out.println("The cat begins to loudly moan and hiss at me and i am starting to get scared!!!!");
	}

	@Override
	public void makeSound() {
		System.out.println("meow...");

	}

	@Override
	public void makeAngrySound() {
		System.out.println("hISSSSSS");

	}

}
