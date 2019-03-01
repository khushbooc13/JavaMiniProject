import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

public class Exp4_4 extends JFrame
{
		Exp4_4()
			{
				super("JFrame Demo");
				setSize(300,350);
				setVisible(true);
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


		public static void main(String args[])
		{
			 Exp4_4 p1=new Exp4_4();
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
