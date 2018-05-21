package polymorphism;

/*
 * What is polymorphism? 
 * 
 */
public class apples {

	public static void main(String[] args) {
		System.out.println("This is the polymorphic array output from the loop:");
		System.out.println();
		// here we are creating an (polymorphic) array of generic animals
		food brandon[] = new food[2];
		// next, we are putting specific animals inside the array
		// in index 0 of the array, we created a potpie object
		brandon[0] = new potpie();
		// in index 1 of the array, we created a tuna object
		brandon[1] = new tuna();
		// here we are looping through the polymorphic array and calling the
		// eat() method
		// this is a simple example of polymorphism (meaning: "Many Forms")
		// we don't have to keep track of which object has which behavior
		for (int x = 0; x < 2; x++) {
			brandon[x].eat();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("This is the output from calling a method where we pass an object argument:");
		System.out.println();
		// here we create a new fatty object named me
		fatty me = new fatty();
		food fo = new food();
		food po = new potpie();
		// here is an example of passing in an object into a method
		me.digest(fo);
		me.digest(po);
	}
}
