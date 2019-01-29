import javax.swing.JFrame;
import javax.swing.JPanel;
public class color extends JFrame
{
	color()
	{
		setTitle("Selection");
		setSize(500,200);
		setLocation(0,0);
		JPanel panel = new colorPanel();
		this.add(panel);
	}
}
