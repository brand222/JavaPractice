
public class variableLengthArguments {

	public static void main(String[] args) {
		System.out.println(average(2, 5, 3, 5, 7, 3, 2, 4, 5, 6, 7, 500));
	}

	// anytime you want to build a method where you dont know how many arguments
	// it will take,
	// you put what type it is (in the case, Int) and then the elipse (...) and
	// then name the variable
	public static int average(int... numbers) {
		int total = 0;
		for (int x : numbers) {
			total += x;
		}
		return total / numbers.length;
	}
}
