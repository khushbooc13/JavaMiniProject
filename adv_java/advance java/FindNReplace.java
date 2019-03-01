//Creating the Find and ReplaceUsing applet

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="FindNReplace" width=500 height=500>
</applet>*/

public class FindNReplace extends Applet implements TextListener,ActionListener
{
	TextArea textArea;
	TextField textFiled1,textFiled2;
	Label label1,label2;
	Button replaceall,replace,findnext,find;
	String text,reaplace,toreplace;
	int a,findnx;
	public void init()
	{
		replaceall=new Button("Replace All");//Button(String str);
		findnext=new Button("Find Next");
		replace=new Button("Replace");
		find=new Button("Find");
		textFiled1=new TextField(12);
		textFiled2=new TextField(12);
		label1=new Label("Text To Find",Label.CENTER);   //Label(String str,int how);
		label2=new Label("Text To Replace",Label.CENTER);
		textArea=new TextArea("",15,50);  //TextArea(String str,int numLines,int numChars,int sbar's);

		add(label1);
		add(textFiled1);
		add(label2);
		add(textFiled2);
		add(textArea,BorderLayout.CENTER); //adding the component
		add(replace);
		add(replaceall);    //add(Component comp,int region);
		add(find);
		add(findnext);
		textFiled1.addTextListener(this);
		textFiled2.addTextListener(this);

		replaceall.addActionListener(this);
		replace.addActionListener(this);
		findnext.addActionListener(this);
		find.addActionListener(this);
	}


			public void textValueChanged(TextEvent te)
			{	
					//String msg;
					text=textArea.getText();
					reaplace=textFiled1.getText();
					toreplace=textFiled2.getText();
			}
			
		public void actionPerformed(ActionEvent ae)
		{
			//sele=textArea.getSelectedText();
			String str=ae.getActionCommand();
			if(str.equals("Replace All"))
			{
				action();
			}
			if(str.equals("Replace"))
			{
				action1();
			}
			 if(str.equals("Find Next"));
			{
				action2();
			}
			if(str.equals("Find"))
			{
				a=text.indexOf(reaplace);
				if(a>=0)
					a=a+1;
					repaint();
			}

		}


			void action()
			{
					if(text.contains(reaplace))
				{
					String newString=text.replace(reaplace,toreplace);    //
					textArea.setText(newString);
				}	
			}
			
			void action1()	
			{
					text=text.substring(0,a-1)+toreplace+text.substring((a-1)+reaplace.length(),text.length());    //string in textarea is ka substring nikala jab tak finding string nahi mel ta hai 
					textArea.setText(text);                             //Fir joh replace kar na hai use concatinate kiya me re string ke sath replacement ke bad
			}

			
			void action2()
			{
				findnx=reaplace.length();
				a=text.indexOf(reaplace,a+findnx);
				a=a+1;
				repaint();
			}

		public void paint(Graphics g)
		{
			g.drawString("String found at location:"+a,4,400);
		}

}