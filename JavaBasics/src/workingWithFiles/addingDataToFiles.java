package workingWithFiles;
import java.io.*;
import java.lang.*;
import java.util.*;


public class addingDataToFiles {

	private Formatter x;
	
	//here we will create a method to open a file
	public void OpenFile() {
		try {
			//here we are setting a new file that we will open equal to x
			x = new Formatter("mcdonald.txt");
			
		}
		catch(Exception e) {
			System.out.println("You have an error");
		}
	}
	
	public void addRecords() {
		//here this will insert three elements on the same line
		//this is the same thing as printf in that we first specify the argument types we are passing
		//in this case, we are passing 3 strings (i.e. %s%s%s) and then the actual string arguments
		x .format("%s%s%s", "28 ", "brandon", " mcdonald");
	}
	//you must ALWAYS close a file that you update in a java program
	public void closeFile() {
		//use the built-in method for closing a document
		x.close();
	}
}
