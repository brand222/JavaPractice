package conditionals;

public class switchStatements {

	public static void main(String[] args) {

		char theGrade = 'B';

		switch (theGrade) {
		case 'A':
			System.out.println("Great Job!");
			break;

		case 'B':
			System.out.println("Good Job!");
			break;
			
		case 'C':
			System.out.println("You did okay..");
			break;
			
		case 'D':
			System.out.println("You barely passed!");
			break;
			
		case 'F':
			System.out.println("You failed!");
			break;
		}

	}
}
