package eventHandling;
import javax.swing.JFrame;

public class mainClass {
//here is the entrypoint to our GUI application
	public static void main(String[] args) {
		
		eventHandlingExample gui = new eventHandlingExample();
		//create close operation
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the size of the window
		gui.setSize(300,300);
		//set the visibility to true
		gui.setVisible(true);
		
	}
}
