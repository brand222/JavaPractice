package GUI;

import javax.swing.JFrame;

public class mainClass {

	public static void main(String[] args) {
		buttonsPractice GUIObject = new buttonsPractice();
		GUIObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUIObject.setSize(300, 200);
		GUIObject.setVisible(true);
	}
}
