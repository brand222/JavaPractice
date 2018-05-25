package Collections;

import java.util.List;
import java.util.*;

public class moreCollectionsMethods {

	public static void main(String[] args) {
		//create an array and convert to list
		Character[] array = {'p', 'w', 'n'};
		List<Character> list = Arrays.asList(array);
		System.out.println("List is :");
		output(list);
		
		//reverse and print out the list
		Collections.reverse(list);
		
		System.out.println("After reverse :");
		output(list);
		
		//create a new array and a new list
		Character[] newArray = new Character[3];
		List<Character> listCopy = Arrays.asList(newArray);
		
		//copy contents of list into listCopy
		// copy({destination}, {genesis})
		Collections.copy(listCopy, list);
		System.out.println("Copy of list :");
		output(listCopy);
		
		//fill collection with contents
		Collections.fill(list, 'X');
		System.out.println("After filling the list :");
		output(list);
	}
	//output method
	private static void output(List<Character> theList) {
		for (Character c : theList) {
			System.out.printf("%s\n", c);
		}
	}
}
