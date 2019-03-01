//Creating the labels in applet


import java.awt.*;
import java.applet.*;
import java.net.InetAddress;
import java.util.Date;

/*<applet code="Exp2_1" width=370 height=150>
</applet>*/


	public class Exp2_1 extends Applet
	{
			Button b1,b2,b3;
			public void init()
			{
				setLayout(new FlowLayout(FlowLayout.RIGHT));
				Button b1=new Button("ok");
				Button b2=new Button("cancel");
				Button b3=new Button("exit");
				add(b1);
				add(b2);
				add(b3);
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
