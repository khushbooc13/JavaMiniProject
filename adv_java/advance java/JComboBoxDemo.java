import java.awt.*;
import javax.swing.*;

/*
<applet code="JComboBoxDemo" width=400 height=400>
</applet>
*/

public class JComboBoxDemo extends JApplet
{
	JComboBox c1;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		c1=new JComboBox();
		c1.addItem("Hi");
		c1.addItem("Bye");
		contentPane.add(c1);
	}
}