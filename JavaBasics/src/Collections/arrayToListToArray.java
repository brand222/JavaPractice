package Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class arrayToListToArray {
	public static void main(String[] args) {
		// here is our array
		String[] array = { "brandon", "effrosini", "madeline", "brad", "shelly" };
		// this line of code changed the array to the list and stored it into
		// the 'thelist' variable
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(array));
		// now we can use list methods on this list
		// this method adds an item to the list
		thelist.add("chris");
		thelist.addFirst("firstthing");
		// here we are simply printing out the contents of the array
		// notice that the 'chris' and 'firstthing' strings have not been added
		//to the array yet, because we have not converted this list back into an array
		for (String x : array) {
			System.out.printf("%s ", x);
		}
		System.out.println();
		// now we we will convert this list (which we added stuff to)
		//back into an array
		array = thelist.toArray(new String[thelist.size()]);
		
		//now lets loop through this again and check out the added contents
		for (String x : array) {
			System.out.printf("%s ", x);
		}

	}
}
