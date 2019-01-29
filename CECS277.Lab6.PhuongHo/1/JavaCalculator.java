
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.util.*;

	public class JavaCalculator extends JFrame 
	{
	    private JButton num1;
	    private JButton num2;
	    private JButton num3;
	    private JButton num4;
	    private JButton num5;
	    private JButton num6;
	    private JButton num7;
	    private JButton num8;
	    private JButton num9;
	    private JButton num0;
	    
	    private JButton add;
	    private JButton sub;
	    private JButton mul;
	    private JButton div;
	    private JButton solve;
	    //private JButton jbtClear;
	    private double TEMP;
	    private double SolveTEMP;
	    
	private JTextField jtfResult;

	Boolean addBool = false ;
	Boolean subBool = false ;
	Boolean divBool = false ;
	Boolean mulBool = false ;


	String display = "";
	
	public JavaCalculator() 
	{
	    JPanel p1 = new JPanel();
	    p1.setLayout(new GridLayout(4, 4));
	    p1.add(num1 = new JButton("7"));
	    p1.add(num2 = new JButton("8"));
	    p1.add(num3 = new JButton("9"));
	    p1.add(num4 = new JButton("/"));
	    p1.add(num5 = new JButton("4"));
	    p1.add(num6 = new JButton("5"));
	    p1.add(num7 = new JButton("6"));
	    p1.add(num8 = new JButton("*"));
	    p1.add(num9 = new JButton("1"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    p1.add(num0 = new JButton("2"));
	    //p1.add(jbtClear = new JButton("C"));


	    JPanel p2 = new JPanel();
	    p2.setLayout(new FlowLayout());
	    p2.add(jtfResult = new JTextField(20));
	    jtfResult.setHorizontalAlignment(JTextField.RIGHT);
	    jtfResult.setEditable(false);

	            JPanel p3 = new JPanel();
	            p3.setLayout(new GridLayout(5, 1));
	            p3.add(add = new JButton("+"));
	            p3.add(sub = new JButton("-"));
	            p3.add(mul = new JButton("*"));
	            p3.add(div = new JButton("/"));
	            p3.add(solve = new JButton("="));

	    JPanel p = new JPanel();
	    p.setLayout(new GridLayout());
	    p.add(p2, BorderLayout.NORTH);
	    p.add(p1, BorderLayout.SOUTH);
	    p.add(p3, BorderLayout.EAST);

	    add(p);

	    num1.addActionListener(new ListenToOne());
	    num2.addActionListener(new ListenToTwo());
	    num3.addActionListener(new ListenToThree());
	    num4.addActionListener(new ListenToFour());
	    num5.addActionListener(new ListenToFive());
	    num6.addActionListener(new ListenToSix());
	    num7.addActionListener(new ListenToSeven());
	    num8.addActionListener(new ListenToEight());
	    num9.addActionListener(new ListenToNine());
	    num0.addActionListener(new ListenToZero());

	    add.addActionListener(new ListenToAdd());
	    sub.addActionListener(new ListenToSubtract());
	    mul.addActionListener(new ListenToMultiply());
	    div.addActionListener(new ListenToDivide());
	    solve.addActionListener(new ListenToSolve());
	    //jbtClear.addActionListener(new ListenToClear());

	} //JavaCaluclator()

	class ListenToClear implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        //display = jtfResult.getText();
	        jtfResult.setText("");
	        addBool = false ;
	        subBool = false ;
	        mulBool = false ;
	        divBool = false ;

	        TEMP = 0;
	        SolveTEMP =0 ;
	    }
	}

	class ListenToOne implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "1");
	    }
	}
	class ListenToTwo implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "2");
	    }
	}
	class ListenToThree implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "3");
	    }
	}
	class ListenToFour implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "4");
	    }
	}
	class ListenToFive implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "5");
	    }
	}
	class ListenToSix implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "6");
	    }
	}
	class ListenToSeven implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "7");
	    }
	}
	class ListenToEight implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "8");
	    }
	}
	class ListenToNine implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "9");
	    }
	}
	class ListenToZero implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "0");
	    }
	}

	    class ListenToAdd implements ActionListener 
	    {
	    public void actionPerformed(ActionEvent e) 
	    {
	        TEMP = Double.parseDouble(jtfResult.getText());
	                    jtfResult.setText("");
	                    addBool = true ;
	    }
	}
	class ListenToSubtract implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        subBool =true;
	    }
	}
	class ListenToMultiply implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        mulBool =true;

	    }
	}
	class ListenToDivide implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        divBool =true;
	    }
	}
	class ListenToSolve implements ActionListener 
	{
	    public void actionPerformed(ActionEvent e) 
	    {
	                    SolveTEMP = Double.parseDouble(jtfResult.getText() );
	                    if (addBool == true)
	                        SolveTEMP = SolveTEMP + TEMP;
	                    else if (subBool == true)
	                        SolveTEMP = SolveTEMP - TEMP;
	                    else if (mulBool == true)
	                        SolveTEMP = SolveTEMP * TEMP;
	                    else if (divBool == true)
	                        SolveTEMP = SolveTEMP / TEMP;
	        jtfResult.setText(Double.toString(SolveTEMP));

	        addBool = false ;
	        subBool = false ;
	        mulBool = false ;
	        divBool = false ;
	    }
	}

	public static void main(String[] args) 
	{
	    JavaCalculator calc = new JavaCalculator();
	    calc.pack();
	    calc.setLocationRelativeTo(null);
	            calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    calc.setVisible(true);
	}

	}