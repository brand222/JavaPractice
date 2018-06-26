package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Common exceptions
 * ArithmeticException - whenever an arithmetic operation goes wrong (ex. dividing by zero)
 * ClassNotFoundException - whenever a class is called that doesn't exist
 * IllegalArgumentException - when a method has passed in an illegal arguments
 * IndexOutOfBoundsExceptions - when you are trying to access an index in an array or string that doesnt exist
 * InputMismatchException - when you are entering the wrong datatype
 * IOException - any type of IO exception occurs
 * 
 */
public class exceptions {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		divideByZero(2);
		
		System.out.println("How old are you?");
		int age = checkValidAge();
		
		if (age != 0) {
			System.out.println("you are " + age + " years old");
		}
		
		getAFile("./somestuff.txt");
		
		
		try {
			getFile("./somestuff2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//arithmetic exception example
	public static void divideByZero(int number) {
		try 
		{
			System.out.println(number / 0);
		}
		catch (ArithmeticException e) {
			System.out.println("You can't do that");
			//e.getMessage tells you a little more info
			System.out.println(e.getMessage());
			//here you print out the exception type
			System.out.println(e.toString());
			//here we are printing the full exception info
			e.printStackTrace();
		}

	}
	//input mismatch exception example
	public static int checkValidAge() {
		try 
		{
			return userInput.nextInt();
		}
		catch (InputMismatchException e) {
			//skips over the last thing the user inputs and moves to next one
			userInput.next();
			System.out.println("That isn't a whole number");
			return 0;
		}
	}
	
	public static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Sorry, can't find that file");
		}
		catch(IOException e) {
			System.out.println("Unknown IO Error");
		}
		
		
		catch (Exception e) {
			System.out.println("Some error ocurred");
		}
		//this will run no matter what
		//this will usually be used as clean-up
		//ex. closing database connection etc...
		finally {
			System.out.println();
		}
		
	}
	
	public static void getFile(String fileName)throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}

}
