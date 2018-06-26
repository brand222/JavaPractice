package threads;

public class mainClass {

	public static void main(String[] args) {
		
		Thread getTime = new GetTime20();
		
		Runnable getMail = new getTheMail(10);
		
		Runnable getMailAgain = new getTheMail(20);
		
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
	}
	
	
}
