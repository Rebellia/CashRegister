package register;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class registerPanel extends JPanel
{
    /**
     * Class level instance variables
     * */
    JButton Barrett, nonBarrett, mg, cash;
	JButton zero, one, two, three, four, five, six, seven, eight, nine;
    JButton logout;
    
	JLabel lunch, guests, result;
    
	JPanel UpperPanel, LowerPanel, guestPanel, keyPanel, resultPanel;
	JPanel mealTypePan, buttonPanel1, buttonPanel2, buttonPanel3, buttonPanel4;//to hold the meal type buttons
	
	JTextArea tally;
    
    /**
     * Constructor
     * */
    public registerPanel()
    {
    	this.setLayout(new GridLayout(2,0)); //Sets the layout of the registerPanel
        
    	
    	/**
    	 * This part of the program sets up the upper panel
    	 * Displays the meal time
    	 * Gives the user the option to logout of the register
    	 * */
        //Display mealtime
    	//TODO -- Have the program calculate the meal time
        lunch = new JLabel("LUNCHTIME", JLabel.CENTER); //places text in center of label
 
        //TODO -- See if you can change the size of the button
        logout = new JButton("logout");
        
        
        UpperPanel = new JPanel(new GridLayout(1,2));
        UpperPanel.add(lunch);
        UpperPanel.add(logout);
        //this.add(lunch, BorderLayout.NORTH);
        this.add(UpperPanel);
        
        
        /**
         * This part of the program sets up the lower panel
         * Allows the user to select the customer type
         * Allows the user to select the number of guests arriving with the customer
         * Displays the total number of meals/guest passes used
         * */
        LowerPanel = new JPanel(new GridLayout(1, 3));
        
        //Buttons to determine customer type
        mealTypePan = new JPanel(new GridLayout(4, 1));
        Barrett = new JButton("Barrett Meal Plan");
		nonBarrett = new JButton("Non-Barrett Meal Plan");
		mg = new JButton("M & G");
		cash = new JButton("Cash/Credit");
		
		buttonPanel1 = new JPanel(new GridLayout(1,1));
		buttonPanel2 = new JPanel(new GridLayout(1,1));
		buttonPanel3 = new JPanel(new GridLayout(1,1));
		buttonPanel4 = new JPanel(new GridLayout(1,1));
		
		buttonPanel1.add(Barrett);
		buttonPanel2.add(nonBarrett);
		buttonPanel3.add(mg);
		buttonPanel4.add(cash);
		
		mealTypePan.add(buttonPanel1);
		mealTypePan.add(buttonPanel2);
		mealTypePan.add(buttonPanel3);
		mealTypePan.add(buttonPanel4);
		
		LowerPanel.add(mealTypePan);
		
		//Determine Number of guests
		guestPanel = new JPanel(new BorderLayout());
		guests = new JLabel("Number of Guests", JLabel.CENTER);
		guestPanel.add(guests, BorderLayout.NORTH);
		
		keyPanel = new JPanel(new GridLayout(4, 3));
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		
		keyPanel.add(zero);
		keyPanel.add(one);
		keyPanel.add(two);
		keyPanel.add(three);
		keyPanel.add(four);
		keyPanel.add(five);
		keyPanel.add(six);
		keyPanel.add(seven);
		keyPanel.add(eight);
		keyPanel.add(nine);
		guestPanel.add(keyPanel, BorderLayout.CENTER);
		
		LowerPanel.add(guestPanel);

		
		
		//Tally the total cost
		//TODO -- Get this to actually display something
		resultPanel = new JPanel(new BorderLayout());
		result = new JLabel("Total", JLabel.CENTER);
		resultPanel.add(result, BorderLayout.NORTH);
		
		tally = new JTextArea(5,10);
		resultPanel.add(tally, BorderLayout.CENTER);
		
		//this.add(resultPanel, BorderLayout.EAST);
		
		LowerPanel.add(resultPanel);
		
		this.add(LowerPanel);
		
    }
    
    
    
    //ButtonListener class
	/*private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Object selectedButton = event.getSource();
			double num1, num2;
			
			try
			{
				num1 = Double.parseDouble(inField1.getText());
			}
			catch (NumberFormatException e)
			{
				input1.setText("Invalid input");
				input1.setForeground(Color.red);
				return;
			}
			
			try
			{
				num2 = Double.parseDouble(inField2.getText());
			}
			catch (NumberFormatException e)
			{
				input2.setText("Invalid input");
				input2.setForeground(Color.red);
				return;
			}

			if (selectedButton == Barrett)
			{
				resultField.setText(num1 + num2 + "");
				input1.setText("Input 1:");
				input1.setForeground(Color.black);
				input2.setText("Input 2:");
				input2.setForeground(Color.black);
			}
			if (selectedButton == nonBarrett)
			{
				resultField.setText(num1 - num2 + "");
				input1.setText("Input 1:");
				input1.setForeground(Color.black);
				input2.setText("Input 2:");
				input2.setForeground(Color.black);
			}
			if (selectedButton == mg)
			{
				resultField.setText(num1 * num2 + "");
				input1.setText("Input 1:");
				input1.setForeground(Color.black);
				input2.setText("Input 2:");
				input2.setForeground(Color.black);
			}
			if (selectedButton == cash)
			{
				resultField.setText(num1 / num2 + "");
				input1.setText("Input 1:");
				input1.setForeground(Color.black);
				input2.setText("Input 2:");
				input2.setForeground(Color.black);
			}
		}
	}*/
}