import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="SimpleKey" width=300 height=300>
</applet>
*/

public class SimpleKey extends Applet implements KeyListener
{
	String msg="";
	int x=10,y=10;
	public void init()
	{
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==KeyEvent.VK_ENTER)
		{
			y+=15;
			msg="";
		}
		showStatus("key down");
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("key up");
	}

	public void keyTyped(KeyEvent ke)
	{
		msg+=ke.getKeyChar();
		repaint();
	}

	public void update(Graphics g)
	{
		g.drawString(msg,x,y);
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}