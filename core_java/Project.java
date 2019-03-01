import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code= Project.class width=400 height=400>
</applet>
*/
public class Project extends Applet implements ActionListener
{ 
 int last_x=0,last_y=0;
 Label l;
 Color c=Color.black;
 Button btn_black,btn_magenta,btn_blue,btn_orange;
 Button btn_cyan,btn_pink,btn_darkGray,btn_red;
 Button btn_gray,btn_white,btn_green,btn_yellow;

  Button btn_green1,btn_yellow1;
 public void init()
 {
 l=new Label("Choose Color to draw Lines ");
 
 btn_black=new Button("Black");
 btn_magenta=new Button("Magenta");
 btn_blue=new Button("Blue");
 btn_orange=new Button("Orange");
 btn_cyan=new Button("Cyan");
 btn_pink=new Button("Pink");
 btn_darkGray=new Button("DarkGray");
 btn_red=new Button("Red");
 btn_gray=new Button("Gray");
 btn_white=new Button("White");
 btn_green=new Button("Green");
 btn_yellow=new Button("Yellow");

  btn_black.addActionListener(this);
 btn_magenta.addActionListener(this);
 btn_blue.addActionListener(this);
 btn_orange.addActionListener(this);
 btn_cyan.addActionListener(this);
 btn_pink.addActionListener(this);
 btn_darkGray.addActionListener(this);
 btn_red.addActionListener(this);
 btn_gray.addActionListener(this);
 btn_white.addActionListener(this);
 btn_green.addActionListener(this);
 btn_yellow.addActionListener(this);
 
 add(l);
 add(btn_black);
 add(btn_magenta);
 add(btn_blue);
 add(btn_orange);
 add(btn_cyan);
 add(btn_cyan);
 add(btn_pink);
 add(btn_darkGray);
 add(btn_red);
 add(btn_gray);
 add(btn_white);
 add(btn_yellow);
 add(btn_green);

        }

  public void actionPerformed(ActionEvent ae)
 {
 String m=ae.getActionCommand();
 if(m.equals("Magenta"))
 {
 c=Color.magenta;
 }
 if(m.equals("Blue"))
 {
 c=Color.blue;
 }
 if(m.equals("Black"))
 {
 c=Color.black;
 }
 if(m.equals("Orange"))
 {
 c=Color.orange;
 }
 if(m.equals("Cyan"))
 {
 c=Color.cyan ;
 }
 if(m.equals("Pink"))
 {
 c=Color.pink;
 }
 if(m.equals("DarkGray"))
 {
 c=Color.darkGray;
 }
 if(m.equals("Red"))
 {
 c=Color.red;
 }
 if(m.equals("Gray"))
 {
 c=Color.gray;
 }
 if(m.equals("White"))
 {
 c=Color.white;
 }
 if(m.equals("Green"))
 {
 c=Color.green;
 }
 if(m.equals("Yellow"))
 {
 c=Color.yellow;
 }
 if(m.equals("LightGray"))
 {
 c=Color.lightGray;
 }
 }

  public boolean mouseDown(Event e,int x,int y)
 {
 last_x=x;
 last_y=y;
 return true;
 }

  public boolean mouseDrag(Event e,int x,int y)
 {
 Graphics g=getGraphics();
 g.setColor(c);
 g.drawLine(last_x,last_y,x,y);
 last_x=x;
 last_y=y;
 return true;
 }
 
} 


