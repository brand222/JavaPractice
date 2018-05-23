package workingWithFiles;

import java.io.File;
import java.util.Scanner;

public class readingFromFiles {

	private Scanner x;

	// here we are opening the file
	public void openFile() {
		try {
			x = new Scanner(new File("\\test\\chinese.txt"));
		} catch (Exception e) {
			System.out.println("Could not find file");
		}

	}

	// this method will loop through the file and print out the 3 specified
	// string
	// objects
	public void readFile() {
		while (x.hasNext()) {
			// we are setting a equal to the first item
			String a = x.next();
			// we are setting b equal to the NEXT item etc../
			String b = x.next();
			String c = x.next();
			// here we are printing the contents that are returned
			System.out.printf("%s\n%s\n%s\n", a, b, c + " ");
		}
	}

	// this method closes the file
	public void closeFile() {
		x.close();
	}
}
