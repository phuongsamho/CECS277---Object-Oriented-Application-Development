import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calculatorPanel extends JPanel implements ActionListener
{
	String display = "";
	double total = 0;
	double temp = 0;
	double temp2 = 0;
	private JTextField number;
	private JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,div,mul,add,sub,eq,point;
	boolean add1 = false;
	boolean sub1 = false;
	boolean mul1 = false;
	boolean div1 = false;
	
	calculatorPanel()
	{
		GridLayout layout = new GridLayout(4,4);
		//JPanel
		JPanel display = new JPanel();
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		//JTextField
		number = new JTextField(10);
		display.add(number);
		//Create Buttons
		panel.add(n7 = new JButton("7"));
		panel.add(n8 = new JButton("8"));
		panel.add(n9 = new JButton("9"));
		panel.add(div = new JButton("/"));
		panel.add(n4 = new JButton("4"));
		panel.add(n5 = new JButton("5"));
		panel.add(n6 = new JButton("6"));
		panel.add(mul = new JButton("*"));
		panel.add(n1 = new JButton("1"));
		panel.add(n2 = new JButton("2"));
		panel.add(n3 = new JButton("3"));
		panel.add(sub = new JButton("-"));
		panel.add(n0 = new JButton("0"));
		panel.add(point = new JButton("."));
		panel.add(eq = new JButton("="));
		panel.add(add = new JButton("+"));
		//ActionListener
		n0.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		n3.addActionListener(this);
		n4.addActionListener(this);
		n5.addActionListener(this);
		n6.addActionListener(this);
		n7.addActionListener(this);
		n8.addActionListener(this);
		n9.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		eq.addActionListener(this);
		point.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
	}
	
	void div()
	{
		total = temp / temp2;
	}
	void mul()
	{
		total = temp * temp2;
	}
	void add()
	{
		total = temp + temp2;
	}
	void sub()
	{
		total = temp - temp2;
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == n0)
		{
			display = number.getText();
			number.setText(display + "0");
		}
		if(o == n1)
		{
			display = number.getText();
			number.setText(display + "1");
		}
		if(o == n2)
		{
			display = number.getText();
			number.setText(display + "2");
		}
		if(o == n3)
		{
			display = number.getText();
			number.setText(display + "3");
		}
		if(o == n4)
		{
			display = number.getText();
			number.setText(display + "4");
		}
		if(o == n5)
		{
			display = number.getText();
			number.setText(display + "5");
		}
		if(o == n6)
		{
			display = number.getText();
			number.setText(display + "6");
		}
		if(o == n7)
		{
			display = number.getText();
			number.setText(display + "7");
		}
		if(o == n8)
		{
			display = number.getText();
			number.setText(display + "8");
		}
		if(o == n9)
		{
			display = number.getText();
			number.setText(display + "9");
		}
		if(o == div)
		{
			div1 = true;
			temp = Double.parseDouble(number.getText());
			number.setText("");
		}
		if(o == mul)
		{
			mul1 = true;
			temp = Double.parseDouble(number.getText());
			number.setText("");
		}
		if(o == add)
		{
			add1 = true;
			temp = Double.parseDouble(number.getText());
			number.setText("");
		}
		if(o == sub)
		{
			sub1 = true;
			temp = Double.parseDouble(number.getText());
			number.setText("");
		}
		if(o == eq)
		{
			temp2 = Double.parseDouble(number.getText());
			if(add1 == true)
			{
				add();
				add1 = false;
			}
			else if(sub1 == true)
			{
				sub();
				sub1 = false;
			}
			else if(div1 == true)
			{
				div();
				div1 = false;
			}
			else if(mul1 == true)
			{
				mul();
				mul1 = false;
			}
			number.setText(Double.toString(total));
		}
		if(o == point)
		{
			display = number.getText();
			number.setText(display + ".");
		}
	}
}
