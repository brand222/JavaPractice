package basics;

import java.util.Scanner;

/*This is a simple 'if statement' program that takes 
 * the user's input and determines if brandon's name was entered
 * or not
 */
public class ifStatements {

	public static void main(String[] args) {

		System.out.println("What is your name? ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		//if the user's input equals "brandon" then print out welcome!
		if (name.equalsIgnoreCase("brandon")) {
			System.out.println("Welcome " + name.toLowerCase() + " !!!");
			//otherwise, tell the user they are not brandon
		} else {
			System.out.println("You are not Brandon...");
		}

	}
}
