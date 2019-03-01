import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="JCheckBoxDemo" width=250 height=150>
</applet>
*/

public class JCheckBoxDemo extends JApplet implements ItemListener
{
	JTextField jtf;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon normal=new ImageIcon("Images/normal.gif");
		ImageIcon rollover=new ImageIcon("Images/rollover.gif");
		JCheckBox cb=new ImageIcon("Images/selected.gif");
		JCheckBox cb=new JCheckBox("C",normal);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);

		cb=new JCheckBox("C++",normal);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cd.addItemListener(this);
		contentPane.add(cb);

		cb=new JCheckBox("Java",normal);
		cb.setRollovercon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);

		cb.new JCheckBox("Perl",normal);
		cb.setRollOverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);
		jtf=new JTextField(15);
		contentPane.add(jtf);
		
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb=(JCheckBox)ie.getItem();
		jtf.setText(jtf.getText()+" "+cb.getText());
	}
}