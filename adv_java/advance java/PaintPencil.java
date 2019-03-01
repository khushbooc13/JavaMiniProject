import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
<applet code="PaintPencil" width=300 height=300>
</applet>
*/

public class PaintPencil extends Applet implements ActionListener, MouseListener, MouseMotionListener
{
	int x=0,y=0,flag=0;
	Button setcolor;
	Point prevPoint,point;
	public void init()
	{
		setcolor=new Button("setcolor");
		add(setcolor);
		setcolor.addActionListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(flag==0)
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
			repaint();
	}

	public void mousePressed(MouseEvent me)
	{

		prevPoint=me.getPoint();
		point=me.getPoint();
		repaint();
	}

	public void mouseDragged(MouseEvent me)
	{
		prevPoint=point;
		point=me.getPoint();
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		prevPoint=point;
		point=me.getPoint();
		repaint();
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseMoved(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}

	public void update(Graphics g)
	{	
		if(flag==1)
		{
			g.setColor(Color.red);
		g.drawLine(prevPoint.x,prevPoint.y,point.x,point.y);
		}
		else if(flag==0)
		{
			g.setColor(Color.black);
			g.drawLine(prevPoint.x,prevPoint.y,point.x,point.y);
		}
	}
}