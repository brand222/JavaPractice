package regexPractice;

import java.util.regex.*;

public class regex {

	public static void main(String[] args) {
		
		String longString = "Brandon McDonald TX  212-293-9495 Feathergrass Ct Austin brandonmcdonald FE BR 713 829 3638 (713-493-2348";
		String strangeString = "1Z aaa **** ** {{{ {{ { ";
		
		
		
		//[A-Z]
		//[0-9]
		//[^A-G]
		//\\s - whitespace
		//{n,m}
		
		//looking for a word that is 2 - 20 characters in length 
		//[A-Za-z]{2,20} 	\\w{2,20
		
		//regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//regexChecker("\\s\\d{5}\\s", longString);
		
		//2 characters that start with a F or A (with the next letter being: E or R)
		//F[E]|B[R]
		
		//regexChecker("F[E]|B[R]", longString);
		
		//get the minimum and maximum
		
		//{5,}
		// +
		// . ^ * + ?{} [] \ | () - these always need to be backslashed
		
		//regexChecker("(\\{{1,})", strangeString);
		
		//regexChecker("\\sjohnsmith@hotmail.com", longString);
		
		//extracts all the phone numbers (regardless spaces and dashes)
		regexChecker("(\\d+-\\d+-\\d+|\\d+\\s+\\d+-\\d+|\\d+\\s+\\d+\\s+\\d+)", longString);
		//extracts states
		//regexChecker("\\d.+\\s", strangeString);
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		//here we are creating a pattern where we pass in the string parameter
		Pattern checkRegex = Pattern.compile(theRegex);
		//here we create a matcher variable
		Matcher regexmatcher = checkRegex.matcher(str2Check);
		//while 
		while(regexmatcher.find()){
			//if it has a value and a length
			if (regexmatcher.group().length() != 0) {
				//we will get rid of white space
				System.out.println(regexmatcher.group().trim());
			}
			//print out the starting and ending index
			System.out.println("Start index: " + regexmatcher.start());
			System.out.println("End index:" + regexmatcher.end());
		}
	}
}

