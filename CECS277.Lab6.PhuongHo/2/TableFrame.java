import javax.swing.JFrame;
import javax.swing.JPanel;

public class TableFrame extends JFrame
{
	TableFrame()
	{
		setTitle("Table");
		setSize(500, 200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new TablePanel();
		this.add(panel);
	}
}
