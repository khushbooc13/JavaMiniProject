import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;

public class Exp3_1 extends Frame 
{
			
		Exp3_1()
		{
			super("Checkable Menu Item");
			MenuBar mbar = new MenuBar();
			setMenuBar(mbar);

			Menu insertmenu=new Menu("Insert Menu",true);
			Menu home=new Menu("Home",false);
			mbar.add(insertmenu);
			mbar.add(home);
			
			MenuItem paste=new MenuItem("Paste");
			CheckboxMenuItem picture=new CheckboxMenuItem("Picture");

			insertmenu.add(picture);
			home.add(paste);
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
					Exp3_1 mf=new Exp3_1();
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
