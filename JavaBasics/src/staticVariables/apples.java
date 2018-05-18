package staticVariables;

import java.io.ObjectInputStream.GetField;

public class apples {

	public static void main(String[] args) {
		//here we are creating our tuna objects and adding our arguments due to 
		//the constructor that we created within the tuna class
		tuna member1 = new tuna("Gal", "Gadot");
		tuna member2 = new tuna("Kristin", "Kreuk");
		tuna member3 = new tuna("Margot", "Robbie");
		
		System.out.println();
		//here we are invoking 
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		//getMembers() shares accross all objects (shared among all objects)
		//static means that this variable is shared accross all objects
		System.out.println(member2.getMembers());
	}
}
