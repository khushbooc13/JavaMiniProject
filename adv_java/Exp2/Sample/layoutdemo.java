import java.awt.*;
import java.applet.*;
public class layoutdemo extends Applet
{
	Button left,right,top,bottom;
	public void init()
	{
		left=new Button("left");
		right=new Button("right");
		top=new Button("top");
		bottom=new Button("bottom");
		BorderLayout b=new BorderLayout();
		setLayout(b);
		add(left,BorderLayout.EAST);
		add(right,BorderLayout.WEST);
		add(top,BorderLayout.NORTH);
		add(bottom,BorderLayout.SOUTH);
	}
}

/*
<applet code="layoutdemo.class" height=100 width=200>
</applet>
*/