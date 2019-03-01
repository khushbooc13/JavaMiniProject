import java.awt.*;
import java.applet.*;
import java.net.*;
import java.util.*;
 
 /*<applet code="MyIpAddress" width=500 height=500>
</applet>*/

public class MyIpAddress extends Applet
{
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
