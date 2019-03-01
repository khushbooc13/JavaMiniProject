import java.awt.*;
import java.awt.event.*;
public class Exp4_2 extends Frame
{
	Label l1;
	Exp4_2(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		Label l1=new Label("Login ID");
		add(l1);
	}
	public static void main(String args[])
	{
		Exp4_2 p1=new Exp4_2("Login Page");
		p1.addWindowListener(new MyAdapter2());
	}

}


class MyAdapter2 extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
