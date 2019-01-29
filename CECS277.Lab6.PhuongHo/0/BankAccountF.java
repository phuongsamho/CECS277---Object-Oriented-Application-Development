import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountF extends JFrame
{
	
	static BankAccount a = new BankAccount(400.0);
	private JLabel amountLabel;
	private JTextField amountField;
	private JLabel outputLabel;
	
	BankAccountF(BankAccount ba)
	{
		setTitle("Title");
		setSize(400, 100);
		centerWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		a = ba;
		JPanel controlPanel = new JPanel();
		amountLabel = new JLabel("Amount");
		controlPanel.add(amountLabel);
		amountField = new JTextField(7);
		controlPanel.add(amountField);
		controlPanel.add(createWButton());
		controlPanel.add(createDButton());
		outputLabel = new JLabel("Balane = " + ba.getBalance());
		controlPanel.add(outputLabel);
		
		this.add(controlPanel);
	}
	private JButton createWButton() 
	{
		JButton wButton = new JButton("Withdraw");
		class WListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double amount = Double.parseDouble(amountField.getText());
				a.withdraw(amount);
				outputLabel.setText("Balance = $ " + a.getBalance());
			}
		}
		ActionListener l1 = new WListener();
		wButton.addActionListener(l1);
		return wButton;
	}
	private JButton createDButton() {
		JButton dButton = new JButton("Deposit");
		class DListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double amount = Double.parseDouble(amountField.getText());
				a.deposit(amount);
				outputLabel.setText("Balance = $ " + a.getBalance());
			}
		}
		ActionListener l1 = new DListener();
		dButton.addActionListener(l1);
		return dButton;
	}
	private void centerWindow(Window w) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
	}
	public static void main(String[] args) 
	{
		JFrame f = new BankAccountF(a);
		f.setVisible(true);
	}
}
