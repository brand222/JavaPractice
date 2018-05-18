package multipleConstructors;

public class clock {
	// these variables are only meant to be used in this particular class
	private int hour;
	private int minute;
	private int second;

	/*
	 * Each one of these are constructors You can build different constructors
	 * depending on how much info the user enters You will notice that we are
	 * applying 'method overloading' in order to make a make constructors based
	 * on how much you enter (what arguments you pass) so you can cover all
	 * possible scenarios of what the user could possibly pass into the time
	 * method. (toMilitary)
	 */
	// constructor with no arguments
	public clock() {
		this(0, 0, 0);
	}

	// constructor with 1 argument
	// if the user doesn't pass minutes or seconds as arguments, then just set
	// them to zero
	public clock(int h) {
		this(h, 0, 0);
	}

	// constructor with 2 arguments
	// if the user doesn't pass the seconds as an argument, just set it equal to
	// zero
	public clock(int h, int m) {
		this(h, m, 0);
	}

	// constructor with 3 arguments
	// the user passes all three arguments, therefore we will be using all of
	// them to calculate the time
	public clock(int h, int m, int s) {
		setTime(h, m, s);
	}

	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}

	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	}

	public void setSecond(int s) {
		second = ((s >= 0 && s < 60) ? s : 0);
	}

	//
	public int getHour() {
		return hour;
	}

	// getter method for minutes
	public int getMinute() {
		return minute;
	}

	// getter method for seconds
	public int getSecond() {
		return second;
	}

	// here we built all the methods we need to call inside of a single function
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

}