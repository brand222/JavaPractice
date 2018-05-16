package basics;
/*
 * In this program we are looping through an array and print each index value into a table that 
 * we are printing out to the console.
 */
public class arrayTables {
	public static void main(String[] args) {
		//here we created table headers ('\t' stands for tab)
		System.out.println("index\tValue");
		int grades[] = {32, 12, 43, 43, 23};
		//here we are looping through the length of the array and iterating by +1 each iteration
		for (int i = 0; i < grades.length; i++) {
			//here we are printing the index value, tab, and the index position value
			System.out.println(i + "\t" + grades[i]);
		}
	}
}
