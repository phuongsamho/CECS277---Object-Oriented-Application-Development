import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class savingsPanel extends JPanel implements ActionListener
{
	double balance = 0;
	double rate = 0;
	int years = 0;
	double amount = 0;
	//String array[] = new String[10];
	ArrayList<String> array = new ArrayList<String>();
	private JLabel IB,AR, NY;
	private JTextField iTF,aTF,nTF;
	private JButton cB;
	private JList list;
	private JScrollPane sp;
	savingsPanel()
	{
		//JPanel
		JPanel display = new JPanel();
		JPanel display1 = new JPanel();
		//Create Components
		IB = new JLabel("Initial Balance");
		AR = new JLabel("Annual Rate");
		NY = new JLabel("Number Of Years");
		iTF = new JTextField(10);
		aTF = new JTextField(10);
		nTF = new JTextField(10);
		cB = new JButton("Calculate");
		list = new JList();
		sp = new JScrollPane(list);
		sp.setMinimumSize(getMinimumSize());
		//Add
		display.add(IB);
		display.add(iTF);
		display.add(AR);
		display.add(aTF);
		display.add(NY);
		display.add(nTF);
		display.add(cB);
		display.add(new JScrollPane(list));
		
		cB.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.CENTER);
		//this.add(display1, BorderLayout.SOUTH);
	}
	public Dimension getMinimumSize()
	{
		return new Dimension(200,200);
	}
	void calculate()
	{
		NumberFormat f = new DecimalFormat("#0.00");
		for(int i=0;i<years;i++)
		{
			balance = balance + balance * rate * .01;
			array.add(f.format(balance));
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == cB)
		{
			balance = Double.parseDouble(iTF.getText());
			rate = Double.parseDouble(aTF.getText());
			years = Integer.parseInt(nTF.getText());
			calculate();
			String temp[] = new String[array.size()];
			for(int i=0; i < array.size(); i++)
			{
				String item = array.get(i);
				temp[i] = item;
			}
			list.setListData(temp);
		}
	}
}
