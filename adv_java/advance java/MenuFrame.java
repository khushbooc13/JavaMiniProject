import java.awt.*;
import java.awt.event.*;


public class MenuFrame extends Frame
{
	MenuFrame()
	{
		setSize(300,300);
		setVisible(true);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		Menu fileMenu=new Menu("File");
		Menu editMenu=new Menu("Edit");
		Menu sub=new Menu("subMenu");
		mbar.add(fileMenu);
		mbar.add(editMenu);
		mbar.add(sub);
		MenuItem exit=new MenuItem("exit");
		MenuItem dash=new MenuItem("-");
		MenuItem new1=new MenuItem("new");
		MenuItem cut=new MenuItem("cut");
		MenuItem copy=new MenuItem("copy");
		MenuItem paste=new MenuItem("find");
		CheckboxMenuItem replace=new CheckboxMenuItem("replace",true);
		fileMenu.add(new1);
		fileMenu.add(dash);
		fileMenu.add(exit);
		editMenu.add(cut);
		editMenu.add(copy);
		//editMenu.addSeparator();
		editMenu.add(new MenuItem("-"));
		editMenu.add(sub);
		editMenu.add(paste);
		editMenu.add(replace);
		addWindowListener(new MyAdapter());

	}

	public static void main(String args[]) 
	{
		MenuFrame obj=new MenuFrame();
	}
}

class MyAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}