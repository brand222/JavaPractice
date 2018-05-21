package polymorphism;
/*
 * Here we have created our super class called 'food'.
 * There are many different types of food. But one thing they all have in common
 * is that you can 'eat' food. However, you eat different food in different ways
 * Therefore, we must override this method in the subclasses that extend this class
 * so that we have 1) Consistency and 2) the objects we create from other subclasses
 * are interchangeable.
 */
public class food {

	void eat() {
		System.out.println("This food is great!");
	}
}
