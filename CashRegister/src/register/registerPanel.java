package register;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class registerPanel extends JPanel
{
    //Instance variables 
    JButton Barrett, nonBarrett, mg, cash;
	JButton zero, one, two, three, four, five, six, seven, eight, nine;
    
	JLabel lunch, guests, result;
    
	JPanel guestPanel, keyPanel, resultPanel;
	JPanel mealTypePan, buttonPanel1, buttonPanel2, buttonPanel3, buttonPanel4;//to hold the meal type buttons
	
	JTextArea tally;
    
    //Constructor
    public registerPanel()
    {
        this.setLayout(new BorderLayout());//sets the layout of registerPanel
        
        //Display mealtime
        lunch = new JLabel("LUNCHTIME", JLabel.CENTER); //places text in center of label
        this.add(lunch, BorderLayout.NORTH);
        
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
		
		this.add(mealTypePan, BorderLayout.WEST);
		
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
		
		this.add(guestPanel, BorderLayout.CENTER);
		

		
		
		//Tally the total cost
		resultPanel = new JPanel(new BorderLayout());
		result = new JLabel("Total", JLabel.CENTER);
		resultPanel.add(result, BorderLayout.NORTH);
		
		tally = new JTextArea(5,10);
		resultPanel.add(tally, BorderLayout.CENTER);
		
		this.add(resultPanel, BorderLayout.EAST);
		/*input1 = new JLabel("input 1:");
		input2 = new JLabel("input 2:");
		result = new JLabel("result:");
		
		
		inField1 = new JTextField(10);
		inField2 = new JTextField(10);
		resultField = new JTextField(10);
		
		//ActionListeners
		Barrett.addActionListener(new ButtonListener());
		nonBarrett.addActionListener(new ButtonListener());
		mg.addActionListener(new ButtonListener());
		cash.addActionListener(new ButtonListener());
		
		//Button Panels
		buttonPanel1 = new JPanel(new GridLayout(1,1));
		buttonPanel2 = new JPanel(new GridLayout(1,1));
		buttonPanel3 = new JPanel(new GridLayout(1,1));
		buttonPanel4 = new JPanel(new GridLayout(1,1));
		
		
		
		//Add to panel
		
		//Button Panel
		buttonPanel1.add(Barrett);
		buttonPanel2.add(nonBarrett);
		buttonPanel3.add(mg);
		buttonPanel4.add(cash);
		
		//Row 1 -- input1
		this.add(buttonPanel1);
		this.add(inField1);
		
		//Row 2 -- input2
		this.add(buttonPanel2);
		this.add(inField2);
		
		//Row 3 -- buttons
		this.add(buttonPanel3);
		this.add(result);
		
		//Row 4 -- result
		this.add(buttonPanel4);
		this.add(resultField);*/
		
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