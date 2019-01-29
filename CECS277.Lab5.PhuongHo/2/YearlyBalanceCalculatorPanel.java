import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
public class YearlyBalanceCalculatorPanel extends JPanel implements ActionListener
{
	private JLabel initBalanceLabel, anualRateLabel, numberYearsLabel;
	private JTextField initBalanceField, anualRateField, numberYearsField;
	private JButton calculateButton;
	private SavingAccount sa;
	private JTextArea balanceArea;
	
	YearlyBalanceCalculatorPanel(SavingAccount s)
	{
		sa = s;
		
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
		calculateButton = new JButton("Calculate");
		calcPanel.add(calculateButton);
		calculateButton.addActionListener(this);
		
		balanceArea = new JTextArea(10,8);
		balanceArea.setLineWrap(true);
		balanceArea.setWrapStyleWord(true);
		JScrollPane balanceScroll = new JScrollPane(balanceArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		calcPanel.add(balanceScroll);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(calcPanel);
		/*JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel input1Panel = new JPanel();
		input1Panel.setLayout(new BorderLayout());
		initBalanceLabel = new JLabel("Initial Balance");
		input1Panel.add(initBalanceLabel, BorderLayout.WEST);
		initBalanceField = new JTextField(15);
		input1Panel.add(initBalanceField, BorderLayout.EAST);
		
		JPanel input2Panel = new JPanel();
		input2Panel.setLayout(new BorderLayout());
		anualRateLabel = new JLabel("Anual Rate");
		input2Panel.add(anualRateLabel, BorderLayout.WEST);
		anualRateField = new JTextField(15);
		input2Panel.add(anualRateField, BorderLayout.EAST);
		
		JPanel input3Panel = new JPanel();
		input3Panel.setLayout(new BorderLayout());
		numberYearsLabel = new JLabel("Number of Years");
		input3Panel.add(numberYearsLabel, BorderLayout.WEST);
		numberYearsField = new JTextField(15);
		input3Panel.add(numberYearsField, BorderLayout.EAST);
		
		
		JPanel calcPanel = new JPanel();
		calcPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		calculateButton = new JButton("Calculate");
		calcPanel.add(calculateButton);
		calculateButton.addActionListener(this);
		
		balanceArea = new JTextArea(12,10);
		balanceArea.setLineWrap(true);
		balanceArea.setWrapStyleWord(true);
		JScrollPane balanceScroll = new JScrollPane(balanceArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		calcPanel.add(balanceScroll);
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(input1Panel);
		this.add(input2Panel);
		this.add(input3Panel);
		this.add(calcPanel);*/
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if (o == calculateButton)
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
	
}
