package eventHandling;
import javax.swing.JFrame;

public class mainClass {

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
