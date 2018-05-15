package basics;

import java.util.Scanner;
/*This is a simple program that calculates the average over numbers that the user enters.
 */
public class averageProgram {

	public static void main(String[] args) {
		//take user input
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		//while our counter variable is less than 10, add each entered grade 
		//into the total variable. Then, after the loop, calculate the average based on the total/10 grades
		while (counter < 10) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is: " + average);
	}
}
