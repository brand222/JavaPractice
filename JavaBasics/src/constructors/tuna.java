package constructors;

public class tuna {

	private String girlName;
<<<<<<< HEAD
	//here is a constructor method. notice we names the method name
	//the same as the class
	public void tuna(String name) {
		girlName=name;
	}
	
	
=======
	//here, we are creating a method of type tuna
	//where we do not have to create a getter and setter, we simply
	//have a constructor here for each time we create an object of type
	//tuna, we must pass the name argument.
	public tuna(String name){
		girlName=name;
	}
>>>>>>> 97c3cdad68811dec95ce8a5c38e0c036404ae5a4
	
	//here is an example of a setter method. 
	//we take the girlName variable and set it equal
	// to what name argument we pass to this
	public void setName(String name) {
		girlName=name;
	}
	//here we are actually getting the name and returning what was 
	//passed into the setName function
	public String getName() {
		return girlName;
	}
	//here we are calling the getName function which is whatever 
	//we passed into setName
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
	}
}
