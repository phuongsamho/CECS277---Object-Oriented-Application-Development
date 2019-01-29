import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
	private JButton buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonDec,buttonClear;
	private JTextField screenField;
	private int clearField, add = 0, sub = 0, mul = 0, div = 0;
	double number1, number2, temp;
	
	public Calculator()
	{
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		
		 JPanel p2 = new JPanel();
		 p2.setLayout(new FlowLayout());
		 p2.add(screenField = new JTextField(21));
		 screenField.setEditable(false);
		
		 JPanel p1 = new JPanel();
		 p1.setLayout(new GridLayout(4, 4));
		 p1.add(button7 = new JButton("7"));
		 p1.add(button8 = new JButton("8"));
		 p1.add(button9 = new JButton("9"));
		 p1.add(buttonDiv = new JButton("/"));
		 p1.add(button4 = new JButton("4"));
		 p1.add(button5 = new JButton("5"));
		 p1.add(button6 = new JButton("6"));
		 p1.add(buttonMul = new JButton("*"));
		 p1.add(button1 = new JButton("1"));
		 p1.add(button2 = new JButton("2"));
		 p1.add(button3 = new JButton("3"));
		 p1.add(buttonSub = new JButton("-"));
		 p1.add(button0 = new JButton("0"));
		 p1.add(buttonDec = new JButton("."));
		 p1.add(buttonEqual = new JButton("="));
		 p1.add(buttonAdd = new JButton("+"));
		 //p1.add(buttonClear = new JButton("C"));
		 
		 JPanel p3 = new JPanel();
		 p3.setLayout(new FlowLayout());
		 p3.add(buttonClear = new JButton("C"));
		 
		 JPanel p = new JPanel();
		 p.setLayout(new BorderLayout());
		 p.add(p2, BorderLayout.NORTH);
		 p.add(p1, BorderLayout.CENTER);
		 p.add(p3, BorderLayout.EAST);
		 
		 this.add(p);
		 
		 button0.addActionListener(this);
		 button1.addActionListener(this);
		 button2.addActionListener(this);
		 button3.addActionListener(this);
		 button4.addActionListener(this);
		 button5.addActionListener(this);
		 button6.addActionListener(this);
		 button7.addActionListener(this);
		 button8.addActionListener(this);
		 button9.addActionListener(this);
		 buttonAdd.addActionListener(this);
		 buttonSub.addActionListener(this);
		 buttonMul.addActionListener(this);
		 buttonDiv.addActionListener(this);
		 buttonDec.addActionListener(this);
		 buttonClear.addActionListener(this);
		 buttonEqual.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == button0){
			if(clearField == 1){
				screenField.setText("0");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "0");
		}
		if (e.getSource() == button1){
			if(clearField == 1){
				screenField.setText("1");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "1");
		}
		if (e.getSource() == button2){
			if(clearField == 1){
				screenField.setText("2");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "2");
		}
		if (e.getSource() == button3){
			if(clearField == 1){
				screenField.setText("3");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "3");
		}
		if (e.getSource() == button4){
			if(clearField == 1){
				screenField.setText("4");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "4");
		}
		if (e.getSource() == button5){
			if(clearField == 1){
				screenField.setText("5");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "5");
		}
		if (e.getSource() == button6){
			if(clearField == 1){
				screenField.setText("6");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "6");
		}
		if (e.getSource() == button7){
			if(clearField == 1){
				screenField.setText("7");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "7");
		}
		if (e.getSource() == button8){
			if(clearField == 1){
				screenField.setText("8");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "8");
		}
		if (e.getSource() == button9){
			if(clearField == 1){
				screenField.setText("9");
				clearField = 0;
			}else screenField.setText(screenField.getText() + "9");
		}
		if (e.getSource() == buttonAdd)
		{
			if(screenField.getText() != null)
			{
				number1 = Double.parseDouble(String.valueOf(screenField.getText()));
				add = 1;
				clearField = 1;
		    }
		}
		if(e.getSource() == buttonSub){
			if(screenField.getText() != null){
				number1 = Double.parseDouble(String.valueOf(screenField.getText()));
				sub = 1;
				clearField = 1;
			}
		}
		if(e.getSource() == buttonMul){
			if(screenField.getText() != null){
				number1 = Double.parseDouble(String.valueOf(screenField.getText()));
				mul = 1;
				clearField = 1;
			}
		}
		if(e.getSource() == buttonDiv){
			if(screenField.getText() != null){
				number1 = Double.parseDouble(String.valueOf(screenField.getText()));
				div = 1;
				clearField = 1;
			}
		}
		if(e.getSource() == buttonClear){
			screenField.setText("");
			number1 = 0;
			number2 = 0;
			add = 0;
			sub = 0;
			mul = 0;
			div = 0;
		}
		if(e.getSource() ==  buttonEqual){
			number2 = Double.parseDouble(String.valueOf(screenField.getText()));
			screenField.setText(screenField.getText());
			if(add == 1){
				temp = number1 + number2;
				screenField.setText(String.valueOf(temp));
				add = 0;
			}
			if(sub == 1){
				temp = number1 - number2;
				screenField.setText(String.valueOf(temp));
				sub = 0;
			}
			if(mul == 1){
				temp = number1 * number2;
				screenField.setText(String.valueOf(temp));
				mul = 0;
			}
			if(div == 1){
				temp = number1 / number2;
				screenField.setText(String.valueOf(temp));
				div = 0;
			}
		}
		if (e.getSource() ==  buttonDec)
		{
			if (screenField.getText().contains("."))
				screenField.setText(screenField.getText());
			screenField.setText(screenField.getText() + ".");
		}
	}	
	public static void main(String[] args)
	{
		JFrame f = new Calculator();
		f.setVisible(true);
	}
}