package basics;

public class apples {
	
	public static void main(String[] args) {
		//here we are creating a new object of type tuna (from the tuna class)
		tuna tunaObject = new tuna();
		//here we call the methods that we created inside of the tuna class
		tunaObject.simpleMessage("Brian");
		System.out.println(tunaObject.reverseString("Backwards"));
		System.out.println(tunaObject.isPalindrome("Non"));
	}

}
