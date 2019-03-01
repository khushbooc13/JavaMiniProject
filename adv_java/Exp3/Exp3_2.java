import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;

public class Exp3_2 extends Frame 
{
			
		Exp3_2()
		{
			super("Exp3_2");
			MenuBar mbar = new MenuBar();
			setMenuBar(mbar);

			Menu pagelayout=new Menu("PageLayout");
			Menu references=new Menu("References");
			Menu mailing=new Menu("Mailing");

			mbar.add(pagelayout);
			mbar.add(references);
			mbar.add(mailing);
			
			MenuItem print=new MenuItem("Print");
			MenuItem email=new MenuItem("Email");

			pagelayout.add(print);
			mailing.add(email);

			mailing.setEnabled(false);
		}


			 public void paint(Graphics g)
			   { 
				   Date da=new Date();
					String Str=da.toString();
							
						try 
						{
							InetAddress ipAddr = InetAddress.getLocalHost();
							String str=ipAddr.getHostAddress();
							g.drawString("Ip Arddress:"+str,10,340);
						 }catch (Exception ex) {}
						g.drawString("Date & Time:"+Str,10,320);
						g.drawString("Roll no:28",160,340);
				 }

			
				public  static void main(String args[])
				{
					Exp3_2 mf=new Exp3_2();
					mf.setVisible(true);
					mf.setSize(400,350);
					mf.addWindowListener(new MyAdapter());
				}
		}

		class MyAdapter extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
