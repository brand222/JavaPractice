package multipleConstructors;

public class clockParts {

	public static void main(String[] args) {

		// here we are creating our new objects and calling on the different
		// constructors that we
		// created in the 'clock' class. Notice that each amount of arguments
		// passed means we are
		// using a different constructor
		clock clockObject = new clock();
		clock clockObject2 = new clock(5);
		clock clockObject3 = new clock(5, 13);
		clock clockObject4 = new clock(5, 13, 43);
		clock clockObject5 = new clock(4, 5, 23);

		//here we are printing out our output (using printf())
		//%s - means we are passing in a string
		//\n - means a new line
		//then we are calling on the object, and then the method to get the specific time
		System.out.printf("%s\n", clockObject.toMilitary());
		System.out.printf("%s\n", clockObject2.toMilitary());
		System.out.printf("%s\n", clockObject3.toMilitary());
		System.out.printf("%s\n", clockObject4.toMilitary());
		System.out.printf("%s\n", clockObject5.toMilitary());
	}
}
