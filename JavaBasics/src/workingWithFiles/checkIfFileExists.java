package workingWithFiles;

import java.io.File;

public class checkIfFileExists {
		
		public static void main(String[] args) {
			//the '\\ is needed because '\' means escape and file structures need 2 backslashes
			//we are setting a file variable equal to a path that we specify
			File x = new File("C:\\test\\brandon.txt");
			
			//here is where we test if it exists
			//if the file we created into a variable exists within the file path
			if (x.exists()) {
				//output that it was found and it's name by using {fileName}.getName()
				System.out.println(x.getName() + " exists within the system!");
			}
			else
			{
				//otherwise, it does not exist
				System.out.println(x.getName() + " does not exist within the system!");
			}
	}
}
