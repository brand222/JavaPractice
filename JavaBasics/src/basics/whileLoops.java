package basics;

public class whileLoops {
/*
 * Here is an example of a while loop. This prints out numbers 1 - 20.
 * Notice that the counter variable is inside the while loop block.
 */
	public static void main(String[] args) {
		//initialize our counter variable
		int counter = 0;
		//while the counter variable is less than or equal to 20, print out the number and increment by 1
		while (counter <= 20){
			System.out.println(counter);
			counter++;
		}
		
	}
	
}
