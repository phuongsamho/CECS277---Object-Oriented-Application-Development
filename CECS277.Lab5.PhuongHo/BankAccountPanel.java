import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountPanel extends JPanel implements ActionListener
{
	private JButton wButton;
	private JButton dButton;
	private JLabel amountLabel;
	private JLabel outputLabel;
	private JTextField amountField;
	private BankAccount ba;
	
	BankAccountPanel(BankAccount a)
	{
		ba = a;
		amountLabel = new JLabel("Amount");
		this.add(amountLabel);
		amountField = new JTextField(7);
		this.add(amountField);
		wButton = new JButton("Withdraw");
		this.add(wButton);
		dButton = new JButton("Deposit");
		this.add(dButton);
		outputLabel = new JLabel("Balane = " + ba.getBalance());
		this.add(outputLabel);
		wButton.addActionListener(this);
		dButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if(o == dButton)
		{
			double amount = Double.parseDouble(amountField.getText());
			ba.deposit(amount);
			outputLabel.setText("Balance = $ " + ba.getBalance());
		}
		else if (o == wButton)
		{
			double amount = Double.parseDouble(amountField.getText());
			ba.withdraw(amount);
			outputLabel.setText("Balance = $ " + ba.getBalance());
		}
	}
}
