package loops;

public class loopPractice {

	public static void main(String[] args) {

//		int i = 1;
//
//		while (i <= 20) {
//
//			if (i == 3) {
//
//				i += 2;
//				// the continue statement will make this jump back to the top to
//				// continue the loop
//				continue;
//			}
//			System.out.println(i);
//			i++;
//
//			if ((i % 2) == 0) {
//				i++;
//			}
//
//			if (i > 10) {
//				// this means to break out of the loop
//				break;
//			}
//		}

//		double myPi = 4.0;
//
//		double j = 3.0;
//
//		// 4 -4/3 + 4/5 - - 4/7
//		while (j < 1000000) {
//			myPi = myPi - (4 / j) + (4 / (j + 2));
//			j += 4;
//			System.out.println(myPi);
//		}

		System.out.println("Value of PI" + Math.PI);

		// do while loop example
		// Use a do-while loop when you know you want the code to execute at
		// least once

		int k = 10;

		do {
			System.out.println(k);
			k++;
		} while (k < 10);

		// for loop example
		for (int l = 10; l >= 1; l--) {
			System.out.println(l);
		}
		
		//example of declaring variables outside for loop
		int m, n;
		for (m=1, n=2; m<=9; m+=2, n+=2) {
			System.out.println(m + "\n" + n);
		}
	}
}
