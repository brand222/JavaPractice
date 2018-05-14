package basics;

public class operators {

	public static void main(String[] args) {
		
		int number1, number2, Add, Subtract, Divide, Multiply, Modulus;
		number1 = 2;
		number2 = 9;
		//here we add two integers
		Add = number1 + number2;
		//here we subtract 2 numbers
		Subtract = number2 - number1;
		//here we divide 2 numbers
		Divide = number2 / number1;
		//here we multiply 2 numbers
		Multiply = number1 * number2;
		//here we take the modulus of two numbers (how many times can 2 fit into 5 evenly)
		//this is the way to find the remainder
		Modulus = number1 % number2;
		
		System.out.println(Modulus);
		
	}
}
