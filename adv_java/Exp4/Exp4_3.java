import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*<applet code="Exp4_3" width=500 height=500>
</applet>
*/ 

public class Exp4_3 extends JApplet
{
	public void init()
	{
		JTabbedPane  jtp=new JTabbedPane(JTabbedPane.TOP);

		jtp.add("Cities",new CitiesPanel());
		jtp.add("Colors",new ColorsPanel());
		jtp.add("Flavors",new FlavorsPanel());
		getContentPane().add(jtp);
	}
}

		class CitiesPanel extends JPanel
		{
			public CitiesPanel()
			{
				add(new JButton("New York"));
				add(new JButton("London"));
				add(new JButton("Hong Kong"));
				add(new JButton("Tokyo"));
			}
		}

		class ColorsPanel extends JPanel
		{
			public ColorsPanel()
			{
				add(new JCheckBox("Red"));
				add(new JCheckBox("Blue"));
				add(new JCheckBox("Green"));
			}
		}

		class FlavorsPanel extends JPanel
		{
			public FlavorsPanel()
			{
				JComboBox jcb=new JComboBox();
				jcb.addItem("Vanilla");
				jcb.addItem("Chocolate");
				jcb.addItem("Strawberry");
				add(jcb);
			}
		}