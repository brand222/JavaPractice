package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class moreCollectionsMethods2 {

	public static void main(String[] args) {

		// convert array to a list
		String[] movies = { "Anchorman", "Transformers", "40-year-old Virgin", };
		List<String> list1 = Arrays.asList(movies);
		// here we create an array list
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("reddit");
		list2.add("pornhub");
		// print contents of list2
		for (String x : list2) {
			System.out.printf("%s\n", x);
		}
		// add the contents of list1 to list2
		Collections.addAll(list2, movies);
		System.out.println();
		// now print out new list after adding movies into it
		for (String y : list2) {
			System.out.printf("%s\n", y);
		}
		// collections.frequency checks how many times a specified object is in
		// a list
		System.out.println(Collections.frequency(list2, "Anchorman"));
		
		//disjoint returns true if the two lists have no items in common
		//false means they do have items in common
		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof);
		
		if (tof) {
			System.out.println("These lists have nothing in common");
		}
		else
		{
			System.out.println("These lists must have something in common!");
		}
	}
}
