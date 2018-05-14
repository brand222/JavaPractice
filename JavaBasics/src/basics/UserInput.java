package basics;

//the program must have this scanner to get the input from the user
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter some text!");
		// here we create a 'Scanner' variable called "input" which takes string
		// input from user
		// we told java that we need to use scanner (a way to get text from
		// keyboard)
		// System.in = system input
		// "Whatever we type into the keyboard, store it into our 'input'
		// variable"
		Scanner input = new Scanner(System.in);
		// here with the 'nextLine()' statement, we are taking the typed content
		// of the "next Line"
		System.out.println(input.nextLine());

		/* Here is an example of taking an integer as input */

		System.out.println("Enter a number");
		Scanner input2 = new Scanner(System.in);
		int number = input2.nextInt();
		int result = number + 5;
		System.out.println(number + " +" + " 5 = " + result);
	}
}
