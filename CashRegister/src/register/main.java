package register;


import javax.swing.JFrame;

public class main
{
	public static void main(String[] args)
	{
		JFrame rFrame= new JFrame("Cash Register");
		
		passwordPanel passPanel = new passwordPanel();
		
		rFrame.add(passPanel);
		
		rFrame.setSize(700, 700);
		rFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rFrame.setVisible(true);
	}
}
