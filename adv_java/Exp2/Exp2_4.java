import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.util.*;

/*<applet code="Exp2_4" width=460 height=400>
</applet>*/

		public class Exp2_4 extends Applet 
		{
			static final int n=2;
			static final int m=3;

			public void init()
			{
				setLayout(new GridLayout(m,n,10,15));

				setFont(new Font("TimesNewRoman", Font.ITALIC, 18));
				for(int i=0;i<=n;i++)
				{
					for(int j=0;j<n;j++)
					{
						int k=i*n+j;
						if(k>=0)
							add(new Button(""+k));
					}
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

