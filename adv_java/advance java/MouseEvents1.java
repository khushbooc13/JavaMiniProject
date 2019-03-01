import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MouseEvents1" width=300 height=300>
</applet>
*/

public class MouseEvents1 extends Applet implements MouseListener
{
	String msg="";
	int mouseX,mouseY;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(new MyMouseMotionListener(this));
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
	public void paint(Graphics g)
	{
		g.drawString(msg,mouseX,mouseY);
	}
}

class MyMouseMotionListener implements MouseMotionListener
{
	MouseEvents1 refobj;
	MyMouseMotionListener(MouseEvents1 ob)
	{
		refobj=ob;
	}
	public void mouseDragged(MouseEvent me)
	{
		refobj.mouseX=me.getX();
		refobj.mouseY=me.getY();
		refobj.showStatus("mouse dragging at"+refobj.mouseX+" , "+refobj.mouseY);
		refobj.msg="*";
		refobj.repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
		refobj.mouseX=me.getX();
		refobj.mouseY=me.getY();
		refobj.showStatus("mouse moving at"+refobj.mouseX+" , "+refobj.mouseY);
	}
}