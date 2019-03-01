import java.awt.*;
import javax.swing.*;

/*
<applet code="JLabelDemo" width=250 height=150>
</applet>
*/

public class JLabelDemo extends JApplet
{
	public void init()
	{
		//Container contentPane=getContentPane();
		ImageIcon i1=new ImageIcon("studylink logo.png");
		JLabel j1=new JLabel("StudyLink",i1,JLabel.LEADING);
		//contentPane.add(j1);
		getContentPane().add(j1);
	}

}