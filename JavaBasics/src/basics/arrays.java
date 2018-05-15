package basics;

/*
 * Here is a simple example of how to create a basic array.
 */
public class arrays {

	public static void main(String[] args) {
		// Here is the LONNNGGGG way to create an array
		// We are creating a new array of type int and giving it 10 spaces
		// inside it
		int grades[] = new int[10];

		// here we will give a value to each index position of the array
		grades[0] = 93;
		grades[1] = 78;
		grades[2] = 56;
		grades[3] = 85;
		grades[4] = 43;
		grades[5] = 65;
		grades[6] = 46;
		grades[7] = 36;
		grades[8] = 76;
		grades[9] = 54;
		
		//you can also print out each index position of an array
		
		System.out.println(grades[4]);
		
		
		//here is the easier way to create arrays
		int grades2[] = { 58, 50, 90, 91, 85, 78, 75, 99, 67, 89};
	}
}
