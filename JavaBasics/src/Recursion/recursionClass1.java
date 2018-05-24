package Recursion;

/*
 * What is Recursion or a 'Recursive Method'?
 * It is basically a method that calls itself
 * With each method call, the problem become simpler
 * We must have a condition that leads to the method no longer making another method call on itself
 */
public class recursionClass1 {

	public static void main(String[] args) {
		// For example, a factorial is a number we provide like 5
		// factorial of 5 = 5 * 4 * 3 * 2 * 1
		
		//here we are calling our factorial method
		System.out.println(fact(8));

	}

	// here is an example of a factorial method
	public static long fact(long n) {
		// first we have our condition that leads to the method no longer making
		// another
		// method call on itself
		// in this case, if n is less than or equal to 1, then just return 1
		if (n <= 1) { //the 'BASE CASE'
			return 1;
		}
		// otherwise, we will return:
		// n * the method call +argument - 1
		// so it will call itself and do the math over and over until it gets to
		// the stop condition
		else {
			System.out.println(n);
			return n * fact(n - 1);
		}

	}
}
