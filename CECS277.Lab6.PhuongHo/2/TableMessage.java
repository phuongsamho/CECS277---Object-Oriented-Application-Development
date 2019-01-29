import java.awt.*;

import javax.swing.*;

public class TableMessage extends JPanel
{
	int x,y;
	public void paintComponent(Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		int sw = fm.stringWidth("Phuong Ho");
		x = getWidth()/2-sw/2;
		y = getHeight()/2-fm.getAscent()/2;
		g.drawString("Phuong Ho",x,y);
	}
}
