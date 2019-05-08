package regexPractice;

import java.util.regex.*;

public class regex {

	public static void main(String[] args) {
		
		String s = "City: [name:NYK][distance:1100] [name:CLT][distance:2300] [name:KTY][distance:3540] Price:";
		String namesString = "brandon mcdonald, jennifer collete, jen bateman, jenny collete";

		String longString = "Brandon McDonald TX  212-293-9495 33220 Feathergrass 123 Main St. Ct Austin brandonmcdonald FE BR 713 829 3638 (713-493-2348";
		String strangeString = "1Z aaa **** ** {{{ {{ { ";

		// [A-Z]
		// [0-9]
		// [^A-G]
		// \\s - whitespace
		// {n,m}
		/*
		 * \d = any number \D = anything but a number \s = any space \S =
		 * anything but a space \w = any character \W = anything but a character
		 * . = any character except for a line break \b = a space that preceeds
		 * or follows a whole word ? = 0 or 1 repetitions * = 0 or more
		 * repetitions {n} = expect {n} number of times
		 * 
		 * Escaping: ex. searching for a dollar amount \$\d*\.\d{2} = search for
		 * a dollar sign followed by 0 or more numbers and then a period and a
		 * digit with a 2 length
		 */
		// . ^ * + ?{} [] \ | () - these always need to be backslashed
		
		regexChecker("\\[name:([A-Z]+)\\]\\[distance:(\\d+)\\]", s);
		
		//searches for all the jen-based names (full names)
		//regexChecker("\\s+je(n|nnifer|nny)\\s\\w+\\s*", namesString);

		// extracts all the phone numbers (regardless spaces and dashes)
		//regexChecker("(\\d+-\\d+-\\d+|\\d+\\s+\\d+-\\d+|\\d+\\s+\\d+\\s+\\d+)", longString);
	}

	public static void regexChecker(String theRegex, String str2Check) {
		// here we are creating a pattern where we pass in the string parameter
		Pattern checkRegex = Pattern.compile(theRegex);
		// here we create a matcher variable
		Matcher regexmatcher = checkRegex.matcher(str2Check);
		// while
		while (regexmatcher.find()) {
			// if it has a value and a length
			if (regexmatcher.group().length() != 0) {
				// we will get rid of white space
				System.out.println(regexmatcher.group().trim());
			}
			// print out the starting and ending index
			//System.out.println("Start index: " + regexmatcher.start());
			//System.out.println("End index:" + regexmatcher.end());
		}
	}
}
