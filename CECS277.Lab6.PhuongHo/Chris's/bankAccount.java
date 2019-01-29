import javax.swing.*;
public class bankAccount extends JFrame
{
	bankAccount()
	{
		setTitle("Bank");
		setSize(400,120);
		setLocation(0,0);
		JPanel panel = new bankAccountPanel();
		this.add(panel);
	}
}
