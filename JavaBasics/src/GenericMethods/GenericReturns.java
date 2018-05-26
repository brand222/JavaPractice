package GenericMethods;

public class GenericReturns {

	public static void main(String[] args) {
		System.out.println(max(43, 42, 44));
		
	}
	//only objects that inherit from Comparable class can be used
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T maximum = a;
		//compare to returns a negative, positive, or zero (if they are equal)
		if (b.compareTo(a) > 0){
			maximum = b;
		}
		
		if (c.compareTo(maximum) > 0) {
			maximum = c;
		}
		return maximum;
	}
}
