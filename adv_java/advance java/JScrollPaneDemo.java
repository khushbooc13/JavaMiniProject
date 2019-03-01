import java.awt.*;
import javax.swing.*;

/*
<applet code="JScrollPanelDemo" width=300 height=250>
</applet>
*/

public class JScrollPaneDemo extends JApplet
{
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		jp.setLayout(new GridLayout(10,8));
		int b=0;
		for(int i=0;i<10;i++)
		{
			jp.add(new JButton("Button"+b));
			++b;
		}
	}
	int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
	JScrollPane jsp=new JScrollPane(jp,v,h);
	contentPane.add(jsp,BorderLayout.CENTER);
}