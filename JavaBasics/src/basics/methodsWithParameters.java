package basics;

import java.util.Scanner;

public class methodsWithParameters {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//here we created an object of type tuna
		tuna tunaObject = new tuna();
		System.out.println("Enter your name here: ");
		//here we get the actual input from the user
		String name = input.nextLine();
		//here we are calling on the function we created in the tuna class
		//and passing a String argument to the function
		tunaObject.simpleMessage("brandon");
		
	}
}
