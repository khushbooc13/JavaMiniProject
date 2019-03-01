//Creating the labels in applet


import java.awt.*;
import java.applet.*;


	/*<applet code="LabelDemo" width=350 height=250>
</applet>*/


	public class LabelDemo extends Applet
	{
		public void init()
		{
			setLayout(new GridLayout(3,1));
			Label One=new Label("One",Label.RIGHT);
			Label Two=new Label("Two",Label.CENTER);
			Label Three=new Label("Three",Label.LEFT);

			//manually setting the component to the left
			//One.setBounds(230,10,27,15);
			//Two.setBounds(265,10,33,15);
			//Three.setBounds(296,10,42,15);

				add(One);
				add(Two);
				add(Three);
		}
			
	}
