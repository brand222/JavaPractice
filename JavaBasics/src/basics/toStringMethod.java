package basics;

public class toStringMethod {
	private int month;
	private int day;
	private int year;
	
	public toStringMethod(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		//when we write this, this just means whatever object we just built.
		//'this' means that we are referencing the current object
		System.out.printf("The constructor for this is %s\n", this);
	}
	//anytime you need a string representation of an object, you can use toString() method.
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
	

}
