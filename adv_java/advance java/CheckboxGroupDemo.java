 import java.awt.*;
 import java.awt.event.*;
 import java.applet.*;

 /*
 <applet code="CheckboxGroupDemo" width=300 height=300>
 </applet>
 */

 public class CheckboxGroupDemo extends Applet implements ItemListener
 {
	 String msg="";
	 Checkbox chk1,chk2,chk3,chk4;
	 CheckboxGroup cbg;

	 public void init()
	 {
		 cbg=new CheckboxGroup();
		chk1=new Checkbox("Windows XP",cbg,true);
		chk2=new Checkbox("Linux",cbg,true);
		chk3=new Checkbox("Windows Vista",cbg,true);
		add(chk1);
		add(chk2);
		add(chk3);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
	 }

	 public void itemStateChanged(ItemEvent ie)
	 {
		 repaint();
	 }

	 public void paint(Graphics g)
	 {
		 msg="Current Selection: ";
		 chk4=cbg.getSelectedCheckbox();
		 msg+=chk4.getLabel();
		 g.drawString(msg,6,100);
	 }
 }