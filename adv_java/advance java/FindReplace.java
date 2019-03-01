import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="FindReplace" width=500 height=400>
</applet>
*/

public class FindReplace extends Applet implements TextListener , ActionListener
{
	int lastindexof=0,lastreplaced=0,index=0,previndex=0;
	String textareainput="",texttofind="",texttoreplace="",textall="",text="";
	TextArea textarea;
	TextField findtextfield,replacetextfield;
	Button findb,findnextb,replaceb,replaceallb;
	Label findlabel,replacelabel,outputlabel; 

	public void init()
	{
		textarea=new TextArea();
		findtextfield=new TextField(10);
		replacetextfield=new TextField(10);
		findb=new Button("Find");
		findnextb=new Button("FindNext");
		replaceb=new Button("Replace");
		replaceallb=new Button("ReplaceAll");
		findlabel=new Label("Enter the Text to Find : ");
		replacelabel=new Label("Enter the Text toReplace : ");
		outputlabel=new Label();
		add(textarea);
		add(findlabel);
		add(findtextfield);
		add(findb);
		add(findnextb);
		add(replacetextfield);
		add(replacelabel);
		add(replaceb);
		add(replaceallb);
		add(outputlabel);
		findtextfield.addTextListener(this);
		replacetextfield.addTextListener(this);
		findtextfield.addActionListener(this);
		replacetextfield.addActionListener(this);
		findb.addActionListener(this);
		findb.addActionListener(this);
		findnextb.addActionListener(this);
		replaceb.addActionListener(this);
		replaceallb.addActionListener(this);
	}
	
	public void textValueChanged(TextEvent te)
	{
	texttofind=findtextfield.getText();
	texttoreplace=replacetextfield.getText();
	textareainput=textarea.getText();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==findb)
		{
			if(findtextfield.getText()!=null & textarea.getText()!=null)
			{
				lastindexof=textareainput.indexOf(texttofind,0);
				outputlabel.setText("Element found at "+lastindexof);
			}
		}
		else if(ae.getSource()==findnextb)
		{
			if(findtextfield.getText()!=null && textarea.getText()!=null)
			{
				previndex=lastindexof;
				lastindexof=textareainput.indexOf(texttofind,lastindexof+1);
				outputlabel.setText("Element found at "+lastindexof);
			}
		}
		else if(ae.getSource()==replaceb)
		{
			text=textareainput.substring(0,lastindexof);
			text+=texttoreplace;
			//lastindexof=(lastindexof);
			text+=textareainput.substring(lastindexof+texttofind.length(),(textareainput.length()));
			textarea.setText(text);
			//textareainput=text;
		}
		else if(ae.getSource()==replaceallb)
		{
			textall=textarea.getText();
			textarea.setText(textall.replace(texttofind,texttoreplace));
		}
	}
}