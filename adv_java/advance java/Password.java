import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Password" width=300 height=300>
</applet>
*/

public class Password extends Applet implements ActionListener
{
	int count=0;
	String str="";
	char ch1[]={'a','v','i','n','a','s','h'};
	TextField name,pass;
	Label l1,l2;

	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT,20,50));
		name=new TextField(10);
		pass=new TextField(10);
		l1=new Label("Name : ");
		l2=new Label("Password : ");
		add(l1);
		add(name);
		add(l2);
		add(pass);
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		str=name.getText().toLowerCase();
		char ch2[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch1[0]==ch2[i])
			{
				for(int j=i;j<i+7;j++)
				{
					if(ch1[count]==ch2[j])
					{
						count++;
					}
					else
					{
						count=0;
						break;
					}
				}
			if(count==7)
				{
				repaint();
				}
			}
		}
	}

	public void paint(Graphics g)
	{
		if(count==7)
		{
			g.drawString("Name Accepted",6,100);
		}
		else
		{
		g.drawString("Name Invalid",6,100);
		}
	}
}