package basics;
/*
 * This is a simple program that compounds the interest gained on money
 * that you have saved inside of your bank account at 10% interest gained per day
 */
public class compoundInterest {
public static void main(String[] args) {

	double amount;
	double principle = 10000;
	double rate = .01;
	//here we have a loop that says 
	//"for 20 days, compound the interest and print out the total interest accrued
	for (int day = 1; day<=20; day++) {
		amount = principle* Math.pow(1+ rate, day);
		System.out.println(day + "   " + amount);
	}
}
}

		
