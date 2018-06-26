package threads;

public class getTheMail implements Runnable {

	private int startTime;
	
	public getTheMail(int startTime) {
		this.startTime = startTime;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(startTime * 1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Checking Mail");
		
	}
	
	

}
