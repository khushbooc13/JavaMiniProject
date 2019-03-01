import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;
import java.util.Date;
import java.awt.event.*;

public class Exp4_1 extends Frame 
{
			
		 JComboBox j1;
			Exp4_1()
			{
				super("ChangingColor");
				setLayout(new FlowLayout());
				setSize(500,400);
				
				j1=new JComboBox();
				j1.addItem("Red");
				j1.addItem("Green");
				j1.addItem("Blue");
				add(j1);
				setVisible(true);
			}
			
			/*public void paint(Graphics g)
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
						g.drawString("Rol no:28",135,185);
				 }*/


				public  static void main(String args[])
				{
					Exp4_1 mf=new Exp4_1();
					mf.addWindowListener(new MyAdapter1());
				}

		}

		class MyAdapter1 extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
