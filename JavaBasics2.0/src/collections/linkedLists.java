package collections;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedLists {

	public static void main(String[] args) {
		
		/*
		 * A linked list is suited when you need a collection for adding and deleting collections from (alot)
		 */
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> games = new LinkedList<String>();
		
		games.add("Borderlands 2");
		games.add("Osrs Mobile");
		games.add("Bioshock");
		games.add(2, "Call of Duty");
		
		for (String name : games) {
			System.out.println(name);
		}
		
		//adding to end of linkedlist
		games.addLast("Borderlands 1");
		//adding to first of linkedlist
		games.addFirst("Wolfenstein");
		//removing an item from linkedlist
		games.remove("Call of Duty");
		
		System.out.println("\nFirst index: " + games.get(0));
		//get last index
		System.out.println("\nLast index: " + games.getLast());
		
		//copy one linkedList to another by passing your list you copy in as parameter
		LinkedList<String> gameCopy = new LinkedList<String>(games);
		System.out.println("\ngameCopy: " + gameCopy);
		
		//checking if an item is contained within the linkedlist
		if (games.contains("Borderlands 2")) {
			System.out.println("\nBorderlands 2 is here!");
		}
		//comparing one linkedlist to another
		if (games.containsAll(gameCopy)) {
			System.out.println("\nBoth Collections are the same");
		}
		
		//checking the index of a particular linkedlist item
		System.out.println("\nBorderlands 1 index is at: " + games.indexOf("Borderlands 1"));
		
		//checking whether the list is empty or not (boolean)
		System.out.println("\nHow many: " + games.isEmpty());
		
		//checking the size of the linkedlist
		System.out.println("\nHow many: " + games.size());
		
		//check to see if there is a value to retrieve
		System.out.println("\nLook without error: " + games.peek());
		
		//remove first element from the linkedlist
		System.out.println("\nRemove first element: " + gameCopy.poll());
		
		//remove last element from linkedlist
		System.out.println("\nRemove first element: " + gameCopy.pollLast());
		
		//you can push a new value into the front of the list (first position)
		gameCopy.push("Zelda: Breath of the Wild");
		//pop means that we are chopping off the first element
		gameCopy.pop();
		
		for (String item : gameCopy) {
			System.out.println(item);
		}
		
		Object[] gameArray = new Object[4];
		//setting an array object equal to an array
		gameArray = games.toArray();
		System.out.println(Arrays.toString(gameArray));
	
	}
}
