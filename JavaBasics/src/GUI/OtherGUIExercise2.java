package GUI;
import javax.swing.JFrame;
public class OtherGUIExercise2 {

	public static void main(String[] args) {
		//here we create our GUIExercise2 object
		GUIExercise2 gui = new GUIExercise2();
		//the gui terminates upon clicking the 'x' button.
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(275, 180);
		gui.setVisible(true);
	}
}
