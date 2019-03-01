import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="FlowLayoutDemo" height=300 width=300>
</applet>
*/

public class FlowLayoutDemo extends Applet implements ItemListener
{
	Choice ch;
	String msg="Current Selection : ";
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
		ch=new Choice();
		ch.add("Advance Java");
		ch.add("Software Testing");
		ch.add("OMD");
		ch.add("Advance MUP");
		add(ch);
		ch.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

	public void paint(Graphics g)
	{
		msg+=ch.getSelectedItem();
		g.drawString(msg,6,150);
		msg="Current Selection : ";
	}
}