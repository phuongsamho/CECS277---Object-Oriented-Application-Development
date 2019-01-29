import javax.swing.JFrame;
import javax.swing.JPanel;
public class ClockFrame extends JFrame
{
	ClockFrame()
	{
		setTitle("Clock");
		setSize(500,500);
		setResizable(false);
		setLocation(0,0);
		JPanel panel = new clockPanel();
		this.add(panel);
	}
}
