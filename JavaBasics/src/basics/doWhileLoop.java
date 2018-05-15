package basics;
/*
 * The do while loop executes the body before it even gets to the test condition.
 * The loop will execute AT LEAST once before getting to the condition of whether
 * the body should execute or not.
 */
public class doWhileLoop {

	public static void main(String[] args) {
		//Initialize our iterator variable
		int i = 0;
		//here we create our body and say "Do this, no matter what"
		do{
			System.out.println(i);
			//here we iterate our variable (if the test is true)
			i++;
		}
		//while i is less than 10, go back and keep looping
		while (i <= 10);
	}
}
