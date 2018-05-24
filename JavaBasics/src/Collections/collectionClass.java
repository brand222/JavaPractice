package Collections;

import java.util.ArrayList;
import java.util.List;

/*
 * What is a collection?
 * A collection is (similar to an array) something that holds references to objects and is dynamic
 * For a list, you don't have to specify how many objects will be inside of it (opposite from an array)
 */
public class collectionClass {
	public static void main(String[] args) {
		String[] myGames = {"runescape", "borderlands", "zelda", "bioshock"};
		//here we are creating a list.
		//we specify the data type of the list of objects we are creating here
		List<String> list = new ArrayList<String>();
		
		//add array items to list by using an enhanced for loop
		for(String x : myGames) {
			list.add(x);
		}
			String[] morethings = {"runescape", "zelda"};
			//if the top list contains anything in the 'morethings' list, then take it out
			List<String> list2 = new ArrayList<String>();
			//here we are adding the contents of the array to the list 
			//with an enhanced for loop
			for (String y : morethings) {
				list2.add(y);
			}
			//now we are simply printing out the contents of the list
			//notice that instead of .length() we are using .size() for the list we loop through
			//additionally, to reference a specific index position within the list
			//we use: "list.get()"
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s ", list.get(i));
			}
		}
	}
	
