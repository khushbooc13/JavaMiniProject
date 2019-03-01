import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.net.InetAddress;

/*<applet code="SwingDemo" width=200 height=130>
</applet>*/

	public class SwingDemo extends JApplet
	{
		public void init()
		{
			Container co=getContentPane();
			co.setLayout(new FlowLayout());
			JLabel unm=new Label("User Name");
			JLabel pass=new Label("Password");
			JTextField ut=new JTextField(15);
			JTextField pt=new JTextField(15);
			JButton su=new JButton("Submit");
			JButton ca=new JButton("Cancle");

			co.add(unm);
			co.add(ut);
			co.add(pass);
			co.add(pt);
			co.add(su);
			co.add(ca);
			
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