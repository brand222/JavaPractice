package OOPS;

public class otherClass {

	public static void main(String[] args) {
		//now object
		Monster john = new Monster();
		john.name = "John";
		//here we are invoking the 'getAttack()' method so we can access the private variable
		//here we are using our accessor function
		System.out.println(john.getAttack());
		
		Monster brandon = new Monster(50, 200);
		brandon.name = "brandon";
		
		System.out.println(brandon.getAttack() + " " + brandon.name);
	}
}
