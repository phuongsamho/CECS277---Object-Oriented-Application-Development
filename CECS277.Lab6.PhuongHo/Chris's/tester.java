import javax.swing.*;
public class tester extends JFrame
{
	tester()
	{
		setTitle("Lab #4");
		setSize(475,100);
		setResizable(false);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new testPanel();
		this.add(panel);
	}
}
