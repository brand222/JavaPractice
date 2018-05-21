package abstractClassesAndMethods;

/*
 * The purpose of abstract classes are to be extended or inherited from.
 */
public abstract class food {
	// abstract methods do not need a body and must be implemented in the
	// inheriting classes (subclasses)
	public abstract void eat();
	//here is an example of a non-abstract method
	//notice that we needed to provide a body to this
	//classes that inherit this class will not HAVE to implement this method
	public void burp(){
		System.out.println("BURP!!!!!!!");
	}

}
