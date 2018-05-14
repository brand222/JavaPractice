package basics;

public class logicalOperators {
/* Here we have an example of logical operators (<, >, <=. >=, ==, !=, &&, || etc...)
 */
	
	public static void main(String[] args) {
		
		int yourAge;
		
		yourAge = 28;
		//if you are less than 13, you are a child
		if (yourAge < 13) {
			System.out.println("You are a child");
		}
		//if you are 13 or older and less than 20, you are a teenager
		else if (yourAge >= 13 && yourAge <= 19) {
			System.out.println("You are a teenager");
		}
		//conditions for being a young adult
		else if (yourAge >= 20 && yourAge <= 32) {
			System.out.println("You are a young adult");
		}
		//conditions for being an adult
		else if (yourAge >= 33 && yourAge <= 45 ) {
			System.out.println("You are an adult");
		}
		else 
		{
			//conditions for being older adult
			System.out.println("Older Adult");
		}
	}
}
