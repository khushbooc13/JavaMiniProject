import java.awt.*;
import java.awt.event.*;

public class NotepadSamp extends Frame  implements ActionListener  
{
	int i=1;
	NotepadSamp(String str)
	{
		super(str);
		setSize(300,300);
		setLocation(100,200);
		setVisible(true);
		MenuBar mbar=new MenuBar();
		setMenuBar(mbar);
		TextArea ta=new TextArea("",50,50,TextArea.SCROLLBARS_BOTH);
		
			//Menu																		
		Menu filemenu= new Menu("File");							
		Menu editmenu= new Menu("Edit");							
		Menu formatmenu= new Menu("Format");				
		Menu viewmenu= new Menu("View");
		Menu helpmenu= new Menu("Help");
		mbar.add(filemenu);
		mbar.add(editmenu);
		mbar.add(formatmenu);
		mbar.add(viewmenu);
		mbar.add(helpmenu);
																					
	//MenuItems
		//File
		MenuItem new1 =new MenuItem("New");
		MenuItem open =new MenuItem("Open...");
		MenuItem save =new MenuItem("Save");
		MenuItem saveas =new MenuItem("Save As...");
		MenuItem pagesetup =new MenuItem("Page Setup...");
		MenuItem print =new MenuItem("Print...");
		MenuItem exit =new MenuItem("Exit");
		//Edit
		MenuItem undo=new MenuItem("Undo");
		MenuItem cut =new MenuItem("Cut");
		MenuItem copy =new MenuItem("Copy");
		MenuItem paste =new MenuItem("Paste");
		MenuItem delete =new MenuItem("Delete");
		MenuItem find =new MenuItem("Find...");
		MenuItem findnext =new MenuItem("Find Next");
		MenuItem replace =new MenuItem("Replace");
		MenuItem goto1 =new MenuItem("Go To...");
		MenuItem selectall =new MenuItem("Select All");
		MenuItem timedate =new MenuItem("Time/Date");
		//Format
		CheckboxMenuItem wordwrap= new CheckboxMenuItem("Word Wrap",false);
		MenuItem font =new MenuItem("Font...");
		//View
		CheckboxMenuItem status= new CheckboxMenuItem("Status Bar",false);
		//Help
		MenuItem viewhelp =new MenuItem("View Help");
		MenuItem about =new MenuItem("About Notepad");
		//adding in file
		filemenu.add(new1);
		filemenu.add(open);
		filemenu.add(save);
		filemenu.add(saveas);
		filemenu.add(new MenuItem("-"));
		filemenu.add(pagesetup);
		filemenu.add(print); 
	    filemenu.add(new MenuItem("-"));
		filemenu.add(exit);
		//adding in edit
		editmenu.add(undo);
		editmenu.add(new MenuItem("-"));
		editmenu.add(cut);
		editmenu.add(copy);
		editmenu.add(paste);
		editmenu.add(delete);
		editmenu.add(new MenuItem("-"));
		editmenu.add(find);
		editmenu.add(findnext);
		editmenu.add(replace);
		editmenu.add(goto1);
		editmenu.add(new MenuItem("-"));
		editmenu.add(selectall);
		editmenu.add(timedate);
		//adding in format
		formatmenu.add(wordwrap);
		formatmenu.add(font);
		//adding in view
		viewmenu.add(status);
		//adding in help
		helpmenu.add(viewhelp);
		helpmenu.add(about);
		add(ta);
		exit.addActionListener(this);
		new1.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		addWindowListener(new WinAdapter());
	}
	
	
	public void actionPerformed(ActionEvent ae)
		{
			String st=ae.getActionCommand();
		// New MenuItems
			if(st.equals("Exit"))
			{
				System.exit(0);
			}
			else if(st.equals("New"))
			{
				NewDialog nw=new NewDialog(this,"Notepad");
				nw.setVisible(true);
			}
			else if(st.equals("Open..."))
			{
				FileDialog fd=new FileDialog(this,"Open");
				fd.setVisible(true);
			}
			else if(st.equals("Save"))
			{
				FileDialog fd=new FileDialog(this,"Save As",FileDialog.SAVE);
				fd.setVisible(true);
			}
			else if(st.equals("Save As..."))
			{
				FileDialog fd=new FileDialog(this,"Save As",FileDialog.SAVE);
				fd.setVisible(true);
			}
			else if(st.equals("Status Bar"))
			{

				//showStatus(i);
				repaint();
			}
			else if(ae.getModifiers()==10 )
			{
				
			}
		}
		
		public void paint(Graphics g)
		{
			
			//g.drawString(i.toString(),50,50);
		}
		
		public static void main(String args[])
	{
		NotepadSamp ob= new NotepadSamp("Untitled - Notepad");
	}
	
}
		
		
		class WinAdapter extends WindowAdapter
		{
			//		NotepadSamp refObj;
	//		WinAdapter(NotepadSamp ob)
	//		{
	//			refObj = ob;
	//		}
			public void windowClosing(WindowEvent we)
			{
		//		new NewDialog(refObj, "Notepad");
				System.exit(0);
			}
		}
		
		
		
		
	class NewDialog extends Dialog implements ActionListener
	{
		NewDialog(Frame parent ,String title)
		{
			super(parent,title,true);
			setLayout(new FlowLayout());
			setSize(300,150);
			setLocation(610,350);
			add(new Label ("Do you want to save changes to Untitled?"));
			Button s=new Button("Save");
			Button d=new Button("Don't Save");
			Button c=new Button("Cancel");
			add(s);
			add(d);
			add(c);
			s.addActionListener(this);
			d.addActionListener(this);
			c.addActionListener(this);
			addWindowListener(new NewWinAdapter(this));
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			String st=ae.getActionCommand();
			if(st.equals("Save"))
			{
				FileDialog fd=new FileDialog(this,"Save As",FileDialog.SAVE);
				fd.setVisible(true);
			}
			else if(st.equals("Don't Save"))
			{
				this.setVisible(false);
			}
			else if(st.equals("Cancel"))
			{
				System.exit(0);
			}
			
		}
		
	}
	
				
	class NewWinAdapter extends WindowAdapter
		{
		
				NewDialog ob1;
			NewWinAdapter(NewDialog ob)
			{
				ob1 = ob;
			}
			public void windowClosing(WindowEvent we)
			{
					ob1.setVisible(false);
			}
			
		}
		
		
		
		
		