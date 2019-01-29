import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccountFrame extends JFrame 
{
	public BankAccountFrame()
	{
		setTitle("Title");
		setSize(400, 100);
		centerWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BankAccount b = new BankAccount(400.0);
		JPanel c = new BankAccountPanel(b);
		this.add(c);
	}

	private void centerWindow(Window w) 
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
	}

}
