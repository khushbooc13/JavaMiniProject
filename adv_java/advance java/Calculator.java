import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Calculator" width=300 height=300>
</applet>
*/

public class Calculator extends Applet implements ActionListener
{
	Label l1;
	int res;
	String str="";
	TextField num1,num2,result;
	Button addition,sub,mul,div,equal;

	public void init()
	{
		l1=new Label();
		res=0;
		num1=new TextField(10);
		num2=new TextField(10);
		result=new TextField(20);
		addition=new Button("+");
		sub=new Button("-");
		mul=new Button("x");
		div=new Button("/");
		equal=new Button("=");
		add(num1);
		add(l1);
		add(num2);
		add(result);
		add(addition);
		add(sub);
		add(mul);
		add(div);
		add(equal);
		num1.addActionListener(this);
		num2.addActionListener(this);
		result.addActionListener(this);
		addition.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equal.addActionListener(this);
		result.setEditable(false);
	}

	public void actionPerformed(ActionEvent ae)
	{
		result.setText("");
		int no1=Integer.parseInt(num1.getText());
		int no2=Integer.parseInt(num2.getText());
		str=ae.getActionCommand();
		if(num1.getText()!=null && num2.getText()!=null)
		{
			if(str.equals("+"))
			{ 
				l1.setText("+");
				res=(no1+no2);
			}
			else if(str.equals("-"))
			{
				l1.setText("-");
				res=(no1-no2);
			}
			else if(str.equals("x"))
			{
				l1.setText("x");
				res=(no1*no2);
			}
			else if(str.equals("/"))
			{
				l1.setText("/");
				res=(no1/no2);
			}
			if(str.equals("="))
			{
			
				result.setText(Integer.toString(res));
			}
		}
	}
}