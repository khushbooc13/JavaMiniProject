import java.awt.*;
	import java.awt.Color;
	import java.lang.Math;
	import java.awt.event.*;
	import java.awt.Graphics;
	import java.applet.Applet;

	/*<applet code="draw" width=500 height=500>
</applet>
*/

 
	public class draw extends Applet implements ActionListener, MouseListener,
MouseMotionListener {
	 
	Button bDraw, bLine, bOval, bRect, bRounded,bSelect1,bSelect2,bSelect3,bSelect4,bHeading;
	Point dot[] = new Point[1000];
	Point start, end;
	int dots = 0;
	boolean mouseUp = false;
	boolean draw = false;
boolean line = false;
	boolean oval = false;
	boolean rectangle = false;
	boolean rounded = false;
	Font font;
	 
	public void init()
	{
	 
setLayout(null);
	font= new Font("Monospaced", Font.BOLD, 24);
	bHeading = new Button("MY PAINT APPLICATION");
	bHeading.setSize(500,40);
	bHeading.setLocation(0,0);
	bHeading.setFont(font);
	bHeading.setForeground(Color.white.brighter());
	bHeading.setBackground(Color.blue.brighter());
 
	setLayout(null);
	bLine = new Button("Line");
	bLine.setSize(100,30);
	bLine.setLocation(0,40);
	bLine.setForeground(Color.blue.brighter());
	bLine.setFont(new Font("Arial", Font.BOLD, 16));
	 
	bOval = new Button("Circle");
	bOval.setSize(100,30);
	bOval.setLocation(100,40);
	bOval.setForeground(Color.green.brighter());
	bOval.setFont(new Font("Arial", Font.BOLD, 16));
	 
	bRect = new Button("Rectangles");
	bRect.setSize(100,30);
	bRect.setLocation(200,40);
	bRect.setForeground(Color.red.brighter());
	bRect.setFont(new Font("Arial", Font.BOLD, 16));
	 
	bRounded = new Button("Ellipse");
	bRounded .setSize(100,30);
	bRounded .setLocation(300,40);
	bRounded.setForeground(Color.blue.brighter());
	bRounded.setFont(new Font("Arial", Font.BOLD, 16));
 
	bDraw = new Button("Free Draw");
	bDraw.setSize(100,30);
	bDraw.setLocation(400,40);
	bDraw.setForeground(Color.yellow.brighter());
	bDraw.setFont(new Font("Arial", Font.BOLD, 16));
	 
	setLayout(null);
	bSelect1 = new Button("Red");
	bSelect1.setSize(100,30);
	bSelect1.setLocation(0,80);
	bSelect1.setForeground(Color.white.brighter());
	bSelect1.setBackground(Color.RED.brighter());
	bSelect1.setFont(new Font("Arial", Font.BOLD, 16));

	bSelect2 = new Button("Green");
	bSelect2.setSize(100,30);
	bSelect2.setLocation(100,80);
	bSelect2.setForeground(Color.white.brighter());
	bSelect2.setBackground(Color.green.brighter());
	bSelect2.setFont(new Font("Arial", Font.BOLD, 16));
	 
	setLayout(null);
	bSelect3 = new Button("Blue");
	bSelect3.setSize(100,30);
	bSelect3.setLocation(200,80);
	bSelect3.setForeground(Color.white.brighter());
bSelect3.setBackground(Color.BLUE.brighter());
	bSelect3.setFont(new Font("Arial", Font.BOLD, 16));
	 
	bSelect4 = new Button("Yellow");
	bSelect4.setSize(100,30);
	bSelect4.setLocation(300,80);
	bSelect4.setForeground(Color.white.brighter());
	bSelect4.setBackground(Color.YELLOW.brighter());
	bSelect4.setFont(new Font("Arial", Font.BOLD, 16));
	 
	add(bLine);
	add(bOval);
	add(bRect);
	add(bRounded);
	add(bDraw);
	add(bSelect1);
	add(bSelect2);
	add(bSelect3);
	add(bSelect4);
	add(bHeading);
	 
	bLine.addActionListener(this);
	bOval.addActionListener(this);
	bRect.addActionListener(this);
	bRounded.addActionListener(this);
	bDraw.addActionListener(this);
	addMouseListener(this);
	bSelect1.addActionListener(this);
	bSelect2.addActionListener(this);
	bSelect3.addActionListener(this);
	bSelect4.addActionListener(this);
addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent e)
	{
	mouseUp = false;
	start = new Point(e.getX(), e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
	if(line){
	end = new Point(e.getX(), e.getY());
} else {
	end = new Point(Math.max(e.getX(), start.x),
	Math.max(e.getY(), start.y));
	start = new Point(Math.min(e.getX(), start.x),
	Math.min(e.getY(), start.y));
	}
	mouseUp = true;
	repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
	if(draw){
	dot[dots] = new Point(e.getX(), e.getY());
	dots++;
	repaint();
	}
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
	public void paint (Graphics g)
	{
	if (mouseUp) {
	int width = end.x - start.x;
	int height = end.y - start.y;
	if(line){
	g.drawLine(start.x, start.y, end.x, end.y);
	}
	else if(oval){
	g.drawOval(start.x, start.y, width, height);
	}
 	else if(rectangle){
g.drawRect(start.x, start.y, width, height);
	}
	else if(rounded){
	g.drawRoundRect(start.x, start.y, width, height, 10, 10);
	}
	else if(draw){
	for(int loop_index = 0; loop_index < dots - 1;
	loop_index++){
	g.drawLine(dot[loop_index].x, dot[loop_index].y,
	dot[loop_index + 1].x, dot[loop_index + 1].y);
	}
	}
	}
	}
	public void actionPerformed(ActionEvent e)
	{
	setFlagsFalse();
	if(e.getSource() == bDraw)draw = true;
	if(e.getSource() == bLine)line = true;
	if(e.getSource() == bOval)oval = true;
	if(e.getSource() == bRect)rectangle = true;
	if(e.getSource() == bRounded)rounded = true;
	if(e.getSource() == bSelect1)
{
	     
	}
	}
 
	void setFlagsFalse()
	{
	rounded = false;
	line = false;
	oval = false;
	rectangle = false;
draw = false;
	}
}