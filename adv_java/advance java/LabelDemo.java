import java.awt.*;
import java.applet.*;

/*
<applet code="LabelDemo" width=300 height=300>
</applet>
*/

public class LabelDemo extends Applet
{
	public void init()
	{
		Label one=new Label("One",Label.RIGHT);
		Label two=new Label("Two",Label.RIGHT);
		Label three=new Label("Three",Label.RIGHT);
		add(one);
		add(two);
		add(three);
	}
}