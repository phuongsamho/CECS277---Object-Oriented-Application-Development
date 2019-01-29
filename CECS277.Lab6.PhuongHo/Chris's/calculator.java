import javax.swing.*;
public class calculator extends JFrame
{
	calculator()
	{
		setTitle("Calculator");
		setSize(300,300);
		setResizable(false);
		setLocation(0,0);
		JPanel panel = new calculatorPanel();
		this.add(panel);
	}
}
