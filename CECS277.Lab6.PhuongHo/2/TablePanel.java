import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TablePanel extends JPanel implements ActionListener
{
	private int x,y;
	private int size;
	private String itemS;
	private String strS;
	private String c;
	private boolean styleB;
	private boolean styleI;
	private boolean styleBI;
	private boolean center;
	private JComboBox fontCombBox, sizeCombBox;
	private JCheckBox boldCheckBut, italicCheckBut, centerCheckBut;
	private JRadioButton blueRadBut, redRadBut, greenRadBut;
	
	//Get font
	GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String f[] = e.getAvailableFontFamilyNames();
	String s[] = {"8","10","12","14","16","18","20", "22", "24"};
	
	TablePanel()
	{
		//JPanel
		JPanel colorPanel = new JPanel();
		JPanel stylePanel = new JPanel();
		JPanel font = new JPanel();
		JPanel size = new JPanel();
		
		//Create Components
		blueRadBut = new JRadioButton("Blue",false);
		redRadBut = new JRadioButton("Red",false);
		greenRadBut = new JRadioButton("Green",false);
		boldCheckBut = new JCheckBox("Bold",false);
		italicCheckBut = new JCheckBox("Italic",false);
		centerCheckBut = new JCheckBox("Center",false);
		fontCombBox = new JComboBox(f);
		sizeCombBox = new JComboBox(s);
		
		//Add
		colorPanel.add(fontCombBox);
		
		ButtonGroup bgColor = new ButtonGroup();
		bgColor.add(redRadBut);
		bgColor.add(greenRadBut);
		bgColor.add(blueRadBut);
		
		colorPanel.setLayout(new GridLayout(1,3));
		colorPanel.add(redRadBut);
		colorPanel.add(greenRadBut);
		colorPanel.add(blueRadBut);
		
		colorPanel.add(sizeCombBox);
		
		stylePanel.setLayout(new GridLayout(1,3));
		stylePanel.add(boldCheckBut);
		stylePanel.add(italicCheckBut);
		stylePanel.add(centerCheckBut);
		
		//Add ActionListener
		fontCombBox.addActionListener(this);
		sizeCombBox.addActionListener(this);
		blueRadBut.addActionListener(this);
		redRadBut.addActionListener(this);
		greenRadBut.addActionListener(this);
		boldCheckBut.addActionListener(this);
		italicCheckBut.addActionListener(this);
		centerCheckBut.addActionListener(this);
		
		//Layout
		this.setLayout(new BorderLayout());
		this.add(colorPanel, BorderLayout.NORTH);
		this.add(stylePanel, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g)
	{
		//Draw Message
		super.paintComponent(g);
		FontMetrics fm = g.getFontMetrics();
		int sw = fm.stringWidth("Phuong Ho");
		Color red = new Color(255,0,0);
		Color green = new Color(0,255,0);
		Color blue = new Color(0,0,255);
		Font plain = new Font(itemS,Font.PLAIN,size);
		Font bold = new Font(itemS,Font.BOLD,size);
		Font italic = new Font(itemS,Font.ITALIC,size);
		Font bi = new Font(itemS,Font.BOLD | Font.ITALIC,size);
		if(c == "b")
			g.setColor(blue);
		else if(c == "g")
			g.setColor(green);
		else if(c == "r")
			g.setColor(red);
		if(styleB == true)
			g.setFont(bold);
		if(styleI == true)
			g.setFont(italic);
		if(styleBI == true)
			g.setFont(bi);
		if(styleB == false && styleI == false && styleBI == false)
			g.setFont(plain);
		if(center == true)
		{
			x = getWidth()/2-sw/2;
			y = getHeight()/2-fm.getAscent()/2;
		}
		if(center == false)
		{
			x = 0;
			y = getHeight()/2-fm.getAscent()/2;
		}
		g.drawString("Phuong Ho",x,y);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		//Update Message
		if(o == fontCombBox)
		{
			
			Object item = fontCombBox.getSelectedItem();
			itemS = item.toString();
			repaint();
		}
		if(o == sizeCombBox)
		{
			Object str = sizeCombBox.getSelectedItem();
			size = Integer.parseInt(str.toString());
			repaint();
		}
		if(blueRadBut.isSelected())
		{
			c = "b";
			repaint();
		}
		if(redRadBut.isSelected())
		{
			c = "r";
			repaint();
		}
		if(greenRadBut.isSelected())
		{
			c = "g";
			repaint();
		}
		if(boldCheckBut.isSelected() && italicCheckBut.isSelected())
		{
			styleBI = true;
			styleB = false;
			styleI = false;
			repaint();
		}
		if(boldCheckBut.isSelected() == false && italicCheckBut.isSelected() == false)
		{
			styleBI = false;
			styleB = false;
			styleI = false;
			repaint();
		}
		if(boldCheckBut.isSelected() == false && italicCheckBut.isSelected())
		{
			styleBI = false;
			styleB = false;
			styleI = true;
			repaint();
		}
		if(boldCheckBut.isSelected() && italicCheckBut.isSelected() == false)
		{
			styleBI = false;
			styleB = true;
			styleI = false;
			repaint();
		}
		if(centerCheckBut.isSelected())
		{
			center = true;
			repaint();
		}
		if(centerCheckBut.isSelected() == false)
		{
			center = false;
			repaint();
		}
	}
}

