package basics;

public class switchStatements {
/*Here is an example of a switch statement.
 * It evaluates the value, and the applies the value to one of the 
 * cases below.
 *  These will save you a bunch of time from creating a bunch of if statements.
 */
	public static void main(String[] args) {
		int age;

		age = 3;
		//here we are looking at the age variable
		switch (age) {
		//if age is equal to 1 then do this 
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			//if age is equal to 2 then do this etc...
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trouble");
			break;
		default:
			System.out.println("I don't know how old you are");
			break;

		}
	}
}
