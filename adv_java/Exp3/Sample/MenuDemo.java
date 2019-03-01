import java.awt.*;
import java.awt.event.*;


	public class MenuDemo extends Frame
	{
		MenuDemo()
		{
			MenuBar mbr=new MenuBar();
			//creating menus.
			Menu filemenu=new Menu("File");
			Menu editmenu=new Menu("Edit");
			Menu viewmenu=new Menu("View");
			//creating menuitem for file menu.
			MenuItem new1=new MenuItem("New");
			MenuItem open=new MenuItem("Open");
			filemenu.add(new1);
			editmenu.add(open);
			//Adding menus to menubar.
			mbr.add(filemenu);
			mbr.add(editmenu);
			mbr.add(viewmenu);
		    setMenuBar(mbr);
		}
		public static void main(String args[])
		{
			MenuDemo m= new MenuDemo();
			m.setVisible(true);
			m.setSize(400,300);
			m.addWindowListener(new MyWindowAdapter());
		}
	}


	class MyWindowAdapter extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
