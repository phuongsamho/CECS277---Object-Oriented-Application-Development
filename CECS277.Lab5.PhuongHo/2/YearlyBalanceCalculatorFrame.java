import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class YearlyBalanceCalculatorFrame extends JFrame 
{
	YearlyBalanceCalculatorFrame()
	{
		setTitle("SavingsCalculator");
		setSize(260, 400);
		centerWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SavingAccount sa = new SavingAccount();
		JPanel c = new YearlyBalanceCalculatorPanel(sa);
		this.add(c);
	}
	
	private void centerWindow(Window w) 
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
	}
}
