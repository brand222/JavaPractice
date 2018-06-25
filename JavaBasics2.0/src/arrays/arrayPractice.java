package arrays;

import java.util.Arrays;

public class arrayPractice {

	public static void main(String[] args) {

		int[] randomArray;

		int[] numberArray = new int[10];

		randomArray = new int[20];
		randomArray[1] = 2;

		/* 
		 * ADDING ITEMS TO AN ARRAY
		 */
		String[] stringArray = { "just", "random", "words" };
		// here we can add values to an array
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}
		/*
		 * ADDED DIVIDER LINES
		 */
		int k = 1;
		while (k <= 41) {
			System.out.print("-");
			k++;
		}
		System.out.println();
		
		
		/*
		 * PRINTING OUT ITEMS OF AN ARRAY
		 */
		System.out.println("Simple printing items of array: ++++++++++");
		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		
		
		
		
		
		

		// multidimensional array example
		/*
		 * Here is an example of assigning values to a multi-dimensional array
		 */
		String[][] multiArray = new String[10][10];
		// This first loop loops through the columns
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
			System.out.println();

		}
		
		
		/*
		 * ADDED DIVIDER LINES
		 */
		int l = 1;
		while (k <= 41) {
			System.out.print("-");
			k++;
		}
		System.out.println();

		
		
		
		
		System.out.println("Printing out items of multidimensional array: +++++++++++");
		/*
		 * PRINTING OUT VALUES OF MULTIDIMENSIONAL ARRAY
		 */
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println("|");

		}

		
		
		/*
		 * ADDED DIVIDER LINES
		 */
		int m = 1;
		while (k <= 41) {
			System.out.print("-");
			k++;
		}
		System.out.println();
		
		
		
		
		
		
		
	
		/*
		 * PRINTING ITEMS OF ARRAY USING ENHANCED FOR LOOP
		 */
		
		System.out.println("Printing array items using enhanced for loop: ++++++++++");
			for (int rows : numberArray) {
				System.out.print(rows);
			}
			System.out.println("\n");
			
			
			
			
			/* 
			 * PRINTING ITEMS OF MULTIDIMENSIONAL ARRAY USING ENHANCED FOR LOOP
			 */
			System.out.println("Printing out Multidimensional Array items using enhanced for loop: ++++++++++");
			for(String[] rows : multiArray) {
				for(String column : rows) {
					System.out.print("| " + column + " ");
				}
				System.out.println();
			}
			
			
			
			//you can also copy part of an array (by providing index/index range)
			/*
			 * COPY AN ARRAY AND PUT THE ITEMS (OR SPECIFIC ITEMS) WITHIN A NEW ARRAY
			 */
			System.out.println("Printing out items of a copied array: ++++++++++");
			int[] numberCopy = Arrays.copyOf(numberArray, numberArray.length);
			
			for (int item : numberCopy) {
				System.out.println(item);
			}
			
			
			
			//prints out contents of array inside a string
			/*
			 * PRINTING ITEMS OF ARRAY AFTER CONVERTING USING .toString() method
			 */
			System.out.println("Printing out items of an array after coverting using .toString Method: +++++++++++");
			System.out.println(Arrays.toString(numberCopy));
			
			
			//here we can fill an array
			/*
			 * FILLING ARRAY WITH A SPECIFIED INPUT TYPE
			 */
			System.out.println("Printing items after filling array with specified integer: ++++++++++");
			int[] moreNumbers = new int[10];
			Arrays.fill(moreNumbers, 2);
			for (int item : moreNumbers) {
				System.out.println(item);
			}
			
		
			/*
			 * FILLING MULTI-DIMENSIONAL ARRAY WITH SPECIFIED INPUT TYPE
			 */
			char[][] boardGame = new char[10][10];
			//here we fill the rows of the boardGame 2D array
			for (char[] row : boardGame) {
				Arrays.fill(row, '*');
				}
			System.out.println("Printing multidimensional array items after filling with specified character: ++++++++++");
			for (char[] rows : boardGame) {
				for(char column : rows) {
					System.out.print(" | " + column + " |");
				}
				System.out.println();
			}
			
			/*
			 * PRINTING OUT AN ARRAY AFTER SORTING THE ARRAY
			 */
			int numsToSort[] = new int[10];
			for (int i = 0; i < 10; i++) {
				numsToSort[i] = (int) (Math.random() * 100);
			}
			//here we sort the integer array
			Arrays.sort(numsToSort);
			System.out.println("Printing array items after sort");
			System.out.println(Arrays.toString(numsToSort));
			
			/*
			 * BINARY SEARCH VALUE
			 */
			System.out.println("Printing index position of binary search within array");
			//here we provide an array and the 
			int whereIs5 = Arrays.binarySearch(numsToSort, 50);
			
			System.out.println(whereIs5);
			
	}
}
