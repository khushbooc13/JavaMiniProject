import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="InsetsDemo" width=300 height=300>
</applet>
*/

public class InsetsDemo extends Applet  
{
	public void init()
	{
		//set background color so insets can be easily seen
		setBackground(Color.cyan);
		setLayout(new BorderLayout(10,10));
		add(new Button("This is across the top"),BorderLayout.NORTH);
		add(new Button("the Footer message might go here"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		//add(new Button("South"),BorderLayout.SOUTH);
		//add(new Button("East"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		String msg="Java is the best programming language"+"\n But most of you like DOT NET"+"\n Which is also a form of OOPs Language";
		add(new TextArea(msg),BorderLayout.CENTER);
	}

	public Insets getInsets()
	{
		return new Insets(10,10,10,10);
	}
}