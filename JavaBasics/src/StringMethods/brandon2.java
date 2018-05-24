package StringMethods;

public class brandon2 {

	public static void main(String[] args) {
		String s = "brandonmcdonaldbrandonmcdonald";
		//index of searching for the first instance of the specified character
		//in this case, it will return 3 (i.e. 0,1,2,3 = 'n')
		System.out.println(s.indexOf('n'));
		//when passing two arguments, you are saying:
		//starting at the index position specified in the second parameter,
		//search for the specified character
		//in this case, it will return 11 because we are looking for 'n' after the 7th character
		System.out.println(s.indexOf('n', 7));
		
		
		//here we demonstrate another way to concatenate strings
		//string.concat({stringArgument})
		String a = "Bacon ";
		String b = "      monster      ";
		System.out.println(a.concat(b));
		
		//here we demonstrate the 'replace()' method
		//we are specifying the character we want to get rid of and the character we want to add
		System.out.println(a.replace('B', 'F')); //this will print out 'Facon'
		
		//here we create a string with all capitalized letters
		System.out.println(a.toUpperCase());
		
		//trim method gets rid of spaces from the beginning and the end of the string
		System.out.println(b.trim());
	}
}
