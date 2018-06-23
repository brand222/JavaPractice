package operatorsPractice;


public class operators {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 50);
		
		/* Relational Operators:
		 * Java has 6 relational operators
		 * > : Greater than
		 * < : Less than
		 * == : Equal To
		 * != : Not Equal to
		 * >= : Greater Than or Equal to
		 * <= : Less Than or Equal to
		 */
		
		if (randomNumber < 5) {
			System.out.println("The number is less than 5");
		}
		else if (randomNumber == 7) {
			System.out.println("You win!");
		}
		else if (randomNumber <= 18) {
			System.out.println("The number is less than or equal to 18");
		}
		else if (randomNumber >= 40) {
			System.out.println("The number is greater than 40");
		}
		else if (randomNumber > 45) {
			System.out.println("The number is greater than 45");
		}
		else 
		{
			System.out.println("Nothing worked");
		}
		
		/*Logical Operators
		 * Java has 6 logical operators
		 * ! : Converts the boolean value to its right to its opposite false v true
		 * && : Returns true if the boolean value on the left and right are true 
		 * 
		 */
		if (!(false)) {
			System.out.println("\nI turned false into true");
		}
		
		if ((true) && (true)) {
			System.out.println("Both conditions are true, so im returning true!");
		}
		
		if ((true) | (false)) {
			System.out.println("I am returning true because one of the conditions is true");
		}
		
		if ((true) ^ (false)) {
			System.out.println("Returns true because we want 1 true and 1 false, thus the '^' symbol");
		}
		
		//ternary operator example:
		
		int valueOne = 1;
		int valueTwo = 2;
		// if valueOne > valueTwo, set biggestValue = valueOne, otherwise set it
		// equal to valueTwo
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		
		//switch statement example:
		
		char theGrade = 'A';
		
		switch(theGrade)
		{
		case 'A':
			System.out.println("great job!");
			break;
		case 'b':
		case 'B':
			System.out.println("You did ok...");
			break;
		case 'C':
			System.out.println("Eh....");
			break;
		case 'D':
			System.out.println("you didn't do well");
			break;
		case 'F':
			System.out.println("you failed.");
			break;
		}
	}
}
