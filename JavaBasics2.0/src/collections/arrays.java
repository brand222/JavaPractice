package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



/*
 * Collections help keep track of groups of objects
 */



public class arrays {
	
	public static void main(String[] args) {
		
		/*Array lists are similar to arrays, except for the fact that they resize when you delete or add items to them.
		 * 
		 */
		//notice that you did not have to specify how big the array list is
		//because it automatically resizes upon adding items to it
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		//adding items to arrayList
		names.add("Brandon McDonald");
		names.add("Effrosini Chatzistogianni");
		names.add("Madeline McDonald");
		names.add("Michelle McDonald");
		names.add("Chris McDonald");
		names.add("tubby thompson");
		
		//adding to a specific index of arraylist
		names.add(2, "Brad McDonald");
		
		//looping through an arraylist
		System.out.println("Print out contents of arraylist: ++++++++++");
		for (int i = 0; i < names.size(); i++)	{ 
			//notice the .get() method for getting index position
			System.out.println(names.get(i));
		}
		System.out.println("Print out contents of array using .toString(): ++++++++++");
		System.out.println(names.toString());
		
		System.out.println("Printing items of array after changing a value using set(): ++++++++++");
		//changing elements of list
		names.set(1, "Effrosini McDonald");
		for (int i = 0; i < names.size(); i++)	{ 
			//notice the .get() method for getting index position
			System.out.println(names.get(i));
		}
		//removing items from arraylist
		names.remove(6);
		System.out.println("Printing items of array after removing name from array list: ++++++++++");
		
		//using enhanced for loop for looping through arraylists
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		System.out.println("Printing the items of the arraylist by creating an iterator object: ++++++++++");
		
		/*
		 * Here is another way to iterate through the arraylist
		 */
		//we create an iterator object for the names arraylist
		Iterator indivItems = names.iterator();
		//while the names arraylist has items,
		while (indivItems.hasNext()) {
			//print the next item
			System.out.println(indivItems.next());
		}
		
		/*
		 * COPY ONE ARRAY LIST TO ANOTHER
		 */
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		//copy one array list to another
		nameCopy.addAll(names);
		
		String oreo = "Oreo";
		names.add(oreo);
		
		if(names.contains(oreo)) {
			System.out.println("Oreo is here!");
		}
		
		//comparing one arraylist to another
		if (nameCopy.containsAll(names)){
			System.out.println("Everything in nameCopy is in names!");
		}
		else 
		{
			System.out.println("NO!");
		}
		
		//clearing all items within an arraylist
		names.clear();
		
		if (names.isEmpty()) {
			System.out.println("arraylist is empty!");
		}
		
		Object[] moreNames = new Object[4];
		//everything that was stored inside nameCopy, will be stored inside more names 
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
	}
	
	
	
	

}
