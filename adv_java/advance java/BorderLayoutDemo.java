import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="BorderLayoutDemo" width=300 height=300>
</applet>
*/

public class BorderLayoutDemo extends Applet  
{
	public void init()
	{
		setLayout(new BorderLayout(10,10));
		add(new Button("This is across the top"),BorderLayout.NORTH);
		add(new Label("the Footer message might go here"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		//add(new Button("South"),BorderLayout.SOUTH);
		//add(new Button("East"),BorderLayout.EAST);
		add(new Button("LEFT"),BorderLayout.WEST);
		String msg="Java is the best programming language"+"\n But most of you like DOT NET"+"\n Which is also a form of OOPs Language";
		add(new TextArea(msg),BorderLayout.CENTER);
	}
}