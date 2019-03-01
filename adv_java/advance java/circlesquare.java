import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

/*
<applet code="circlesquare" width=300 height=300>
</applet>
*/

public class circlesquare extends Applet implements MouseListener
{
	Random r;
	int flag=0,i,j,z,x,y,f=0;
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
		for(j=0;j<60000;j++)
			for(z=0;z<1000;z++);
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		if(f==0)
		{
			g.drawOval(x-10,y-10,20,20);
			for(j=0;j<60000;j++)
			for(z=0;z<1000;z++);
			g.drawRect(x-20,y-20,40,40);
			f=1;
		}
		for(j=0;j<60000;j++)
			for(z=0;z<1000;z++);
		if(f==1)
		{
			g.drawRect(x-10,y-10,20,20);
			for(j=0;j<60000;j++)
			for(z=0;z<1000;z++);
			g.drawOval(x-20,y-20,40,40);
			f=0;
		}
		for(j=0;j<60000;j++)
		for(z=0;z<1000;z++);
	
		if(flag==1)
			repaint();
	}
}