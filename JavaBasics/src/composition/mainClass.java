package composition;

public class mainClass {
	public static void main(String[] args) {
		people peopleObject = new people(4, 5 ,6);
		brandon brandonPerson = new brandon("Brandon", peopleObject);
		
		System.out.println(brandonPerson);
	}
	
	

}
