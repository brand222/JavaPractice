package workingWithFiles;
import java.util.*;

public class creatingFile {

	public static void main(String[] args) {
		//here we are creating a formatter variable
		//we are making it a final variable
		//a formatter variable outputs strings to a file
		final Formatter x;
		//here we are going to TRY to set the variable equal to a formatter
		try {
			//if it couldnt find the file, then it created it
			x = new Formatter("brandon.xlsx");
			System.out.println("You created a file!");
		}
		//otherwise lets throw an error
		catch (Exception e) {
			System.out.println("you got an error");
		}
	}
}
