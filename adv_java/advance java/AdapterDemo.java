import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AdapterDemo" width=300 height=300>
</applet>
*/

public class AdapterDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}

class MyMouseAdapter extends MouseAdapter 
{
	AdapterDemo obj;
	MyMouseAdapter(AdapterDemo ad)
	{
		obj=ad;
	}

	public void mouseClicked(MouseEvent me)
	{
		obj.showStatus("mouse clicked");
	}
}

class MyMouseMotionAdapter extends MouseMotionAdapter
{
	AdapterDemo obj;
	MyMouseMotionAdapter(AdapterDemo ad)
	{
		obj=ad;
	}

	public void mouseDragged(MouseEvent me)
	{
		obj.showStatus("mouse dragging");
	}
	public void mouseReleased(MouseEvent me)
	{
		obj.showStatus("mouse Released");
	}
}