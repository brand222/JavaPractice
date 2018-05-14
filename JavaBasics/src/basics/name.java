package basics;

import java.util.Scanner;
/* In this class we are referencing 
 * our methods that we created in the 'methodsAndInstances.java' class
 */
public class name {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		methodsAndInstances object = new methodsAndInstances();
		System.out.println("enter name of first gf here: ");
		String temp = input.nextLine();
		object.setName(temp);
		object.saying();
	}
}
