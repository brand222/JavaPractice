package basics;

public class elseIfStatement {

	public static void main(String[] args) {
		int score = 79;
		
		if (score >= 70 && score <= 74 ) {
			System.out.println("You passed!");
		}
		else if (score >= 75 && score <=79){
			System.out.println("You scored a C!");
		}
		else if (score >= 80 && score <= 84){
			System.out.println("You scored a B-");
		}
		else if (score >= 85 && score <= 89) {
			System.out.println("You scored a B+");
		}
		else if (score >= 90 && score <= 94) {
			System.out.println("You scored an A-");
		}
		else
		{
			System.out.println("You scored an A+! Good Job!");
		}
	}
}
