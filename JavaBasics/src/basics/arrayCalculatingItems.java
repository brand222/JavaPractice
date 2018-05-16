package basics;
/*
 * This is a simple program that calculates the sum of all numbers 
 * inside of an integer array and prints out the result.
 */
public class arrayCalculatingItems {
	public static void main(String[] args) {
		int sum = 0;
		//initialize an array with numbers
		int brandon[] = { 32, 43, 3, 34, 4 };
		// this loop will loop through every value of the array and perform the
		// addition to the sum variable
		for (int i = 0; i < brandon.length; i++) {
			//add each number to the sum variable
			sum += brandon[i];
		}
		//print out your sum result
		System.out.println("The sum of these numbers is " + sum);
	}
}
