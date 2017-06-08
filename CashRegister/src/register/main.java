package register;


import javax.swing.JFrame;

public class main
{
	public static void main(String[] args)
	{
		JFrame rFrame= new JFrame();
		
		registerPanel regPanel = new registerPanel();
		
		rFrame.add(regPanel);
		rFrame.setSize(700, 700);
		rFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rFrame.setVisible(true);
	}
}
