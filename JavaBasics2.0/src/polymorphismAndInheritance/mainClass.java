package polymorphismAndInheritance;

public class mainClass {

	public static void main(String[] args) {
		
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		System.out.println();
		
		//here we are creating a new cat object and accessing the methods of cat 
		Cat tom = new Cat("tom", "Tuna", "Rubber Mouse");
		System.out.println(tom.getName());
		System.out.println(tom.favFood);
		System.out.println(tom.favToy);
		System.out.println();
		
		Cat hobbs = new Cat("Hobbs", "icecream", "scratch mountain");
		System.out.println(hobbs.getName());
		System.out.println(hobbs.favFood);
		System.out.println(hobbs.favToy);
		
		acceptAnimal(hobbs);
	}
		public static void acceptAnimal(Animals randAnimal) {
			System.out.println(randAnimal.getName());
			System.out.println(randAnimal.favFood);
			System.out.println();
			
			randAnimal.walkAround();
			
			 //this wont work, we must cast this to a type Cat
			
		
		}
	}
