package time;

public class time {

	private int hour;
	private int minute;
	private int second;


	// here we created a function that accepts integers as the hh:mm:ss
	public void setTime(int h, int m, int s) {
		// here we created limitations on what numbers are entered.
		// if the integer that is passed for each parameter exceeds the bounds,
		// make it zero
		// NOTE: we used a ternary operator for this. (if the number fits the
		// criteria ? make it that number
		// otherwise : set it equal to zero
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	//here we are setting our military time
	public String toMilitary() {
		//here we are returned a formatted string (%02d: means that we are setting the value to 2
		//decimal places and dividing each value by a colon
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toNormalTime() {
		//firstly, we created a formated string that we are returning.
		//%d: means 1 decimal place separated by a colon
		//%02d: the minute will have 2 decimal places separated by a colon
		//%02d: means 2 decimal places separated by a colon
		//$s means that the 'AM' or 'PM' is just a string
		
		/*
		 * Then we say: If hour is exactly equal to 0 or 12, make it 12
		 * If they put anything else, divide it by 12 and give our remainder (i.e. if they put 18, make it 1)
		 * Pass the minute and second variables
		 * If the hour is less than 12, make it AM, otherwise, make it PM
		 */
		return String.format("%d:%02d:%02d %s", ((hour==0 || hour ==12 ? 12 : hour%12)), minute, second, (hour < 12 ? "AM" : "PM"));
	}
}
