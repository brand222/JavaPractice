package inheritance;

public class apples {
public static void main(String[] args) {
	//here we are creating our objects of type tuna and potpie
	tuna tunaObject = new tuna();
	potpie potpieObject = new potpie();
	//here we are calling the methods that we inherited from the food class
	tunaObject.eat();
	System.out.println();
	potpieObject.eat();
}
}
