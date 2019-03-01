//Creating  a  stand alone frame

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;

		public class Exp3_3 extends Frame
		{
				Exp3_3()
			{
					super("Sample frame");
					addWindowListener(new MyWindowAdapter2());
					setVisible(true);
					setSize(200,200);
			}

			 public void paint(Graphics g)
			   { 
				   Date da=new Date();
					String Str=da.toString();
							
						try 
						{
							InetAddress ipAddr = InetAddress.getLocalHost();
							String str=ipAddr.getHostAddress();
							g.drawString("Ip Arddress:"+str,10,185);
						 }catch (Exception ex) {}
						g.drawString("Date & Time:"+Str,10,165);
						g.drawString("Rol no:28",158,185);
				 }


				public  static void main(String args[])
				{
					Exp3_3 fm=new Exp3_3();
				}
		}

		class MyWindowAdapter2 extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
