import java.awt.*;
import java.awt.event.*;

class SampleDialog extends Dialog implements ActionListener
{
	SampleDialog(Frame parent, String title)
	{
		super(parent,title);
		setLayout(new FlowLayout());
		setSize(200,200);
		add(new Label("press this button"));
		Button b=new Button("cancel");
		add(b);
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}
}

class DialogDemo extends Frame
{
	DialogDemo()
	{
		setVisible(true);
		setSize(300,300);
		SampleDialog dnew=new SampleDialog(this,"New Dialog");
		dnew.setVisible(true);
		addWindowListener(new MyAdapter());
	}

	public static void main(String ar[])
	{
		DialogDemo obj=new DialogDemo();
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowCosing(WindowEvent we)
	{
		System.exit(0);
	}
}