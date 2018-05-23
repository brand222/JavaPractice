package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class buttonsPractice extends JFrame {

	//here we created two variables that hold our buttons
private JButton button1;
private JButton custom;

//here we created the constructor for buttonsPractice class
//this basically means each time  we create an object of type buttonsPractice, then it will 
//invoke this code that we wrote here
public buttonsPractice() {
	super("The title");
	setLayout(new FlowLayout());
	//here we created a button object
	button1 = new JButton("ButtonTitle");
	//here we are adding the button to the layout
	add(button1);
	//here we added two images into our src folder structure and added them to the 
	Icon b = new ImageIcon(getClass().getResource("BL.png"));
	Icon r = new ImageIcon(getClass().getResource("rs.png"));
	custom = new JButton("Custom", b);
	custom.setRolloverIcon(r);
	add(custom);
	
	//here we are creating even handlers for our buttons
	HandlerClass handler = new HandlerClass();
	button1.addActionListener(handler);
	custom.addActionListener(handler);
	
}
//here we created a class within this class that takes care of the action listener
private class HandlerClass implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		//when the user clicks or interacts with the button, show a message box and print this out.
		JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
	}
}
}
