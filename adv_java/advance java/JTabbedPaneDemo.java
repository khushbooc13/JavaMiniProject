import javax.swing.*;

/*
<applet code="JTabbedPaneDemo" width=400 height=100>
</applet>
*/

public class JTabbedPaneDemo extends JApplet
{
	public void init()
	{
		JTabbedPane jtp=new JTabbedPane(JTabbedPane.RIGHT);
		jtp.addTab("Cities",new CitiesPanel());
		jtp.addTab("Colors",new ColorsPanel());
		jtp.addTab("Flavors",new FlavorsPanel());
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
		add(new JCheckBox("Green"));
		add(new JCheckBox("Blue"));
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