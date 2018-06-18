package composition;

/* 
 * Composition is when you reference another object through your class.
 */
public class brandon {
	private String name;
	private people birthday;
	
	//this constructor takes a string and an object as arguments
	public brandon(String theName, people theDate) {
		name = theName;
		birthday = theDate;
	}
	
	public String toString() {
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}

}
