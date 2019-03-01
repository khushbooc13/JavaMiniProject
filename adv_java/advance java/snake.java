import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;
/*
<applet code="snake" width=500 height=500>
</applet>
*/
public class snake extends Applet implements KeyListener
{
	Point p,p1;
	Random r;
	int x=0,y=0,foodx=100,foody=100,flag=0;
	Vector v;
	public void init()
	{
		r=new Random();
		v=new Vector(2,1);
		p=new Point(0,0);
		p1=new Point(10,0);
		v.addElement(p);
		v.addElement(p1);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==KeyEvent.VK_UP)
		{
			flag=1;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_DOWN)
		{
			flag=2;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			flag=3;
			repaint();
		}
		else if(ke.getKeyCode()==KeyEvent.VK_LEFT)
		{
			flag=4;
			repaint();
		}
	}

	public void keyReleased(KeyEvent ke){}

	public void keyTyped(KeyEvent ke){}

	public void paint(Graphics g)
	{
		try
		{
		g.setColor(Color.red);
		g.fillRect(foodx,foody,10,10);
		if(foodx==x && foody==y)
		{
			v.setSize((v.size()+1));
			foodx=r.nextInt(300);
			foodx=foodx-(foodx%10);
			foody=r.nextInt(300);
			foody=foody-(foody%10);
			g.fillRect(foodx,foody,10,10);
			System.out.println("entered");
		}
		System.out.println("exited");
		if(flag==1)
			{
				y-=10;
				p.x=x;
				p.y=y;
				v.removeElement(0);
				v.addElement(p);
			}
		if(flag==2)
			{
				y+=10;
				p.x=x;
				p.y=y;
				v.removeElement(0);
				v.addElement(p);
			}
		if(flag==3)
			{
				x+=10;
				p.x=x;
				p.y=y;
				v.removeElement(0);
				v.addElement(p);
			}
		if(flag==4)
			{
				x-=10;
				p.x=x;
				p.y=y;
				v.removeElement(0);
				v.addElement(p);
			}
		for(int i=0;i<v.size();i++)
		{
			p1=((Point)v.elementAt(i));
			g.fillRect(p1.x,p1.y,10,10);
			System.out.println(p1.x+"  "+p1.y);
		}
		for(int k=0;k<60000;k++)
			for(int l=0;l<1000;l++);
		//repaint();
		}
		catch(Exception e){}
	}
}