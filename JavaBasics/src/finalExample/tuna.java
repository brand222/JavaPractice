package finalExample;

public class tuna {

	private int sum;
	//this number stays the same after assigning it a value
	private final int NUMBER;
	
	public tuna(int x) {
		NUMBER = x;
	}
	//here is our add method. Add the number we pass to the sum
	public void add() {
		sum+=NUMBER;
	}
	//convert the sum to a string
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
}
