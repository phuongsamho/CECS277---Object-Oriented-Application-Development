import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class bankAccountPanel extends JPanel implements ActionListener
{
	double amount = 0;
	double withdraw = 0;
	double deposit = 0;
	double balance = 0;
	private JLabel aL, bL;
	private JTextField aTF, bTF;
	private JButton wB, dB;
	bankAccountPanel()
	{
		//JPanel
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new FlowLayout());
		JPanel display = new JPanel();
		//Create Components
		aL = new JLabel("Amount");
		bL = new JLabel("balance = " + balance);
		aTF = new JTextField(10);
		wB = new JButton("Withdraw");
		dB = new JButton("Deposit");
		//Add
		displayPanel.add(aL);
		display.add(bL);
		displayPanel.add(aTF);
		displayPanel.add(wB);
		displayPanel.add(dB);
		
		wB.addActionListener(this);
		dB.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(displayPanel, BorderLayout.CENTER);
		this.add(display, BorderLayout.SOUTH);
	}
	void depositBalance()
	{
		balance = balance + deposit;
	}
	void withdrawBalance()
	{
		if(withdraw <= balance)
			balance = balance - withdraw;
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == wB)
		{
			withdraw = Double.parseDouble(aTF.getText());
			withdrawBalance();
			bL.setText("balance = " + balance);
		}
		if(o == dB)
		{
			deposit = Double.parseDouble(aTF.getText());
			depositBalance();
			bL.setText("balance = " + balance);
		}
	}
}
