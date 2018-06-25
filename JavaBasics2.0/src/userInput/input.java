package userInput;

import java.util.Scanner;

public class input {

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Your favorite number: ");

		if (userInput.hasNextInt()) { // .hasNextFloat/float/short/Byte/etc...

		
		// you could also us43e: nextDouble(), nextFloat(), nextLine()
		int numberEntered = userInput.nextInt();
		
		System.out.println("You entered " + numberEntered);
		
		int numEnteredTimes2 = numberEntered + numberEntered;
		System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
		
		int numEnteredMinus2 = numberEntered -2;
		System.out.println(numberEntered + " - 2 = " + numEnteredMinus2);
		
		int numEnteredTimesSelf = numberEntered * numberEntered;
		System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
		
		int numEnteredDivide2 = numberEntered / 2;
		System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);
		
		int numEnteredRemainder = numberEntered % 2;
		System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
		
		//adding two to a number
		numberEntered += 2;
		//subtracting 2 from a number
		numberEntered -= 2;
		
		//decrement
		numberEntered--;
		//increment
		numberEntered++;
		
		//absolute value for a number
		int numberABS = Math.abs(numberEntered);
		//finding max of two numbers
		int whichIsBigger = Math.max(5, 7);
		//finding minimum of two numbers
		int whichIsSmaller = Math.min(4, 5);
		//square root
		double numSqrt = Math.sqrt(5.32);
		//rounding a number up
		int numCeiling = (int) Math.ceil(5.23);
		//rounding a number down
		int numFloor = (int) Math.floor(5.23);
		//rounding a number
		int numRound = (int) Math.round(5.63);
		//random number (make a random number between 1 and 10
		int randomNumber = (int) (Math.random() * 11);
		System.out.println("Number " + randomNumber);
		
		}
		else
		{
			System.out.println("enter an integer next time");
		}
	}

}
