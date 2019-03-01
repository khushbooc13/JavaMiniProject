import java.awt.*;
import java.applet.*;

/*<applet code=app2  height=300 width=300>
</applet>*/

public class app2 extends Applet
{
	public void init()
	{
		Button b1=new Button("b1");
		Button b2=new Button("b2");
		Button b3=new Button("b3");
		Button b4=new Button("b4");
		Button b5=new Button("b5");
		setLayout(new GridLayout());
		add(b1);add(b2);add(b3);add(b4);
		add(b5);
	}
}