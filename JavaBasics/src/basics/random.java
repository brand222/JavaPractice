package basics;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		//here we created our dice object of type random
		Random dice = new Random();
		int num;
		
		for (int i = 1; i <=10; i++){
			//the number that we passed to 'nextInt' is 0 indexed (it starts at 0)
			//by adding the '1 +', we are giving the illusion that we are providing nums 1 - 6
			num = 1 + dice.nextInt(6);
			System.out.println(num + " ");
		}
	}
}
