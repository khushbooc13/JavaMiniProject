 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;

 /*
 <applet code="ListDemo" width=300 height=300>
 </applet>
 */

 public class ListDemo extends Applet implements ActionListener, ItemListener
 {
	 String msg="";
	List l1;

	 public void init()
	 {
		 l1=new List(4,true);
		 l1.add("Advance java");
		 l1.add("AWT");
		 l1.add("Software Testing");
		 l1.add("Operating System");
		 l1.add("Java");
		 l1.add("Computer Security");
		 l1.add("Software Engineering");
		 add(l1);
		 l1.addActionListener(this);
		 l1.addItemListener(this);
	 }

	 public void actionPerformed(ActionEvent ie)
	 {
		 repaint();
	 }

	 public void itemStateChanged(ItemEvent ie)
	 {
		 repaint();
	 }

	 public void paint(Graphics g)
	 {
		 int idx[];
		 msg="The selected subjects are  ";
		 idx=l1.getSelectedIndexes();
		 for(int i=0;i<idx.length;i++)
		 {
			 msg+=l1.getItem(idx[i])+"   ";
		 }
		 g.drawString(msg,6,100);
	 }
}