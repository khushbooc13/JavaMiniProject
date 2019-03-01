import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//import java.util.*;

/*<applet code="Pencil" width=400 height=400>
</applet>*/

			public class Pencil extends Applet implements MouseListener,MouseMotionListener
			{
				Point prevpoint,point;
		
				public void init()
				{
					addMouseListener(this);
					addMouseMotionListener(this);
				}
				public void mouseClicked(MouseEvent me){}
				public void mouseEntered(MouseEvent me){}
				public void mouseExited(MouseEvent me){}
				public void mouseMoved(MouseEvent me){}

				public void mousePressed(MouseEvent me)
					{
							prevpoint=me.getPoint();//when pressed
							point=me.getPoint();		
							repaint(); 
							
					}
				public void mouseReleased(MouseEvent me){}

				public void mouseDragged(MouseEvent me)
				{
								
					prevpoint=point; 
					point=me.getPoint();
					repaint();
				}


				public void update(Graphics g)
				{
					g.drawLine(prevpoint.x,prevpoint.y,point.x,point.y);
				}
			}