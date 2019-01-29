import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testPanel extends JPanel implements ActionListener
{
	private JLabel aL, bL;
	private JTextField aTF, bTF;
	private JButton newGame, savings, clock, calculator, color;
	JFrame b = new bankAccount();
	JFrame s = new savings();
	JFrame cl = new clock();
	JFrame ca = new calculator();
	JFrame c = new color();
	testPanel()
	{
		//JPanel
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JPanel display = new JPanel();
		display.setLayout(new FlowLayout(FlowLayout.LEFT));
		//Create labels
		aL = new JLabel("Select program to run");
		display.add(aL);		
		//Create Buttons
		newGame = new JButton("Bank");
		savings = new JButton("Savings Calculator");
		clock = new JButton("Clock");
		calculator = new JButton("Calculator");
		color = new JButton("Color");
		displayPanel.add(newGame);
		displayPanel.add(savings);
		displayPanel.add(clock);
		displayPanel.add(calculator);
		displayPanel.add(color);
		
		newGame.addActionListener(this);
		savings.addActionListener(this);
		clock.addActionListener(this);
		calculator.addActionListener(this);
		color.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(displayPanel, BorderLayout.WEST);
		this.add(display, BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == newGame)
		{
			b.setVisible(true);
		}
		if(o == savings)
		{
			s.setVisible(true);
		}
		if(o == clock)
		{
			cl.setVisible(true);
		}
		if(o == calculator)
		{
			ca.setVisible(true);
		}
		if(o == color)
		{
			c.setVisible(true);
		}
	}
}
