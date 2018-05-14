package basics;

import java.util.concurrent.SynchronousQueue;

public class tuna {

	public void simpleMessage(String name) {
		System.out.println(name + " is your name!");
	}
	
	public static String reverseString(String value) {
		String result = "";
		for (int i = value.length()-1; i >= 0; i--) {
			result += value.charAt(i);
		}
		return result.toLowerCase();
	}
	
	public static boolean isPalindrome(String value) {
		String reversed = reverseString(value);
		
		if (value.toLowerCase().equals(reversed)) {
			System.out.println("Palindrome!");
			return true;
		}
		else
		{
			System.out.println("NOT Palindrome!");
			return false;
		}
	}
}
