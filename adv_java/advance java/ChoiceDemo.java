 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;

 /*
 <applet code="ChoiceDemo" width=300 height=300>
 </applet>
 */

 public class ChoiceDemo extends Applet implements ItemListener
 {
	 Choice ch;
	 String msg="";

	 public void init()
	 {
		 ch=new Choice();
		 ch.add("Advance java");
		 ch.add("Software testing");
		 ch.add("OMD");
		 ch.add("Advance MUP");
		 add(ch);
		 ch.addItemListener(this);
	 }

	 public void itemStateChanged(ItemEvent ie)
	 {
		 repaint();
	 }

	 public void paint(Graphics g)
	 {
		 msg="Current Selection : ";
		 msg+=ch.getSelectedItem();
		 g.drawString(msg,6,100);
	 }
 }