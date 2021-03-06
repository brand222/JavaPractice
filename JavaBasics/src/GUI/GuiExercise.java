package GUI;
//this is the import statement that we need for frames
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * This is a simple program that demonstrates a basic GUI created from java code.
 * Java has built-in classes that stores the GUI components that you need. you just need
 * to tell the compiler where you want them and how you are going to use them.
 */
public class GuiExercise {

	public static void main(String[] args) {
		//here we are creating an object of type JOptionPane
		String fn = JOptionPane.showInputDialog("Please enter your first number");
		String sn = JOptionPane.showInputDialog("Please enter your second number");
		//here, we are taking a string and coverting it into an integer
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "The title", JOptionPane.PLAIN_MESSAGE);
		
	}
	

}
