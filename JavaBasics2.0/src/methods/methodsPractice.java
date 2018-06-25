package methods;

import java.util.Scanner;

public class methodsPractice {

	// here we will create a class variable
	// static means its accessible to other classes as well as other functions
	// within this class
	static double myPI = 3.14159; // class variable
	static int randomNumber;; //class variable
	
	static Scanner userInput = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
	System.out.println(addThem(1,2));
	System.out.println("++++++++++++");
	
	int d = 3;
	
	tryToChange(d);	
	
	System.out.println(getRandomNum());
	
	int guessResult = 1;
	int randomGuess = 0;
	
	while(guessResult != -1) {
		System.out.println("Guess a number between 0 and 50: ");
		
		randomGuess = userInput.nextInt();
		
		guessResult = checkGuess(randomGuess);
	}

	System.out.println("Yes the random number is " + randomGuess);
	
	}
	
	
	
	
	public static int addThem(int a, int b) {
	
		int c = a + b;
		
		return c;
	}
	
	public static void tryToChange(int d) {
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	
	
	public static int getRandomNum() {
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess){
		if (guess == randomNumber) {
			return -1;
		}
		else
		{
			return guess;
		}
	}
}
