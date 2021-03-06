package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//this gives us all the attributes and methods of a window so we can use it
public class eventHandlingExample extends JFrame {
	
	private JTextField txtField1;
	private JTextField txtField2;
	private JTextField txtField3;
	private JPasswordField passwordField;
	
	public eventHandlingExample() {
		super("The title");
		setLayout(new FlowLayout());
		//here we create our first textfield
		txtField1 = new JTextField(10);
		//here we are adding our textfield to the GUI
		add(txtField1);
		//this will give you default text in the field
		txtField2 = new JTextField("Enter text here");
		add(txtField2);
		txtField3 = new JTextField("uneditable", 20);
		//here we are making a textfield un-editable
		txtField3.setEditable(false);
		add(txtField3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		//listen for something to happen, and when it happens, execute some code
		theHandler handler = new theHandler();
		//here we are adding actionListeners to each of the fields
		txtField1.addActionListener(handler);
		txtField2.addActionListener(handler);
		txtField3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	//action listener allows you to put that listener onto something.
	//it will wait for something to happen, then once something happens,
	//it executes code
	private class theHandler implements ActionListener {
		//whatever happens inside of here is going to handle the event
		public void actionPerformed(ActionEvent event){
			String string = "";
			//if the user is entering something inside of the txtField1 etc..
			if (event.getSource() == txtField1) {
				//here we are getting the text from that particular location (getActionCommand)
				//set the empty string equal to what was entered into this text box 
				string = String.format("Field 1: %s", event.getActionCommand());
			}
			else if (event.getSource() == txtField2 ) {
				string = String.format("Field 2: %s", event.getActionCommand());
			}
			else if (event.getSource() == txtField3 ) {
				string = String.format("Field 3: %s", event.getActionCommand());
			}
			else if (event.getSource() == passwordField) {
				string = String.format("password field is : %s", event.getActionCommand());
			}
			//show the string on a messageDialog window
			JOptionPane.showMessageDialog(null, string);
		}
	}
}