import java.util.Date;
import java.net.InetAddress;
import java.awt.*;
import java.applet.*;
/*<applet code="Exp1_1" width=455 height=150>
</applet>*/

	public class Exp1_1 extends Applet
	{
			Checkbox chk1,chk2,chk3,chk4;  //create the check boxes
			CheckboxGroup cbg;    //create the group of check box i.e(Raido Buttons)

				public void init()
				{
					cbg=new CheckboxGroup();
					//creating  checkboxes
					chk1=new Checkbox("Windows vista");
					chk2=new Checkbox("Windows xp");  
					// to create radio button
					chk3=new Checkbox("Windows 7 ",true,cbg);
					chk4=new Checkbox("Linux",cbg,false);

					add(chk1);
					add(chk2);
					add(chk3);
					add(chk4);
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