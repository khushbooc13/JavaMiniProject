import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad1 extends Frame implements ActionListener,TextListener
{
			TextArea textArea=new TextArea();
			String name,path,n,str1;
			FileDialog fd;
			Frame f=new Frame();
			// Set up the menu on the default controls
			Menu file,edit,format,view,help;   //creating menu for help

			//Creating the menuitems for file
			MenuItem new1, open, save,saveas, pagesetup, print,exit;
		

			//Creating the menuitems for edit
			MenuItem undo,cut,copy,paste,delete,find,findnext,replace,goto1,selectall,timedate;
				

			//creating the menuitems for format
			MenuItem wordwrap,font;
			
			//creating the menuitems for view
			MenuItem statusbar;
			
			//Creating the menuitems for help
			MenuItem about;



								Notepad1()
								{
									super("Text Editor");
									setLayout(new BorderLayout());
									addWindowListener(new NotepadAdapter());
									add("Center",textArea);

									 file=new Menu("File");   // creating menu  File
									 edit=new Menu("Edit");//creating menu edit
									 format=new Menu("Format");//creating menu format
									 view=new Menu("View");  //creating menu for view
									 help=new Menu("Help");   //creating menu for help

									//Creating the menu items for file
									 new1=new MenuItem("New");
									 open=new MenuItem("Open...");
									 save=new MenuItem("Save");
									 saveas=new MenuItem("Save As...");
									 pagesetup=new MenuItem("Page Setup...");
									 print=new MenuItem("Print...");
									 exit=new MenuItem("Exit");
									 fd=new FileDialog(f,"Save As",FileDialog.SAVE);
								

									//Creating the menu items for edit
									 undo=new MenuItem("Undo");
									 cut=new MenuItem("Cut");
									 copy=new MenuItem("Copy");
									 paste=new MenuItem("Paste");
									 delete=new MenuItem("Delete");
									 find=new MenuItem("Find...");
									 findnext=new MenuItem("Find Next");
									 replace=new MenuItem("Replace...");
									 goto1=new MenuItem("Go To...");
									 selectall=new MenuItem("Select All");
									 timedate=new MenuItem("Time/Date");
										

									//creating the menu items for format
									 wordwrap=new MenuItem("Word Wrap");
									 font=new MenuItem("Font...");
									
									//creating the menu items for view
									 statusbar=new MenuItem("Status Bar");
									
									//Creating the menu items for help
									 about=new MenuItem("About");

										//adding menu items in the menu i.e file
										file.add(new1);
										file.add(open);
										file.add(save);
										file.add(saveas);
										file.addSeparator();
										file.add(pagesetup);
										file.add(print);
										file.addSeparator();
										file.add(exit);
										
										//adding menu items in the menu i.e edit
										edit.add(undo);
										edit.addSeparator();
										edit.add(cut);
										edit.add(copy);
										edit.add(paste);
										edit.add(delete);
										edit.addSeparator();
										edit.add(find);
										edit.add(findnext);
										edit.add(replace);
										edit.add(goto1);
										edit.addSeparator();
										edit.add(selectall);
										edit.add(timedate);
										
										//adding menu items in the menu i.e Format
										format.add(wordwrap);
										format.add(font);
										//adding menu items in the menu i.e View
										view.add(statusbar);
										//adding menu items in the menu i.e Help
										help.add(about);

										MenuBar menuBar=new MenuBar();
										menuBar.add(file);
										menuBar.add(edit);
										menuBar.add(format);
										menuBar.add(view);
										menuBar.add(help);
										setMenuBar(menuBar);


													
										//adding the listener to the menu item file
										 new1.addActionListener(this);
										 open.addActionListener(this);
										 save.addActionListener(this);
										 saveas.addActionListener(this);
										 pagesetup.addActionListener(this);
										 print.addActionListener(this);
										 exit.addActionListener(this);

										//adding the listener to the menu item edit
										undo.addActionListener(this);
										cut.addActionListener(this);
										copy.addActionListener(this);
										paste.addActionListener(this);
										delete.addActionListener(this);
										find.addActionListener(this);
										findnext.addActionListener(this);
										replace.addActionListener(this);
										goto1.addActionListener(this);
										selectall.addActionListener(this);
										timedate.addActionListener(this);
										
										//adding the listener to the menu item format
										wordwrap.addActionListener(this);
										font.addActionListener(this);

										//adding the listener to the menu item view
										 statusbar.addActionListener(this);

										//adding the listener to the menu item help
										  about.addActionListener(this);
										
										//adding listener to the text area
										textArea.addTextListener(this);
									}//Constructor closed


					public  void textValueChanged(TextEvent te)
					{
						str1=textArea.getText();
					}

				public void actionPerformed(ActionEvent ae)
				{
								String str=ae.getActionCommand();
								System.out.print(str);
								if(str.equalsIgnoreCase("Exit"))
								{
									System.exit(0);
								}
								else if(str.equalsIgnoreCase("New"))
								{
									if(str1!=null)
									{
									newFile();
									}
								}
								else if(str.equalsIgnoreCase("Open..."))
								{
									openFile();
								}
								else if(str.equalsIgnoreCase("Save"))
								{
									saveFile();
								}
								
				}
				
				void newFile()
					{
						textArea.setText("");
						open.setEnabled(true);
						save.setEnabled(true);
						saveas.setEnabled(true);
						pagesetup.setEnabled(true);
						exit.setEnabled(true);
					}

				void openFile()
				{
							fd=new FileDialog(f,"Open",FileDialog.LOAD);
							fd.setVisible(true);
							name=fd.getFile();
							path=fd.getDirectory();
							n=path+name+"";
							File fl=new File(path,name);
							try
							{
									FileInputStream fis=new FileInputStream(fl);
									int ch;
									textArea.setText("");
									while((ch=fis.read())!=-1)
									{
										textArea.appendText((char)ch+"");
									}
									save.setEnabled(true);
									fis.close();
									f.setTitle(fd.getFile()+"-Notepad");
							}catch (Exception ex){}
				 }

				  void saveFile()
					{
							fd=new FileDialog(f,"Save",FileDialog.SAVE);
							if(str1!=null)
						{
							try
							{
								fd.setVisible(true);
								name=fd.getFile();
								path=fd.getDirectory();
								String strr=textArea.getText();
								File f1=new File(path,name);
								FileOutputStream fos=new FileOutputStream(f1);
								char arr[];
								arr=strr.toCharArray();
								for(int i=0;i<arr.length;i++)
								{
									fos.write(arr[i]);
								}
								fos.close();
							}catch (Exception ex){}
						}		
					}



				public static void main(String args[])
				{
					Notepad1 n=new Notepad1();
					n.setVisible(true);
					n.setSize(1300,700);
				}

}//class closed

			class NotepadAdapter extends WindowAdapter
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			}