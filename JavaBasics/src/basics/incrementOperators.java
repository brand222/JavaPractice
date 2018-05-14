package basics;

public class incrementOperators {

	
	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 18;
		//this is an example of pre-incrementing
		//this will print out number1 + 1
		System.out.println(++number1);
		//this is an example of post-incrementing
		//this will only print out the current value of number1
		//on this line, which is 6
		System.out.println(number1++);
		//here is another way to increment
		//this should output 12 because 7 + 5 = 12
		number1 = number1 + 5;
		System.out.println(number1);
		
		//here is the simplest way to increment
		//this should equal 26 because 18 + 8 = 26
		number2 += 8;
		System.out.println(number2);
		
		
	}
	
}
