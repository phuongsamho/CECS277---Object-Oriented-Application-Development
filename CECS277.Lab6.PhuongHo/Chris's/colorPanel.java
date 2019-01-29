import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class colorPanel extends JPanel implements ActionListener
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
	private JComboBox CB,sCB;
	private JCheckBox bCB,iCB,cCB;
	private JRadioButton bRB,rRB,gRB;
	//Get font
	GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String t[] = e.getAvailableFontFamilyNames();
	String s[] = {"8","10","12","14","16","18","20", "22", "24"};
	colorPanel()
	{
		//JPanel
		JPanel radioPanel = new JPanel();
		JPanel checkPanel = new JPanel();
		JPanel font = new JPanel();
		JPanel size = new JPanel();
		//Create Components
		bRB = new JRadioButton("Blue",false);
		rRB = new JRadioButton("Red",false);
		gRB = new JRadioButton("Green",false);
		bCB = new JCheckBox("Bold",false);
		iCB = new JCheckBox("Italic",false);
		cCB = new JCheckBox("Center",false);
		CB = new JComboBox(t);
		sCB = new JComboBox(s);
		//Add
		radioPanel.add(CB);
		ButtonGroup bgColor = new ButtonGroup();
		bgColor.add(bRB);
		bgColor.add(rRB);
		bgColor.add(gRB);
		radioPanel.setLayout(new GridLayout(1,3));
		radioPanel.add(bRB);
		radioPanel.add(rRB);
		radioPanel.add(gRB);
		radioPanel.add(sCB);
		checkPanel.setLayout(new GridLayout(1,3));
		checkPanel.add(bCB);
		checkPanel.add(iCB);
		checkPanel.add(cCB);
		//Add ActionListener
		CB.addActionListener(this);
		sCB.addActionListener(this);
		bRB.addActionListener(this);
		rRB.addActionListener(this);
		gRB.addActionListener(this);
		bCB.addActionListener(this);
		iCB.addActionListener(this);
		cCB.addActionListener(this);
		//Layout
		this.setLayout(new BorderLayout());
		this.add(radioPanel, BorderLayout.NORTH);
		this.add(checkPanel, BorderLayout.SOUTH);
	}
	public void paintComponent(Graphics g)
	{
		//Draw Message
		super.paintComponent(g);
		FontMetrics fm = g.getFontMetrics();
		int sw = fm.stringWidth("CECS 277");
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
		g.drawString("CECS 277",x,y);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		//Update Message
		if(o == CB)
		{
			
			Object item = CB.getSelectedItem();
			itemS = item.toString();
			repaint();
		}
		if(o == sCB)
		{
			Object str = sCB.getSelectedItem();
			size = Integer.parseInt(str.toString());
			repaint();
		}
		if(bRB.isSelected())
		{
			c = "b";
			repaint();
		}
		if(rRB.isSelected())
		{
			c = "r";
			repaint();
		}
		if(gRB.isSelected())
		{
			c = "g";
			repaint();
		}
		if(bCB.isSelected() && iCB.isSelected())
		{
			styleBI = true;
			styleB = false;
			styleI = false;
			repaint();
		}
		if(bCB.isSelected() == false && iCB.isSelected() == false)
		{
			styleBI = false;
			styleB = false;
			styleI = false;
			repaint();
		}
		if(bCB.isSelected() == false && iCB.isSelected())
		{
			styleBI = false;
			styleB = false;
			styleI = true;
			repaint();
		}
		if(bCB.isSelected() && iCB.isSelected() == false)
		{
			styleBI = false;
			styleB = true;
			styleI = false;
			repaint();
		}
		if(cCB.isSelected())
		{
			center = true;
			repaint();
		}
		if(cCB.isSelected() == false)
		{
			center = false;
			repaint();
		}
	}
}
