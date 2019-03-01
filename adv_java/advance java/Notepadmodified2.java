import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Notepadmodified2 extends Frame implements ActionListener , TextListener
{
	Frame f=new Frame();
	String name="",path="",n="",str="";
	TextArea textarea;
	MenuBar mbar;
	Menu filemenu;
	Menu editmenu;
	Menu formatmenu;
	Menu viewmenu;
	Menu helpmenu;
	MenuItem filenew;
	MenuItem fileopen;
	MenuItem filesave;
	MenuItem filesaveas;
	MenuItem filepagesetup;
	MenuItem fileprint;
	MenuItem fileexit;
	MenuItem editundo;
	MenuItem editcut;
	MenuItem editcopy;
	MenuItem editpaste;
	MenuItem editdelete;
	MenuItem editfindreplace;
	MenuItem editgoto;
	MenuItem editselectall;
	MenuItem edittimedate;
	CheckboxMenuItem formatwordwrap;
	MenuItem formatfont;
	MenuItem viewstatusbar;
	MenuItem helpviewhelp;
	MenuItem helpaboutnotepad;
	FileDialog fileopendialog;
	FileDialog filesavedialog;
	FileDialog filesaveasdialog;
	filepagesetupdialog fpsd;
	editfindreplacedialog efrd;
	editgotodialog egtd;
	formatfontdialog  ffd;
	
	public Notepadmodified2(String str)
	{
		super(str);											 										//to give title to notepad
		setSize(500,600);
		setVisible(true);
		mbar=new MenuBar();																//creating menubar
		setMenuBar(mbar);																	//adding menubar
		filemenu=new Menu("File");														//creating menus
		editmenu=new Menu("Edit");													//
		formatmenu=new Menu("Format");											//	
		viewmenu=new Menu("View");												//
		helpmenu=new Menu("Help");													//
		mbar.add(filemenu);																	//adding menus to menubar
		mbar.add(editmenu);																	//	
		mbar.add(formatmenu);															//
		mbar.add(viewmenu);																//
		mbar.add(helpmenu);																//
		filenew=new MenuItem("New");												//creating menuitems for filemenu
		fileopen=new MenuItem("Open...");											//						
		filesave=new MenuItem("Save");												//		
		filesaveas=new MenuItem("SaveAs...");									//
		filepagesetup=new MenuItem("Page Setup...");						//
		fileprint=new MenuItem("Print...");											//
		fileexit=new MenuItem("Exit");													//
		editundo=new MenuItem("Undo");											//creating menuitems for editmenu
		editcut=new MenuItem("Cut");													//
		editcopy=new MenuItem("Copy");											//
		editpaste=new MenuItem("Paste");											//
		editdelete=new MenuItem("Delete");										//
		editfindreplace=new MenuItem("Find/Replace");					//
		editgoto=new MenuItem("Go To...");										//
		editselectall=new MenuItem("Select All");								//
		edittimedate=new MenuItem("Time/Date");							//
		formatwordwrap=new CheckboxMenuItem("Word Wrap",true);	//creating menuitems for formatmenu
		formatfont=new MenuItem("Font...");										//
		viewstatusbar=new MenuItem("Status Bar");							//creating menuitems for viewmenu
		helpviewhelp=new MenuItem("View Help");							//creating menuitems for helpmenu
		helpaboutnotepad=new MenuItem("About Notepad");			//

		textarea=new TextArea("Advance Java",20,30,TextArea.SCROLLBARS_BOTH);			//creating textarea

		filemenu.add(filenew);																//adding menuitems in filemenu
		filemenu.add(fileopen);																//
		filemenu.add(filesave);																//
		filemenu.add(filesaveas);															//
		filemenu.addSeparator();															//adding separator to filemenu
		filemenu.add(filepagesetup);													//	
		filemenu.add(fileprint);																//
		filemenu.addSeparator();															//adding separator to filemenu
		filemenu.add(fileexit);																//
		editmenu.add(editundo);															//adding menuitems in editmenu
		editmenu.addSeparator();														//adding separator to editmenu		
		editmenu.add(editcut);																//
		editmenu.add(editcopy);															//
		editmenu.add(editpaste);															//
		editmenu.add(editdelete);															//
		editmenu.addSeparator();														//adding separator to editmenu
		editmenu.add(editfindreplace);												//
		editmenu.add(editgoto);															//
		editmenu.addSeparator();														//adding separator to editmenu
		editmenu.add(editselectall);														//
		editmenu.add(edittimedate);														//
		formatmenu.add(formatwordwrap);											//adding menuitems in formatmenu
		formatmenu.add(formatfont);													//
		viewmenu.add(viewstatusbar);												//adding menuitems in viewmenu
		helpmenu.add(helpviewhelp);													//adding menuitems in helpmenu
		helpmenu.addSeparator();														//adding separator to helpmenu
		helpmenu.add(helpaboutnotepad);											//	

		add(textarea);																			//adding textarea

		addWindowListener(new MyWindowAdapter(this));				//adding WindowListener
		textarea.addTextListener(this);												//adding textlistener to textarea
		filenew.addActionListener(this);												//adding ActionListener to menuitems
		fileopen.addActionListener(this);												//
		filesave.addActionListener(this);												//
		filesaveas.addActionListener(this);											//
		filepagesetup.addActionListener(this);									//
		fileprint.addActionListener(this);												//
		fileexit.addActionListener(this);												//
		editundo.addActionListener(this);											//	
		editcut.addActionListener(this);												//
		editcopy.addActionListener(this);											//
		editpaste.addActionListener(this);											//
		editdelete.addActionListener(this);											//
		editfindreplace.addActionListener(this);												//
		editgoto.addActionListener(this);												//
		editselectall.addActionListener(this);										//
		edittimedate.addActionListener(this);										//
		formatwordwrap.addActionListener(this);								//
		formatfont.addActionListener(this);											//
		viewstatusbar.addActionListener(this);									//
		helpviewhelp.addActionListener(this);									//
		editundo.setEnabled(false);														//	initializing these menuitems disabled
		filesave.setEnabled(false);														//
		filesaveas.setEnabled(false);													//
		editcut.setEnabled(false);															//
		editcopy.setEnabled(false);														//
		editdelete.setEnabled(false);													//
		editfindreplace.setEnabled(false);													    //
		editgoto.setEnabled(false);														//
		viewstatusbar.setEnabled(false);											//
	}	

	public void textValueChanged(TextEvent te)
	{
		str=textarea.getText();
		if(str!=null)
		{
			filesave.setEnabled(true);
			filesaveas.setEnabled(true);
			editundo.setEnabled(true);
			editcut.setEnabled(true);
			editcopy.setEnabled(true);
			editdelete.setEnabled(true);
			editfindreplace.setEnabled(true);
			editgoto.setEnabled(true);
			editselectall.setEnabled(true);
		}
		else if(str==null)
		{
			filesave.setEnabled(false);
			filesaveas.setEnabled(false);
			editundo.setEnabled(false);
			editcut.setEnabled(false);
			editcopy.setEnabled(false);
			editdelete.setEnabled(false);
			editfindreplace.setEnabled(false);
			editgoto.setEnabled(false);
			editselectall.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("New"))							//for file menu new option
		{
			textarea.setText("");
		}
		if(ae.getActionCommand().equals("Open..."))						//for file menu open option
		{
			open();
		}
		if(ae.getActionCommand().equals("Save"))							//for filemenu save option
		{
			filesave();
		}
		if(ae.getActionCommand().equals("SaveAs..."))					//for filemenu saveas option
		{
			filesaveasdialog=new FileDialog(this,"Save As",FileDialog.SAVE);		
			filesavedialog.setVisible(true);
		}
		if(ae.getActionCommand().equals("Page Setup..."))				//for filemenu pagesetup option
		{
			fpsd=new filepagesetupdialog(this,"Page Setup");
		}
		if(ae.getActionCommand().equals("Exit"))								//for closing notepad
		{
			System.exit(0);
		}
		if(ae.getActionCommand().equals("Find/Replace"))							//for editmenu find option
		{
			efrd=new editfindreplacedialog(this,"Find/Replace");
		}
		if(ae.getActionCommand().equals("Go To..."))						//for edit menu goto option
		{
			egtd=new editgotodialog(this,"Go To Line");
		}
		if(ae.getActionCommand().equals("Font..."))							//for format menu font option
		{
			ffd=new formatfontdialog(this,"Font");
		}
	}

	void open()
	{
		fileopendialog=new FileDialog(f,"Open",FileDialog.LOAD);
		fileopendialog.setVisible(true);
		name=fileopendialog.getFile();
		path=fileopendialog.getDirectory();
		n=path+name+"";
		File inputfile=new File(path,name);
		try
		{
			FileInputStream fis=new FileInputStream(inputfile);
			int ch;
			textarea.setText("");
			while((ch=fis.read())!=-1)
			{
				textarea.append((char)ch+"");
			}
			filesave.setEnabled(true);
			fis.close();
			f.setTitle(fileopendialog.getFile()+"-Notepad");
		}
		catch (Exception e)
		{
		}
	 }

	void filesave() 
	{
		filesavedialog=new FileDialog(f,"Save",FileDialog.SAVE);
		if(str!=null)
		{
			try
			{
				filesavedialog.setVisible(true);
				name=filesavedialog.getFile();
				path=filesavedialog.getDirectory();
				String str1=textarea.getText();
				File f1=new File(path,name);
				FileOutputStream fos=new FileOutputStream(f1);
				char ar[];
				ar=str1.toCharArray();
				for(int i=0;i<ar.length;i++)
				{
					fos.write(ar[i]);
				}
				fos.close();
			}
			catch (Exception e)
			{
			}
		}		
	}

	public static void main(String args[])
	{

		Notepadmodified2 notepad=new Notepadmodified2("Notepad");							//creating object of notepad
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class MyWindowAdapter extends WindowAdapter						//MyWindowAdapter class for adding WindowListener
{
	Notepadmodified2 refobj;																				//reference object to Notepad class
	MyWindowAdapter(Notepadmodified2 obj)
	{
		refobj=obj;
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);											 								//for closing notepad
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class editfindreplacedialog extends Dialog implements TextListener, ActionListener , ItemListener	//class for edit menu findreplace option dialog
{
	Notepadmodified2 refobj;
	int lastindexof=0,previndex=0;
	String texttofind="";

	Panel panel1;
	Label findwhat;
	Label replacewith;
	TextField findwhattextfield;
	TextField replacewithtextfield;	
	Button findnext;
	Button replace;
	Panel panel2;
	CheckboxGroup cbg;
	Checkbox up;
	Checkbox down;
	Panel panel3;
	Button replaceall;
	Button cancel;
	Panel panel4;
	Checkbox matchcase;
	Panel panel5;
	Label outputlabel;
	
	editfindreplacedialog(Frame parent,String title)
	{
		super(parent,title);
		setLayout(new FlowLayout());
		setSize(400,200);
		setVisible(true);
		panel1=new Panel();
		panel1.setLayout(new GridLayout(2,3));
		findwhat=new Label("Find what : ");
		replacewith=new Label("Replace with : ");
		findwhattextfield=new TextField(10);
		replacewithtextfield=new TextField(10);
		findnext=new Button("Find next");
		replace=new Button("Replace ");
		panel1.add(findwhat);
		panel1.add(findwhattextfield);
		panel1.add(findnext);
		panel1.add(replacewith);
		panel1.add(replacewithtextfield);
		panel1.add(replace);
		findwhattextfield.addTextListener(this);
		replacewithtextfield.addTextListener(this);
		findnext.addActionListener(this);
		replace.addActionListener(this);
	
		panel2=new Panel();
		panel2.setLayout(new GridLayout(2,1,5,5));
		cbg=new CheckboxGroup();
		up=new Checkbox("Up",cbg,false);
		down=new Checkbox("Down",cbg,true);
		panel2.add(up);
		panel2.add(down);
		up.addItemListener(this);
		down.addItemListener(this);

		panel3=new Panel();
		panel3.setLayout(new GridLayout(2,1,5,5));
		replaceall=new Button("Replace All");
		cancel=new Button("Cancel");
		panel3.add(replaceall);
		panel3.add(cancel);
		replaceall.addActionListener(this);
		cancel.addActionListener(this);

		panel4=new Panel();
		panel4.setLayout(new GridLayout(1,3,5,5));
		matchcase=new Checkbox("Match case");
		panel4.add(matchcase);
		panel4.add(panel2);
		panel4.add(panel3);
		matchcase.addItemListener(this);

		panel5=new Panel();
		panel5.setLayout(new GridLayout(3,1,5,5));
		outputlabel=new Label("");
		panel5.add(panel1);
		panel5.add(panel4);
		panel5.add(outputlabel);
		add(panel5);
	}	

	public void textValueChanged(TextEvent te){}

	public void itemStateChanged(ItemEvent ie){}

	public void actionPerformed(ActionEvent ae)							
	{	
		if(ae.getActionCommand().equals("Find next"))
		{
			if(findwhattextfield.getText()!=null && textarea.getText()!=null)
			{
				
				lastindexof=textarea.indexOf(texttofind,0);
				outputlabel.setText("Element found at "+lastindexof);

				previndex=lastindexof;
				lastindexof=textarea.indexOf(texttofind,lastindexof+1);
				outputlabel.setText("Element found at "+lastindexof);
			}
		}
		if(ae.getActionCommand().equals("Cancel"))
		{
			dispose();
		}
	}	 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class filepagesetupdialog extends Dialog implements ActionListener , ItemListener , TextListener
{
	Panel panel1;
	Label size;
	Label source;
	Choice sizechoice;
	Choice sourcechoice;
	Panel panel2;
	CheckboxGroup orientation;
	Checkbox portrait;
	Checkbox landscape;
	Panel panel3;
	Label left;
	Label right;
	Label top;
	Label bottom;
	TextField lefttextfield;
	TextField righttextfield;
	TextField toptextfield;
	TextField bottomtextfield;
	Panel panel4;
	Label header;
	Label footer;
	TextField headertextfield;
	TextField footertextfield;
	Panel panel5;
	Button ok;
	Button cancel;
	Panel panel6;
	TextArea preview;
	Panel panel7;
	Panel panel8;
	Panel panel9;
	Panel panel10; 

	filepagesetupdialog(Frame parent,String title)
	{
		super(parent,title);	
		setLayout(new GridLayout(1,1,5,5));													
		setSize(800,200);																					
		setVisible(true);

		panel1=new Panel();																	//file menu pagesetup dialog
		panel1.setLayout(new GridLayout(2,2,5,5));							//	
		size=new Label("Size : ");															//
		source=new Label("Source : ");												//
		sizechoice=new Choice();														//
		sizechoice.add("A3");																//
		sizechoice.add("A4");																//
		sizechoice.add("B4(JIS)");														//
		sizechoice.add("B5(JIS)");														//
		sizechoice.add("Envelope #10");												//
		sizechoice.add("Envelope Monarch");									//
		sizechoice.add("Executive");													//
		sizechoice.add("Legal");															//
		sizechoice.add("Letter");															//
		sizechoice.add("Tabloid");														//
		sourcechoice=new Choice();													//
		panel1.add(size);																		//
		panel1.add(source);																	//
		panel1.add(sizechoice);															//
		panel1.add(sourcechoice);														//
		sizechoice.addItemListener(this);											//
		sourcechoice.addItemListener(this);										//
	
		panel2=new Panel();																	//
		panel2.setLayout(new GridLayout(2,1,5,5));							//
		orientation=new CheckboxGroup();										//
		portrait=new Checkbox("Portrait",orientation,false);				//
		landscape=new Checkbox("Landscape",orientation,true);	//
		panel2.add(portrait);																	//
		panel2.add(landscape);															//
		portrait.addItemListener(this);													//
		landscape.addItemListener(this);											//
	
		panel3=new Panel();																	//
		panel3.setLayout(new GridLayout(2,4,5,5));							//
		left=new Label("Left : ");															//
		right=new Label("Right : ");														//
		top=new Label("Top : ");															//
		bottom=new Label("Bottom : ");												//
		righttextfield=new TextField(5);												//
		lefttextfield=new TextField(5);													//
		toptextfield=new TextField(5);													//
		bottomtextfield=new TextField(5);											//
		panel3.add(left);																			//
		panel3.add(lefttextfield);															//
		panel3.add(right);																		//
		panel3.add(righttextfield);															//
		panel3.add(top);																		//
		panel3.add(toptextfield);															//
		panel3.add(bottom);																	//
		panel3.add(bottomtextfield);														//
		lefttextfield.addTextListener(this);											//
		righttextfield.addTextListener(this);											//
		toptextfield.addTextListener(this);											//
		bottomtextfield.addTextListener(this);										//
	
		panel4=new Panel();																	//
		panel4.setLayout(new GridLayout(2,2,5,5));							//
		header=new Label("Header : ");												//
		footer=new Label("Footer : ");													//
		headertextfield=new TextField(20);											//
		footertextfield=new TextField(20);											//
		panel4.add(header);																	//
		panel4.add(headertextfield);													//
		panel4.add(footer);																	//
		panel4.add(footertextfield);														//
		headertextfield.addTextListener(this);										//
		footertextfield.addTextListener(this);										//
			
		panel5=new Panel();																	//
		panel5.setLayout(new GridLayout(1,2,5,5));							//
		ok=new Button("OK");																//
		cancel=new Button("Cancel");													//
		panel5.add(ok);																			//
		panel5.add(cancel);																	//
		ok.addActionListener(this);														//
		cancel.addActionListener(this);												//
		
		panel6=new Panel();																	//
		panel6.setLayout(new GridLayout(1,1,5,5));							//
		preview=new TextArea();															//
		panel6.add(preview);																//
		
		panel7=new Panel();																	//
		panel7.setLayout(new GridLayout(2,1,5,5));							//
		panel7.add(panel6);																	//
		panel7.add(panel5);																	//
		
		panel8=new Panel();																	//
		panel8.setLayout(new GridLayout(1,2,5,5));							//
		panel8.add(panel2);																	//
		panel8.add(panel3);																	//
	
		panel9=new Panel();																	//
		panel9.setLayout(new GridLayout(3,1,5,5));							//
		panel9.add(panel1);																	//
		panel9.add(panel8);																	//
		panel9.add(panel4);																	//
		
		panel10=new Panel();																//
		panel10.setLayout(new GridLayout(1,2,5,5));						//
		panel10.add(panel9);																//
		panel10.add(panel7);																//
		add(panel10);																			//
	}	

	public void textValueChanged(TextEvent te){}
	public void itemStateChanged(ItemEvent ie){}

	public void actionPerformed(ActionEvent ae)							
	{	
		dispose();																					//for closing pagesetup dialog box
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class editgotodialog extends Dialog implements ActionListener , TextListener
{
	Panel panel1;
	Button gotob;
	Button cancel;
	Panel panel2;
	Label linenumber;
	TextField linenumbertextfield;

	editgotodialog(Frame parent,String title)
	{
		super(parent,title);	
		setLayout(new GridLayout(1,1,5,5));										//layout for editmenu goto dialog
		setSize(250,100);															            //size for editmenu goto dialog
		setVisible(true);
		
		panel1=new Panel();																	//edit menu goto dialog box
		panel1.setLayout(new GridLayout(1,2,5,5));							//
		gotob=new Button("Go To");													//
		cancel=new Button("Cancel");													//
		panel1.add(gotob);																	//
		panel1.add(cancel);																	//
		gotob.addActionListener(this);													//
		cancel.addActionListener(this);												//
		
		panel2=new Panel();																	//
		panel2.setLayout(new GridLayout(3,1,5,1));							//
		linenumber=new Label("Line number : ");								//
		linenumbertextfield=new TextField(20);									//
		panel2.add(linenumber);															//
		panel2.add(linenumbertextfield);												//
		panel2.add(panel1);																	//
		linenumbertextfield.addTextListener(this);								//
		add(panel2);																				//
	}

	public void textValueChanged(TextEvent te){}
	
	public void actionPerformed(ActionEvent ae)							
	{	
		dispose();																					//for closing gotoline dialog box
	}
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class formatfontdialog extends Dialog implements TextListener , ActionListener , ItemListener 
{
	Panel panel1;
	Label font;
	Label fontstyle;
	Label size;
	TextField fonttextfield;
	TextField fontstyletextfield;
	TextField sizetextfield;
	List fontlist;
	List fontstylelist;	
	List sizelist;
	Panel panel2;
	Button ok;
	Button cancel;
	Panel panel3;
	Label samplelabel;
	TextField sampletextfield;
	Label scriptlabel;
	Choice scriptchoice;

	formatfontdialog(Frame parent,String title)
	{
		super(parent,title);
		setLayout(new GridLayout(1,1,5,5));
		setSize(400,400);
		setVisible(true);

		panel1=new Panel();																	//formet menu font dialog
		panel1.setLayout(new GridLayout(3,3,5,1));							//
		font=new Label("Font : ");															//
		fontstyle=new Label("Font style : ");										//
		size=new Label("Size : ");															//
		fonttextfield=new TextField(20);												//
		fontstyletextfield=new TextField(15);										//
		sizetextfield=new TextField(5);												//
		fontlist=new List(6,false);															//
		fontstylelist=new List(6,false);													//
		sizelist=new List(7,false);															//
		panel1.add(font);																		//
		panel1.add(fontstyle);																//
		panel1.add(size);																		//
		panel1.add(fonttextfield);															//
		panel1.add(fontstyletextfield);													//
		panel1.add(sizetextfield);															//
		panel1.add(fontlist);																	//
		panel1.add(fontstylelist);															//
		panel1.add(sizelist);																	//	
		fonttextfield.addTextListener(this);											//
		fontstyletextfield.addTextListener(this);									//
		sizetextfield.addTextListener(this);											//
		fontlist.addItemListener(this);													//
		fontlist.addActionListener(this);												//
		fontstylelist.addItemListener(this);											//
		fontstylelist.addActionListener(this);										//
		sizelist.addItemListener(this);													//
		sizelist.addActionListener(this);												//
		
		panel2=new Panel();																	//
		panel2.setLayout(new GridLayout(1,2,10,10));						//
		ok=new Button("OK");																//
		cancel=new Button("Cancel");													//
		panel2.add(ok);																			//
		panel2.add(cancel);																	//
		ok.addActionListener(this);														//
		cancel.addActionListener(this);												//
		
		panel3 =new Panel();																//
		panel3.setLayout(new GridLayout(6,1,5,5));							//
		samplelabel=new Label("Sample : ");										//
		sampletextfield=new TextField("AaBbYyZz",20);					//
		scriptlabel=new Label("Script : ");											//
		scriptchoice=new Choice();														//
		panel3.add(panel1);																	//
		panel3.add(samplelabel);															//
		panel3.add(sampletextfield);													//
		panel3.add(scriptlabel);															//
		panel3.add(scriptchoice);															//
		panel3.add(panel2);																	//
		sampletextfield.addTextListener(this);									//
		scriptchoice.addItemListener(this);											//
		add(panel3);																				//
	}			

	public void textValueChanged(TextEvent te){}
	
	public void actionPerformed(ActionEvent ae)
	{
		dispose();
	}

	public void itemStateChanged(ItemEvent ie){}
} 

http://stackoverflow.com/questions/9800415/java-not-able-to-print-on-textarea-from-other-class
http://www.dreamincode.net/forums/topic/235151-how-to-set-text-area-from-another-class/
http://forums.codeguru.com/showthread.php?358045-how-to-access-the-text-area-of-a-different-class