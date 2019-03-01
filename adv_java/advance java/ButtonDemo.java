import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="ButtonDemo" width=300 height=300>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener
{
	String msg="";
	Button y,n,m;

	public void init()
	{
		y=new Button("yes");
		n=new Button("no");
		m=new Button("maybe");
		add(y);
		add(n);
		add(m);
		y.addActionListener(this);
		n.addActionListener(this);
		m.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("yes"))
		{
			msg="you pressed yes";
		}
		else	if(str.equals("no"))
		{
			msg="you pressed no";
		}
		else
		{
			msg="you pressed maybe";
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,30,100);
	}
}
