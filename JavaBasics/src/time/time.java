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
}