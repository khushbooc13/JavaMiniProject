import java.awt.*;
import java.util.Date;
import java.net.InetAddress;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Event1" width=300 height=300>
</applet>*/

	public class Event1 extends Applet implements ActionListener
	{
		     Label s=new Label();
		    Label l1=new Label("Enter number in textfield");
			Label l2=new Label("Enter number in textfield");
			Label l3=new Label("Addtion of two numbers");
			TextField t1=new TextField(15);
			TextField t2=new TextField(15);
			TextField t3=new TextField(15);
			Button add1=new Button("Submit");
			
		public void init()
		{
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(l3);
			add(t3);
			add(add1);
			add1.addActionListener(this);
		}

			public void actionPerformed(ActionEvent ae)
				{
						if(t1.getText()!=null&&t2.getText()!=null)
						{
							int no1=Integer.parseInt(t1.getText());
							int no2=Integer.parseInt(t2.getText());
							int sum=no1+no2;
							String str=sum.toString();
							t3.setEditable(false);
							t3.setText(str);
						}
						else
						{
							s.setText("Text field is empty");
							setSize(460,310);
						}
				}


				public void paint(Graphics g)
				   { 
							try 
							{
								Date da=new Date();
							   InetAddress ipAddr = InetAddress.getLocalHost();
								String str=ipAddr.getHostAddress();
								showStatus("Time & Date:" +da+"    Ip Address:"+str  + "   Roll no:28");
							 }
						catch (Exception ex) {}
					}
	}