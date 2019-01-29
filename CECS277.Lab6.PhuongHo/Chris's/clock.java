import javax.swing.*;
public class clock extends JFrame
{
	clock()
	{
		setTitle("Clock");
		setSize(500,500);
		setResizable(false);
		setLocation(0,0);
		JPanel panel = new clockPanel();
		this.add(panel);
	}
}
