package register;


import javax.swing.JFrame;

public class main
{
	public static void main(String[] args)
	{
		JFrame rFrame= new JFrame();
		
		registerPanel regPanel = new registerPanel();
		
		rFrame.add(regPanel);
		rFrame.setSize(500, 500);
		rFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rFrame.setVisible(true);
	}
}
