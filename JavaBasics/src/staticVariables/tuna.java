package staticVariables;

public class tuna {

	private String first;
	private String last;
	//when you change a static variable, all objects are changed
	//this variable is shared accross all objects created
	//this variable will not change between other objects
	private static int members = 0;
	
	//here we have a constructor method for tuna
	public tuna(String fn,String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s members in the club: %d\n", first, last, members);
	}
	//get the first name
	public String getFirst() {
		return first;
	}
	//get the last name
	public String getLast() {
		return last;
	}
	public static int getMembers() {
		return members;
	}
	
}
