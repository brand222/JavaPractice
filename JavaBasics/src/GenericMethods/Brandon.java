package GenericMethods;

public class Brandon {

	public static void main(String[] args) {
		//two arrays of different types
		Integer[] iray = { 1, 2, 3, 4 };
		Character[] cray = { 'b', 'r', 'a', 'n', 'd', 'o', 'n' };
		/*
		 * When calling on this method, the compiler will look
		 * for this printMe method for a type Integer and will not
		 * be able to find it. Then next, it will look for methods
		 * of generic type. This is where our generic method will be called.
		 * It can be used for any type of argument that we pass, thus,
		 * making it dynamic
		 */
		printMe(iray);
		printMe(cray);
	}
	//print method for integer array
//	public static void printMe(Integer[] i) {
//		for (Integer x : i) {
//			System.out.printf("%s ", x);
//			System.out.println();
//		}
	//}
// overloaded method for printing character array
// public static void printMe(Character[] j) {
// for (Character x : j) {
// System.out.printf("%s ", x);
// System.out.println();
// }

// instead of creating a bunch of overloaded methods, lets create a
//generic method that can take any argument
	
	//must always have the <T> before the return type
	//this takes any type of array (which makes it generic)
	public static <T> void printMe(T[] x) {
		for(T item : x) {
			System.out.printf("%s ", item);
			System.out.println();
		}
	}
}
