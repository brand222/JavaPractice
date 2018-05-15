package constructors;

public class tuna {

	private String girlName;
	//here is a constructor method. notice we names the method name
	//the same as the class
	public void tuna(String name) {
		girlName=name;
	}
	
	
	
	
	public void setName(String name) {
		girlName=name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
	}
}
