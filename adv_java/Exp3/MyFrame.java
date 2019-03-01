import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame 
{
			
		MyFrame()
		{
			super("My Frame");
			MenuBar mbar = new MenuBar();
			setMenuBar(mbar);

			Menu format=new Menu("Format",true);
			Menu help=new Menu("help",false);
			mbar.add(format);
			mbar.add(help);
			

			MenuItem wordwrap=new MenuItem("word wrap");
			CheckboxMenuItem font=new CheckboxMenuItem("Font",true);

			format.add(wordwrap);
			format.add(font);
		}

				public  static void main(String args[])
				{
					MyFrame mf=new MyFrame();
					mf.setVisible(true);
					mf.setSize(400,350);
					mf.addWindowListener(new MyAdapter());
				}
		}

		class MyAdapter extends WindowAdapter
		{
			public void  windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}
