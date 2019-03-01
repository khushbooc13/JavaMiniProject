  import java.awt.*;
  import java.awt.event.*;
  import java.applet.*;

  /*
  <applet code="AppletFrame" width=300 height=300>
  </applet>
  */

  class SampleFrame extends Frame
  {
	  SampleFrame(String title)
	  {
		  super(title);
		  addWindowListener(new MyWindowAdapter(this));
		  //setSize(200,200);
		  //setVisible(true);
	  }

	  public void paint(Graphics g)
	  {
		  g.drawString("This is in Frame Window",30,100);
	  }
  }

  class MyWindowAdapter extends WindowAdapter
  {
	  SampleFrame SampleFrameobj;
	  public MyWindowAdapter(SampleFrame sf)
	  {
		  SampleFrameobj=sf;
	  }

	  public void windowClosing(WindowEvent we)
	  {
			SampleFrameobj.setVisible(false);
	  }
  }

public class AppletFrame extends Applet
{
	SampleFrame f;
	public void init()
	{
		f=new SampleFrame("A  Frame Window");
		f.setVisible(true);
		f.setSize(200,200);
	}

	public void start()
	{
		f.setVisible(true);
	}

	public void stop()
	{
		f.setVisible(false);
	}

	public void paint(Graphics g)
	{
		g.drawString("this is in Applet Window",10,20);
	}
}
