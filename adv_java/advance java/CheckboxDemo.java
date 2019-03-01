import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CheckboxDemo" width=300 height=300>
</applet>
*/

public class CheckboxDemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox chk1,chk2,chk3;
	Label l1,l2,l3;

	public void init()
	{
		chk1=new Checkbox("Windows XP");
		chk2=new Checkbox("Linux");
		chk3=new Checkbox("Windows Vista");
		l1=new Label("");
		l2=new Label("");
		l3=new Label("");
		add(chk1);
		add(chk2);
		add(chk3);
		add(l1);
		add(l2);
		add(l3);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie	)
	{
		if(ie.getSource()==chk1)
		{
			if(chk1.getState())
				l1.setText("you selected Windows XP");
			else
				l1.setText("");
		}
		else if(ie.getSource()==chk2)
		{
			if(chk2.getState())
				l2.setText("you selected Linux");
			else
				l2.setText("");
		}
		if(ie.getSource()==chk3)
		{
			if(chk3.getState())
				l3.setText("you selected Windows Vista");
			else
				l3.setText("");
		}
	}
}