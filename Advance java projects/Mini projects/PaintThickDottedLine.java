import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Paint.class" width=500 height=500>
</applet>
*/
 
public class PaintThickDottedLine extends Applet
implements MouseMotionListener {
 
int width, height;
Image backbuffer;
Graphics backg;
 
public void init() {
width = getSize().width;
height = getSize().height;
 
backbuffer = createImage( width, height );
backg = backbuffer.getGraphics();
backg.setColor( Color.white );
backg.fillRect( 0, 0, width, height );
backg.setColor( Color.red );
 
backbuffer = createImage( width, height );
backg = backbuffer.getGraphics();
backg.setColor( Color.white );
backg.fillRect( 0, 0, width, height );
backg.setColor( Color.blue );
 
addMouseMotionListener( this );
}
public void mouseMoved( MouseEvent e ) { }
public void mouseDragged( MouseEvent e ) {
int x = e.getX();
int y = e.getY();
backg.fillOval(x-10,y-10,20,20);
repaint();
e.consume();
}
 
public void update( Graphics g ) {
g.drawImage( backbuffer, 0, 0, this );
}
public void paint( Graphics g ) {
update( g );
}
}