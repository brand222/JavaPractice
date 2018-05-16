package basics;

public class enhancedForLoop {

	public static void main(String[] args) {
		// created an integer array
		int brandon[] = { 3, 4, 5, 6, 7 };
		// initalized a total variable and set it to zero
		int total = 0;
		// here we created an enhanced for loop
		// notice the colon in between x and brandon
		// we are saying here: "For each integer (x) inside of the : brandon
		// array
		// add each integer (x) to the total variable
		for (int x : brandon) {
			total += x;
			// here we are printing out our total once the loop completes
		}
		System.out.println(total);
	}
}
