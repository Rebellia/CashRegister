package register;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//This will hold the password panel and the registerPanel

public class passwordPanel extends JPanel{
	//Instance variables
	final String password = "hello";
	
	registerPanel regPanel = new registerPanel();
	
	JPanel enterPan;
	JLabel request, error;
	JTextField inputField;
	JButton submit;
	
	//Constructor
	public passwordPanel()
	{
		final String password = "hello";
		
		//Set up the panel for the password
		enterPan = new JPanel();
		request = new JLabel("Enter Password");
		error = new JLabel("");
		inputField = new JTextField();
		submit = new JButton("Click");
		
		enterPan.setLayout(new GridLayout(4,1));
		enterPan.add(request);
		enterPan.add(error);
		enterPan.add(inputField);
		enterPan.add(submit);
		
		//setup this panel to hold the others
		this.setLayout(new CardLayout());
		this.add(enterPan, "Enter Panel");
		this.add(regPanel, "Register Panel");
	}
	
	//buttonListener class for click
	class PasswordListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			CardLayout layout = (CardLayout)(passwordPanel.getLayout());
			JButton command = (JButton)event.getSource();
			if (command == submit)
			{
				String input = inputField.getText();
				if (input.equals(password))
				{
					layout.show(passwordPanel, "Enter Panel");
					inputField.setText("");
					error.setText("");
				}
				else
				{
					error.setForeground(Color.red);
					error.setText("INCORRECT PASSWORD");
					inputField.setText("");
				}
			}
		}
	} //end of PasswordListener class
	
	submit.addActionListener(new PasswordListener());
}
