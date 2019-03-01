import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Date;
import java.net.InetAddress;

	public class Exp1_2 extends Frame
	{
		Label One,Two,Three;
		TextArea ta;
		Button b1,b2;

			Exp1_2()
			{
					super("Components Frame");
					addWindowListener(new MyWindowClose());
					setLayout(new FlowLayout());
					setBackground(Color.green);
					setForeground(Color.blue);
					//to add label
					 One=new Label("One",Label.LEFT);
					 Two=new Label("Two",Label.CENTER);
					 Three=new Label("Three",Label.RIGHT);
					//to add text area 
					ta=new TextArea("Adavance Java");
					//to add button
					b1=new Button("Button1");
					b2=new Button("Button2");
				
					add(One);
					add(Two);
					add(Three);
					add(ta);
					add(b1);
					add(b2);

					setVisible(true);
					setSize(500,360);
			}
			  public void paint(Graphics g)
			   { 
				   Date da=new Date();
					String Str=da.toString();
							
						try 
						{
							InetAddress ipAddr = InetAddress.getLocalHost();
							String str=ipAddr.getHostAddress();
							g.drawString("Ip Arddress:"+str,10,350);
						 }catch (Exception ex) {}
						g.drawString("Date & Time:"+Str,10,330);
				 }


				public  static void main(String args[])
				{
					Exp1_2 fm=new Exp1_2();
				}
			
	}



	class MyWindowClose extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
