import java.awt.*;
import javax.swing.*;

/*<applet code="Exp4_5" width=500 height=500>
</applet>
*/ 

		public class Exp4_5 extends JApplet
		{
			public void init()
			{
					Container contentPane=getContentPane();
					contentPane.setLayout(new BorderLayout());
					JPanel jp=new JPanel();
					jp.setLayout(new GridLayout(10,8));     //10 by 8 means 80 omponent can be fitted
					int b=0;
					for(int i=0;i<10;i++)
					{
						for(int j=0;j<8;j++)
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

		}