import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="QuoRem" width=300 height=300>
</applet>
*/

public class QuoRem extends Applet implements ActionListener
{ 
	int dividend,divisor;
	TextField remainder,quotient,num1,num2;
	Button div;
	Label remLabel,quoLabel;

	public void init()
	{
		remainder=new TextField(10);
		quotient=new TextField(10);
		num1=new TextField(10);
		num2=new TextField(10);
		div=new Button("/");
		remLabel=new Label("Remainder");
		quoLabel=new Label("Quotient");
		setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		add(num1);
		add(num2);
		add(remLabel);
		add(remainder);
		add(quoLabel);
		add(quotient);
		add(div);
		num1.addActionListener(this);
		num2.addActionListener(this);
		remainder.addActionListener(this);
		quotient.addActionListener(this);
		div.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("/"))
		{
			int quo=0,divid=0,divis=0;
			divisor=Integer.parseInt(num2.getText());
			dividend=Integer.parseInt(num1.getText());
			
			if(dividend<0)
			{
				dividend=-(dividend);
				divid=1;
			}
			if(divisor<0)
			{
				divisor=-(divisor);
				divis=1;
			}
			while(dividend>=divisor)
			{
				dividend-=divisor ;
				quo++;
			}
			if(divid==1 || divis==1)
			{
				if(divid==1 && divis==1)
				{
				remainder.setText(""+dividend);
				quotient.setText(""+quo);
				}
				else
				{
				remainder.setText(""+dividend);
				quotient.setText("-"+quo);
				}
			}
			else
			{
				remainder.setText(""+dividend);
				quotient.setText(""+quo);
			}
		}
	}

}