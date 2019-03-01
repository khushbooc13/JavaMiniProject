import java.awt.*;
import javax.swing.*;

/*
<applet code="JTextFieldDemo" width=250 height=150>
</applet>
*/

public class JTextFieldDemo extends JApplet
{
	JTextField jtf;
	JTextField t;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		jtf=new JTextField("This is Swing TextField",15);
		t=new JTextField("hi");
		contentPane.add(jtf);
		contentPane.add(t);
	}
}