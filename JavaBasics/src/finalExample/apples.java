package finalExample;

public class apples {
	
public static void main(String[] args) {
	//here we made a new object
	tuna tunaObject = new tuna(10);
	//here we are looping through 5 times and printing out the sum
	for (int i = 0; i < 5; i++) {
		//we call on the add method and add (10) to the sum
		//the next iteration, it continues to add this to the sum
		tunaObject.add();
		System.out.printf("%s", tunaObject);
	}
}
}
