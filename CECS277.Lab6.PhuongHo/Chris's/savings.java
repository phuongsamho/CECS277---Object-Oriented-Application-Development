import javax.swing.*;
public class savings extends JFrame
{
	savings()
	{
		setTitle("Savings Calculator");
		setSize(275,400);
		setLocation(0,0);
		setResizable(false);
		JPanel panel = new savingsPanel();
		this.add(panel);
	}
}
