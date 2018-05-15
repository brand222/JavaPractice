package basics;

/*A conditonal ("Ternary") operator is another way to use an 'if' statement but 
 * it is really compact and small.
 */
public class conditionalOperators {

	public static void main(String[] args) {
		int score = 21;
		//if the condition is true, we will execute the first option (to the right of the '?')
		//if the condition is false, we will execute the second option (to the right of the ':')
		System.out.println(score >= 70 ? "You passed" : "You failed");
	}
}
