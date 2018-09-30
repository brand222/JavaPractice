package userInput;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class userInput {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter a first number:");
			int numberEntered1 = input.nextInt();
			System.out.println("You entered " + numberEntered1 + " for the first number");
			System.out.println("Enter a second number:");
			int numberEntered2 = input.nextInt();
			System.out.println("You entered " + numberEntered2 + " for the second number");
			
			System.out.println("The biggest number is " + biggestNumber(numberEntered1, numberEntered2));
	}
	
	public static int biggestNumber(int num1, int num2) {
		int biggestNum = Math.max(num1, num2);
		return biggestNum;
	}
}
