package advancedArrays;

/*
 * This program demonstrates how to create a multidimensional array and to set or access
 * specific items within those arrays.
 * Additonally, we created a method that prints out the items of a multi-dimensional array
 * and shows each row/column respectively
 */
public class multidimensionalArrays {

	public static void main(String[] args) {
		// first bracket is for the row, the second one for the column
		int firstArray[][] = { { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		// if i wanted to call on a specific item within the multidimensional
		// array,
		// i could use: firstArray[0][1] - which would equal the "the row, of
		// item 1" -which is zero-indexed so = 9
		
		int secondArray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};
		//secondArray[0][0] = 30
		//secondArray[1][0] = 43
		//secondArray[2][0] = 4
		
		int thirdArray[][]= {{2, 3, 5, 4}, {2, 2, 3, 4}};
		
		System.out.println("This is the first array:");
		//call the method
		displayMArray(firstArray);
		
		System.out.println("this is the second array: ");
		//call the method
		displayMArray(secondArray);
		
		System.out.println("This is third array");
		displayMArray(thirdArray);
	}

	public static void displayMArray(int x[][]) {
		// loop through rows
		for (int row = 0; row < x.length; row++) {
			// loop through columns
			for (int column = 0; column < x[row].length; column++) {
				// here we are just printing the row
				System.out.print(x[row][column] + "\t");
			}
			// once we get to the end of the row, we create a new line
			System.out.println();
		}

	}
}
