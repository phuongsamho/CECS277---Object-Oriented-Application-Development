import java.awt.*;

import javax.swing.*;

public class message extends JPanel
{
	int x,y;
	public void paintComponent(Graphics g)
	{
		FontMetrics fm = g.getFontMetrics();
		int sw = fm.stringWidth("CECS 277");
		x = getWidth()/2-sw/2;
		y = getHeight()/2-fm.getAscent()/2;
		g.drawString("CECS 277",x,y);
	}
}
