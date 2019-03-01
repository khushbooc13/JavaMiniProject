import java.awt.*;
import java.applet.*;
import java.util.Date;
import java.net.*;
public class Exp1_4 extends Applet
{
	TextField tnm,tsur,tem;
	TextArea comment;
	Button b1,b2;
	Label name,surname,gender,tcomment,email;
	Checkbox male,Female;
	CheckboxGroup cbg;

	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.red);
		name= new Label("Name");
		cbg=new CheckboxGroup();
		tnm=new TextField(15);
		tsur=new TextField(20);
		tem=new TextField(20);
		comment=new TextArea(5,40);
		b1=new Button("Submit");
		b2=new Button("Cancel");
		name= new Label("Name");
		surname= new Label("SurName");
		gender= new Label("Gender");
		tcomment= new Label("Comment");
		email= new Label("Email");
		male= new Checkbox("Male",cbg,false);
		Female=new Checkbox("Female",cbg,false);

		//adding the components
		add(name);
		add(tnm);
		add(surname);
		add(tsur);
		add(gender);
		add(male);
		add(Female);
		add(email);
		add(tem);
		add(tcomment);
		add(comment);
		add(b1);
		add(b2);
	}
	public void paint(Graphics g)
	{
		try
		{
			Date d=new Date();
			String s=d.toString();
			InetAddress ip=InetAddress.getLocalHost();
			showStatus("Time & Date"+d+"IpAddress:"+ip+"Rollno 28");
		}
		catch (Exception e)
		{
		}
	}
		
	/*<applet code="Exp1_4" height=300 width=450>
	</applet>*/
	
}