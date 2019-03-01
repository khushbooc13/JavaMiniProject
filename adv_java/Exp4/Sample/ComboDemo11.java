import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.util.Date;
import java.net.InetAddress;

/*<applet code="ComboDemo11" width=460 height=100>
</applet>*/

	public class ComboDemo11 extends JApplet
	{
		public void init()
		{
			Container co=getContentPane();;
			co.setLayout(new FlowLayout());
			JComboBox jc= new JComboBox();

			jc.addItem("Cricket");
			jc.addItem("Hockey");
			jc.addItem("Football");
			jc.addItem("Tennis");
			co.add(jc);
		}
	}