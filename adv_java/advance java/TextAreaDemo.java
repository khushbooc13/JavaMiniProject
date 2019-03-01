import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="TextAreaDemo" width=300 height=300>
</applet>
*/

public class TextAreaDemo extends Applet
{
	TextArea ta;
	public void init()
	{
		ta=new TextArea("Advance java",5,15,TextArea.SCROLLBARS_BOTH);
		add(ta);
	}
}