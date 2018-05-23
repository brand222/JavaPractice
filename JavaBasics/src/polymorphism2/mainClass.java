package polymorphism2;

public class mainClass {

	public static void main(String[] args) {
		//here we are creating an array of type animal (of 4 objects)
		animal[] thelist = new animal[4];
		dog d = new dog();
		fish f = new fish();
		horse h = new horse();
		cat c = new cat();
		//here we are adding each object type to the array
		thelist[0] = d;
		thelist[1] = f;
		thelist[2] = h;
		thelist[3] = c;
		//here we are using an enhanced for loop
		//it will loop through each animal object within the array
		//and will call the overrided noise method for each animal subclass
		for (animal a : thelist) {
			a.noise();
		}
		
		
	}
}
