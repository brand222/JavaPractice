package dataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSets {
	/*
	 * A collection that cannot contain any duplicate items.
	 */
	public static void main(String[] args) {
		//here we created an array
		String[] things = {"Apple", "bob", "ham", "bacon", "bob", "bacon"};
		//here we converted the array to a list
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		//this will take a list and remove any duplicate items
		//we are passing the list in as a hashset object
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
	}
}
