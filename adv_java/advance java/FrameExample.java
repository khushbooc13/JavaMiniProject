import java.awt.*;
import java.awt.event.*;

public class FrameExample extends Frame
{
	FrameExample(String title)
	{
		super(title);
		addWindowListener(new MyWindowAdapter());//yaha pe ham log this use nahi kar sakte hai kyun ki MyWindowAdapter class mein Default Constructor use kiya hai
		setSize(200,200);
		setVisible(true);
		setBackground(Color.red);
		setForeground(Color.black);
	}

	public void paint(Graphics g)
	{
		g.drawString("this is a frame window",30,100);
	}

	public static void main(String ar[])
	{
		FrameExample f=new FrameExample("Hello!!!");
	}
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}