import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
public class SavingAccountF extends JFrame
{
	private JLabel initBalanceLabel, anualRateLabel, numberYearsLabel;
	private static JTextField initBalanceField;
	private JTextField anualRateField;
	private JTextField numberYearsField;
	private static SavingAccount sa = new SavingAccount();
	private JTextArea balanceArea;
	
	SavingAccountF(SavingAccount a)
	{
		setTitle("SavingsCalculator");
		setSize(260, 400);
		centerWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sa = a;
		initBalanceLabel = new JLabel("Initial Balance");
		this.add(initBalanceLabel, BorderLayout.WEST);
		initBalanceField = new JTextField(9);
		this.add(initBalanceField, BorderLayout.EAST);
		
		anualRateLabel = new JLabel("Anual Rate");
		this.add(anualRateLabel, BorderLayout.WEST);
		anualRateField = new JTextField(9);
		this.add(anualRateField, BorderLayout.EAST);
		
		numberYearsLabel = new JLabel("Number of Years");
		this.add(numberYearsLabel, BorderLayout.WEST);
		numberYearsField = new JTextField(9);
		this.add(numberYearsField, BorderLayout.EAST);
		
		JPanel calcPanel = new JPanel();
		calcPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		calcPanel.add(createButton());
		
		balanceArea = new JTextArea(10,8);
		balanceArea.setLineWrap(true);
		balanceArea.setWrapStyleWord(true);
		JScrollPane balanceScroll = new JScrollPane(balanceArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		calcPanel.add(balanceScroll);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(calcPanel);
	}
	
	private JButton createButton() 
	{
		JButton cButton = new JButton("Calculate");
		class Listener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double initBalance = Double.parseDouble(initBalanceField.getText());
				double anualRate = Double.parseDouble(anualRateField.getText());
				double numberYears = Double.parseDouble(numberYearsField.getText());
				for (int year = 1; year < numberYears; year++)
				{
					double balance = sa.yearlyBalance(initBalance, anualRate);
					DecimalFormat df = new DecimalFormat("#,###,###,##0.00");
					String bal = df.format(balance);
					balanceArea.append("$" + bal + "\n");
					initBalance = balance;
				}
			}	
		}
		ActionListener l = new Listener();
		cButton.addActionListener(l);
		return cButton;
	}

	private void centerWindow(Window w) 
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setLocation((d.width - w.getWidth()) / 2, (d.height - w.getHeight()) / 2);
	}
	
	public static void main(String[] args) 
	{	
		JFrame f = new SavingAccountF(sa);
		f.setVisible(true);
	}
}
