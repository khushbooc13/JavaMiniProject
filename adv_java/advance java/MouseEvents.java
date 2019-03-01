import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvents" width=300 height=300>
</applet>
*/

public class MouseEvents extends Applet implements MouseListener , MouseMotionListener
{
	String msg="";
	int mouseX,mouseY;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		mouseX=10;
		mouseY=20;
		msg="mouse clicked";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse pressed";
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse released";
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="Mouse entered";
		repaint();
	}

	public void mouseExited(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		msg="mouse exited";
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		showStatus("mouse dragging at"+mouseX+" , "+mouseY);
		msg="*";
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		mouseX=me.getX();
		mouseY=me.getY();
		showStatus("mouse moving at"+mouseX+" , "+mouseY);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
}
	