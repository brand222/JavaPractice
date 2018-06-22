package dataStructures;
import java.util.*;

public class linkedLists {

	public static void main(String[] args) {
		//here is our array
		String[] things = {"pizza", "tikka", "thai", "chili", "tacos"};
		List<String> list1 = new LinkedList<String>();
		
		//here we are feeding the array items into the list
		for (String x : things) {
			list1.add(x);
		}
		
		//heres our other array
		String[] things2 = {"sausage", "crepes", "cake", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for (String y : things2) {
			list2.add(y);
		}
		//addAll is a linkedList method that takes everything from the first list and adds it 
		//to the other list
		list1.addAll(list2);
		list2 = null;
		System.out.println("Here we are simply printing out all items of the list that has been added with list2 items:");
		printMe(list1);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		//this call will remove items 2 - 4 (because it does not remove the 'to' item)
		System.out.println("Here we are removing certain items from the list:");
		removeStuff(list1, 2,5 );
		printMe(list1);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("Here we are reversing the list:");
		reverseMe(list1);
	}
	
	//here we create our method for printing out all the objects of a list
	private static void printMe(List<String> list) {
		for (String item : list) {
			System.out.printf("%s ", item);
			System.out.println();
		}
	}
	//the int from and int 2 is where we pass in a range of number (FROM this TO this)
	private static void removeStuff(List<String> list, int from, int to) {
		//sublist is where you provide a range inside the list
		//the .clear() method removes the specified items from the list
		list.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> list) {
		ListIterator<String> i = list.listIterator(list.size());
		while(i.hasPrevious()) {
			System.out.printf("%s ", i.previous());
		}
	}
}
