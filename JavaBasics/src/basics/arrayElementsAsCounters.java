package basics;

import java.util.Random;

public class arrayElementsAsCounters {

	public static void main(String[] args) {
		Random rando = new Random();
		//made an array which contains 7 slots 
		int freq[] = new int[7];
		for (int roll = 1; roll < 1000; roll++) {
			//notice here that nextInt has 6 being passed into it
			//arrays are 0-indexed so this is total of 7 items
			//we made a random number generator, anytime we rolled, it would add 1 to the number
			++freq[1 + rando.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		//here we are just making a table of 6 items and printing it out
		//we are also printing out the index items of the array
	for (int face=1;face<freq.length;face++){
		//here we output the dice number and the actual value of the dice (array item)
		System.out.println(face+"\t"+freq[face]);
	}
	}

}
