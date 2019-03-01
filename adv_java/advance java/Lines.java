import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
<applet code="Lines" width=300 height=300>
</applet>
*/
public class Lines extends Applet implements MouseListener , MouseMotionListener
{
	String msg="";
	Point prevPoint,point;
	Vector v=new Vector();
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
	}

	public void mousePressed(MouseEvent me)
	{
		prevPoint=me.getPoint();
	}

	public void mouseReleased(MouseEvent me)
	{
		point=me.getPoint();
		v.addElement(prevPoint);
		v.addElement(point);
		repaint();
	}

	public void mouseEntered(MouseEvent me)
	{
	}

	public void mouseExited(MouseEvent me)
	{
	}

	public void mouseDragged(MouseEvent me)
	{
		point=me.getPoint();
		repaint();
	}

	public void mouseMoved(MouseEvent me)
	{
	}

	public void paint(Graphics g)
	{
		for(int  i=0;i<v.size();i+=2)
		{
			g.drawLine(((Point)v.elementAt(i)).x , ((Point)v.elementAt(i)).y , ((Point)v.elementAt(i+1)).x , ((Point)v.elementAt(i+1)).y);
		if(prevPoint!=null && point!=null)
		{
			g.drawLine(prevPoint.x , prevPoint.y , point.x , point.y);
		}
		}
	}
}