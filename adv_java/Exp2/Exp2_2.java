//Program for Flow Layout Manager in applet
import java.net.InetAddress;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Exp2_2" width=460 height=100>
</applet>*/

		public class Exp2_2 extends Applet implements ItemListener
		{
			Choice ch;
			String msg="";

			public void init()
			{
				setLayout(new FlowLayout(FlowLayout.RIGHT,100,20));       //it is used to set the componenet to be aligned
				ch=new Choice();
				ch.add("Advance Java");
				ch.add("Software Testing");
				ch.add("OMD");
				ch.add("Operating System");

				add(ch);
				ch.addItemListener(this);
			}

			public void itemStateChanged(ItemEvent ie)
			{
				repaint();
			}

			public void paint(Graphics g)
			{
				msg="Current Selection:";
				msg+=ch.getSelectedItem();    //to returns the selected item
 				g.drawString(msg,6,70);
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
