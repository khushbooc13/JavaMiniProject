import java.awt.*;
import java.awt.event.*;

class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
		addWindowListener(new MyWindowAdapter());
	}
}

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class FileDialogDemo
{
	public static void main(String ar[])
	{
		Frame f=new Frame("FIle Dialog Demo");
		f.setVisible(true);
		f.setSize(100,100);
		FileDialog fd=new FileDialog(f,"File Dialog",FileDialog.SAVE);
		fd.setVisible(true);
	}
}