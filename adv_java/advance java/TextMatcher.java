import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="TextMatcher" width=380 height=150>
</applet>
*/

public class TextMatcher extends Applet implements TextListener 
{
		TextField nm;
		TextField ps;
		String s,v,len,nmlen;
		int up,low,num,spcl;
		public void init()
		{
			Label name =new Label("\nName :",Label.RIGHT);
			Label pass =new Label("Password :",Label.RIGHT);
			nm= new TextField(12);
			ps= new TextField(10);
			add(name);
			add(nm);
			add(pass);
			add(ps);
			nm.addTextListener(this);
			ps.addTextListener(this);
		}
	
		public void textValueChanged(TextEvent ae)
		{
			repaint();
		}
	
		boolean nameCheck()
		{
			s=nm.getText();
			s=s.toLowerCase();
			int loc = s.indexOf("vinay");
			if(loc == - 1)
				return false;
			else 
				return true;
		}
	
		int upperCheck()
		{
			v=ps.getText();
			for(int i=0;i<v.length();i++)
			{
				char u=v.charAt(i);
				if(u>=65 && u<=90)
						up=up+1;
			}
			return up;
		}
		
		
		int lowerCheck()
		{
			v=ps.getText();
			for(int i=0;i<v.length();i++)
			{
				char l=v.charAt(i);
				if(l>=97 && l<=122)
						low=low+1;
			}
			return low;
		}
		
		
		int numCheck()
		{
			v=ps.getText();
			for(int i=0;i<v.length();i++)
			{
				char n=v.charAt(i);
				if(n>=48 && n<=57)
						num=num+1;
			}
			return num;
		}
		
		
		int specialCheck()
		{
			v=ps.getText();
			for(int i=0;i<v.length();i++)
			{
				char s=v.charAt(i);
				if(s>=32 && s<= 47)
					spcl=spcl+1;
			}
			return spcl;
		}
	
	
		public void paint(Graphics g)
		{	
			nmlen=nm.getText();
			if(nmlen.length()!=0)
			{
				if(nameCheck()==true)
					g.drawString("Name Acepted",6,60);
				else
					g.drawString("Name not Accepted",6,60);
			}
			else
			g.drawString("Enter Name",6,60);
		
		
			len=ps.getText();
			if(len.length()!=0)
			{
				if(upperCheck()==0)
				{
					g.drawString("Sorry no uppercase found",6,80);
				}
				else if(lowerCheck()==0)
				{
					g.drawString("Sorry no lowercase found",6,80);
				}
				else if(numCheck()==0)
				{
					g.drawString("Sorry no Number found",6,80);
				}
				else if(specialCheck()==0)
				{
					g.drawString("Sorry no special symbol found",6,80);
				}
				else
				{
					g.drawString("Password Accepted",6,80);	
				}
			}
			else
			g.drawString("Enter Password",6,80);
		}
}
	