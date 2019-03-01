import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
/*<applet code = "DottedPencil" width = 300 height = 300></applet>*/
public class DottedPencil extends Applet
{
	Point prevPoint,point,temp;
	Vector v;
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
		v = new Vector();
	}
	public void update(Graphics g)
	{
		if(prevPoint!=null && point !=null)
			g.drawLine(prevPoint.x,prevPoint.y,point.x,point.y);
	}
}
class MyMouseAdapter extends MouseAdapter
{
	DottedPencil ref;
	MyMouseAdapter(DottedPencil ob)
	{
		ref = ob;
	}
	public void mousePressed(MouseEvent me)
	{
		ref.prevPoint = me.getPoint();
	}
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
	DottedPencil ref;
	MyMouseMotionAdapter(DottedPencil ob)
	{
		ref = ob;
	}
	public void mouseDragged(MouseEvent me)
	{
		ref.point = me.getPoint();
		ref.repaint();
		ref.prevPoint = ref.point; 
	}
}