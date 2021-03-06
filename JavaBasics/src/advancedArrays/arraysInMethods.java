package advancedArrays;

public class arraysInMethods {

	public static void main(String[] args) {
		//here we created an array
		int brandon[] = { 3, 4, 5, 6, 7 };
		// here we are calling on our method that changes the array
		changeArray(brandon);
		// now that we have changed the array, lets print out the contents
		// here is where we are printing out the newly-changed array
		//here we have an enhanced for loop where we are printing out each
		//integer value inside the 'brandon' array
		for (int y : brandon) {
			System.out.println(y);
		}
	}

	// here we created a method that accepts a single integer array as a
	// parameter
	public static void changeArray(int x[]) {
		// loop through the length of the array that is passed into the method
		// and for each index value, add 5 to each number
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] += 5;
		}
	}
}
