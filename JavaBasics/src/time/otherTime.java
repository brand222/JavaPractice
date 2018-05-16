package time;

public class otherTime {
	
	public static void main(String[] args) {
		//create our object so we can access methods inside time class
		time t = new time();
		//here we print out the military time without arguments being passed into setTime function
		System.out.println(t.toMilitary());
		//call the set time function to pass the hh:mm:ss
		t.setTime(3, 10, 58);
		//print out the military time for passed pararmeters into setTime()
		System.out.println(t.toMilitary());
	}

	
}
