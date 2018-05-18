package GUI;
//here we just imported the layout of our GUI program
import java.awt.FlowLayout;
//this imports all the basic windows features (title bars, minimize, maximize etc..)
import javax.swing.JFrame;
//this allows you to output texts and labels on the screen
import javax.swing.JLabel;
//this class is inheriting all the features from JFrame
public class GUIExercise2 extends JFrame {
	
	private JLabel item1;
	
	public GUIExercise2() {
		//this adds the title
		super("The title bar");
		//this adds the layout
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is gonna show up upon hovering");
		add(item1);
	}
}
