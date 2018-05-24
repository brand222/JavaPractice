package Collections;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * List methods come from the Collections class
 */
public class listMethods {

	public static void main(String[] args) {
		String[] fruits = {"dragonfruit", "apples", "oranges", "grapes", "banannas"};
		//here we converted the array to a list
		List<String> list = Arrays.asList(fruits);
		//this line sorts the list in alphabetical order
		//you can call methods from the Collections class and use these methods to change a list(collection)
		Collections.sort(list);
		//lets print out the contents of the list
		System.out.printf("%s\n", list);
		
	}
	
}
