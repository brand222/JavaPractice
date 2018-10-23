package stringsAndStringBuilders;

import java.util.Arrays;

public class stringBuilders {

	public static void main(String[] args) {

		String randomString = "I'm just a randomString";

		/*
		 * Commonly-used escape codes: \n - new line \b - backspaces \" - quotes
		 * \\ backslash
		 */

		String gotToQuote = "He said, \"I'm here\" ";
		System.out.println(randomString + " " + gotToQuote);

		int numTwo = 2;

		System.out.println(randomString + " " + numTwo);

		String uppercaseSTr = "BIG";
		String lowercaseSTr = "big";

		if (uppercaseSTr.equalsIgnoreCase(lowercaseSTr)) {
			System.out.println("They're equal");
		}

		String letters = "abcde";
		String moreLetters = "fghijk";
		// index of a string
		System.out.println("2nd char: " + letters.charAt(1));
		// negative will come back if precendent is less than subsequent
		// argument
		System.out.println(letters.compareTo(moreLetters));
		// contains
		System.out.println(letters.contains("de"));
		// starts with
		System.out.println(letters.startsWith("a"));
		// ends with
		System.out.println(letters.endsWith("g"));

		// starting index position of a string argument
		System.out.println(letters.indexOf("cd"));
		// you can also specify the index to start searching from
		// indexOf(StringToLookFor, IndexStartPosition)

		// lastIndexOf() works; like indexOf except it starts from the
		// end of the String you are searching
		
		//length of string
		System.out.println("Length: " + letters.length());
		
		//replace certain characters within a string
		System.out.println(letters.replace("abc", "xy"));
		
		String[] letterArray = letters.split("");
		
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		
		
		/*
		 * Substring
		 * 
		 * (2, 4) = Starting at index position 2, grab the next 4 characters
		 */
		
		System.out.println(letters.substring(1, 4));
		
		System.out.println(letters.toUpperCase());
		System.out.println(letters.toLowerCase());
		
		
		//trim() eleminates trailing or preceding spaces
		String randString = "       abfafjajf";
		System.out.println(randString.trim());
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again "));
		
		System.out.println(randSB);
		
		//deleting values from array
		System.out.println(randSB.delete(15,  21));
		
		
		System.out.println(randSB.capacity());
		//adding capacity to a string
		randSB.ensureCapacity(60);
		
		System.out.println(randSB.capacity());
		
		//string length
		System.out.println(randSB.length());
		
		randSB.trimToSize();
		
		System.out.println(randSB.capacity());
		
		
		System.out.println(randSB.insert(1, "nother"));
		
		String oldSB = randSB.toString();
		
		//charAt()
		//indexOf()
		//lastIndexOf()
		//subString() - all works the same
	}
}
