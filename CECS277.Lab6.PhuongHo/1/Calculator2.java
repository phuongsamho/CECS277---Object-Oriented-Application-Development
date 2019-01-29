import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

public class Calculator2 extends JFrame implements ActionListener {
	private JPanel panel;
	static JButton equalsButton, addButton, subButton, multiButton, divButton,clearButton,plusMinusButton,decimalButton;
	static JButton zeroButton, oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton;
	static JTextField ansField;
	static double num1, num2, ans;
	static int addClick = 0, subClick = 0, multiClick = 0, divClick = 0;
	static int clearField;
	/*
	 * Grid Layout & Adding Buttons in a 4x4.
	 */
	public Calculator2() {
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));	
		p1.add(sevenButton = new JButton("7"));
		p1.add(eightButton = new JButton("8"));
		p1.add(nineButton = new JButton("9"));
		p1.add(divButton = new JButton("/"));
		p1.add(fourButton = new JButton("4"));
		p1.add(fiveButton = new JButton("5"));
		p1.add(sixButton = new JButton("6"));
		p1.add(multiButton = new JButton("*"));
		p1.add(oneButton = new JButton("1"));
		p1.add(twoButton = new JButton("2"));
		p1.add(threeButton = new JButton("3"));
		p1.add(subButton = new JButton("-"));
		p1.add(zeroButton = new JButton("0"));
		p1.add(decimalButton = new JButton("."));
		p1.add(equalsButton = new JButton("="));
		p1.add(addButton = new JButton("+"));
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Calculator");
	setResizable(false);
	setSize(230,180);
	setLocationRelativeTo(null);
	
	ansField = new JTextField();
	ansField.setSize(5,20);
	ansField.setLocation(5,10);
	ansField.setFont(new Font("Arial", Font.BOLD, 24));
	ansField.setEditable(false);
	
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(ansField = new JTextField(16));
    ansField.setHorizontalAlignment(JTextField.RIGHT);
    ansField.setEditable(false);

    JPanel p = new JPanel();
    p.setLayout(new BorderLayout());
    p.add(p2, BorderLayout.NORTH);
    p.add(p1, BorderLayout.SOUTH);


    add(p);
	
	zeroButton.addActionListener(this);
	oneButton.addActionListener(this);
	twoButton.addActionListener(this);
	threeButton.addActionListener(this);
	fourButton.addActionListener(this);
	fiveButton.addActionListener(this);
	sixButton.addActionListener(this);
	sevenButton.addActionListener(this);
	eightButton.addActionListener(this);
	nineButton.addActionListener(this);
	addButton.addActionListener(this);
	subButton.addActionListener(this);
	multiButton.addActionListener(this);
	divButton.addActionListener(this);
	decimalButton.addActionListener(this);
	equalsButton.addActionListener(this);
	}

public void actionPerformed(ActionEvent e){
	if(e.getSource() == zeroButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("0");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "0");
			}
		}
	}
	if(e.getSource() == oneButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("1");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "1");
			}
		}
	}
	if(e.getSource() == twoButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("2");
				clearField = 0;
				}else{
					ansField.setText(ansField.getText() + "2");
				}
		}
	}
	if(e.getSource() == threeButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("3");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "3");
			}
		}
	}
	if(e.getSource() == fourButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("4");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "4");
			}
		}
	}
	if(e.getSource() == fiveButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("5");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "5");
			}
		}
	}
	if(e.getSource() == sixButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("6");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "6");
			}
		}
	}
	if(e.getSource() == sevenButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("7");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "7");
			}
		}
	}
	if(e.getSource() == eightButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("8");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "8");
			}
		}
	}
	if(e.getSource() == nineButton){
		if(ansField.getText().length() <16){
			if(clearField == 1){
				ansField.setText("9");
				clearField = 0;
			}else{
				ansField.setText(ansField.getText() + "9");
			}
		}
	}
	if(e.getSource() == decimalButton){
		if(ansField.getText().contains(".")){
			ansField.setText(ansField.getText());
		}else{
			ansField.setText(ansField.getText() + ".");
		}
	}

	if(e.getSource() ==addButton){
		if(ansField.getText() != null){
			num1 = Double.parseDouble(String.valueOf(ansField.getText()));
			addClick = 1;
			clearField = 1;
		}
	}
	if(e.getSource() ==subButton){
		if(ansField.getText() != null){
			num1 = Double.parseDouble(String.valueOf(ansField.getText()));
			subClick = 1;
			clearField = 1;
		}
	}
	if(e.getSource() ==multiButton){
		if(ansField.getText() != null){
			num1 = Double.parseDouble(String.valueOf(ansField.getText()));
			multiClick = 1;
			clearField = 1;
		}
	}
	if(e.getSource() ==divButton){
		if(ansField.getText() != null){
			num1 = Double.parseDouble(String.valueOf(ansField.getText()));
			divClick = 1;
			clearField = 1;
		}
	}
	if(e.getSource() == clearButton){
		ansField.setText("");
		num1 =0;
		num2 =0;
		addClick = 0;
		subClick =0;
		multiClick =0;
		divClick= 0;
	}
	if(e.getSource() ==  equalsButton){
		num2 = Double.parseDouble(String.valueOf(ansField.getText()));
		ansField.setText(ansField.getText());
		if(addClick == 1){
			ans = num1 + num2;
			ansField.setText(String.valueOf(ans));
			addClick = 0;
		}
		if(subClick == 1){
			ans = num1 - num2;
			ansField.setText(String.valueOf(ans));
			subClick = 0;
	}
		if(multiClick == 1){
			ans = num1 * num2;
			ansField.setText(String.valueOf(ans));
			multiClick = 0;
}
		if(divClick == 1){
			ans = num1 / num2;
			ansField.setText(String.valueOf(ans));
			divClick = 0;
			}	
		}
	}
}