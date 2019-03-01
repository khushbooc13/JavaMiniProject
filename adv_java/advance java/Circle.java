import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
<applet code="Circle" width=300 height=300>
</applet>
*/

public class Circle extends Applet implements MouseListener
{
	Random r;
	int flag=0,i,j,z,x,y;
	public void init()
	{
		addMouseListener(this);
		r=new Random();
	}

	public void mouseClicked(MouseEvent me)
	{
	}

	public void mouseEntered(MouseEvent me)
	{
	}

	public void mouseExited(MouseEvent me)
	{
	}

	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		flag=1;
		repaint();
	}

	public void mouseReleased(MouseEvent me)
	{
		flag=0;
	}

	public void paint(Graphics g)
	{
		for(i=20;i<50 && flag==1;i+=10)
		{
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawOval(x-(i/2),y-(i/2),i,i);
		for(j=0;j<60000;j++)
			for(z=0;z<10000;z++);
		}
		if(flag==1)
			repaint();
	}
}