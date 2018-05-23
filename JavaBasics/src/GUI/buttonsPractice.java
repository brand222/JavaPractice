package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class buttonsPractice extends JFrame {

private JButton button1;
private JButton custom;

public buttonsPractice() {
	super("The title");
	setLayout(new FlowLayout());
	
	button1 = new JButton("ButtonTitle");
	add(button1);
}
}
