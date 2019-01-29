import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Clock_Panel extends JPanel implements ActionListener
{
	private double r = 250;
	private double hours;
	private double minutes;
	private double minuteLength = r*.8;
	private double hourLength = r*.8;
	private JLabel hL, mL;
	private JTextField hTF, mTF;
	private JButton dB;
	Clock_Panel()
	{
		//setPreferredSize(new Dimension(2*r+1,2*r+1));
		//JPanel
		JPanel display = new JPanel();
		//Create Components
		hL = new JLabel("Hour = ");	
		mL = new JLabel("Minute = ");
		hTF = new JTextField(10);
		mTF = new JTextField(10);
		dB = new JButton("Draw");
		//Add Components
		display.add(hL);
		display.add(hTF);
		display.add(mL);
		display.add(mTF);
		display.add(dB);
		//ActionListener
		dB.addActionListener(this);
		
		this.setLayout(new BorderLayout());
		this.add(display, BorderLayout.NORTH);
	}
	public void paintComponent(Graphics g)
	{
		//Circle
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(50,50,1.6*r,1.6*r);
		g2.draw(circle);
		//draw hour
		double hourAngle = Math.toRadians(90 - 360 * minutes / (12 * 60));
		draw(g2, hourAngle, hourLength);
		//draw minute
		double minuteAngle = Math.toRadians(90 - 360 * minutes / 60);
		draw(g2, minuteAngle, minuteLength);
	}
	public void draw(Graphics2D g2, double angle, double length)
	{
		Point2D.Double center = new Point2D.Double(r,r);
		Point2D.Double p = new Point2D.Double(r+length*Math.cos(angle),r-length*Math.sin(angle));
		Line2D.Double line = new Line2D.Double(center, p);
		g2.draw(line);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == dB)
		{
			hours = Integer.parseInt(hTF.getText());
			minutes = Integer.parseInt(mTF.getText());
			minutes = minutes + hours * 60;
			repaint();
		}
	}
}