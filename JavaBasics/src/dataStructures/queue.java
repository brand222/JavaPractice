package dataStructures;

import java.util.*;

public class queue {
	
	public static void main(String[] args) {
		//here is how you create a queue
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		//to add something to a queue you must 'offer'
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		//peek looks at element with the highest priority
		//this is the element that will be taken care of first in the queue
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		//pull takes a specific element and removes it from the queue
		q.poll();
		//notice when you run this, it removed first
		//second and third remain
		System.out.printf("%s, ", q);
	}
	
	
}
