package basics;
/* In this class we are creating simple methods that we 
 * will be referencing in another class (name.java). Please take
 * note of the getter and setter method we have in this class for 
 * future reference.
 */
public class methodsAndInstances {

	private String girlName;
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
