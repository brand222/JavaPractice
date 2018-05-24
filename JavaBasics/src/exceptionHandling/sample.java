package exceptionHandling;

import java.util.Scanner;

/*
 * What is exception handling? - a way to handle an error/exception
 * When the user does something they are not supposed to do
 * we dont want the program to just shut down and not say anything,
 * we want the system to tell us what exactly went wrong.
 */
public class sample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//here we set x = 1
		int x = 1;
		// here we are creating a do-while loop saying:
		//do this code while x is equal to 1
		do {
			// we are going to TRY this code
			try {
				System.out.println("Enter first num: ");
				int num1 = input.nextInt();
				System.out.println("Enter second num: ");
				int num2 = input.nextInt();
				int sum = num1 / num2;
				System.out.println(sum);
				//if this code executes without errors, set x equal to 2 and end the loop
				x = 2;
			}
			// here we are going to CATCH all the exceptions(errors)
			// there are different types of errors
			// when we put Exception, this means if ANY errors are caught, print
			// out the error
			//NOTE: This exception handler does NOT handle if the user enters strings
			catch (Exception e) {
				System.out.println("Something that you entered was wrong.");
			}

		
		}
		//this is the point in time where we stop the while loop
		 while (x == 1);
	}
}
