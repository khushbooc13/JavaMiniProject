import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;
/*<applet code="Exp1_3" width=450 height=170>
</applet>*/

	public class Exp1_3 extends Applet 
	{
		
			Scrollbar vertSb,horzSb;

			public void init()
			{
				vertSb=new Scrollbar(Scrollbar.VERTICAL,0,1,0,300);  //consturctor Scrollbar(int style,int intialValue,int thumbSize,int min,int max);
				horzSb=new  Scrollbar(Scrollbar.HORIZONTAL,0,1,0,450);

				add(vertSb);
				add(horzSb);
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
						
     					g.drawString("ScrollBar Demo",70,90);
				}

	}