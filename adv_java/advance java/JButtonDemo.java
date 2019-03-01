import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="JButtonDemo" width=250 height=300>
</applet>
*/

public class JButtonDemo extends JApplet implements ActionListener
{
	JTextField jtf;
	JButton jb;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		jtf=new JTextField(15);
		ImageIcon i1=new ImageIcon("Images/s1.gif");
		jb=new JButton(i1);
		jb.setActionCommand("Button");
		jb.addActionListener(this);
		contentPane.add(jb);
		ImageIcon i2=new ImageIcon("Images/sl1.jpg");
		jb.setRolloverIcon(i2);
		contentPane.add(jtf);
	}

	public void actionPerformed(ActionEvent ae)
	{
		jtf.setText(ae.getActionCommand());
		jb.setEnabled(false);
	}

}