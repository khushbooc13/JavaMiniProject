import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*<applet code="SimpleDrawApplet" width=500 height=500>
</applet>
*/

public class SimpleDrawApplet extends Applet implements ItemListener
	{

				static final Color[] colorList = 
			{
				  // List of available colors; having this in an array makes
			  Color.black, Color.gray, Color.red, Color.green, Color.blue,
			  new Color(200,0,0), new Color(0,180,0), new Color(0,0,180),
			  Color.cyan, Color.magenta, Color.yellow, new Color(100,90,20)
		   };

			   Choice colorChoice; // A menu of available colors.

			   SimpleDrawCanvas canvas;  // This is where the drawing is actually done.
										 // This applet displayes this canvas with some
										 // controls below it.

			 public void init()
			{
				// Create components and lay out the applet

				  canvas = new SimpleDrawCanvas();

				  Panel bottom = new Panel();
				  Button b1 = new Button("Clear");
				  b1.addActionListener(canvas);    // Note that canvas will handle button events.
				  bottom.add(b1);
				  Button b2 = new Button("Undo");
				  b2.addActionListener(canvas);
				  bottom.add(b2);

				  colorChoice = new Choice();
				  colorChoice.add("Black");
				  colorChoice.add("Gray");
				  colorChoice.add("Red");
				  colorChoice.add("Green");
				  colorChoice.add("Blue");
				  colorChoice.add("Dark Red");
				  colorChoice.add("Dark Green");
				  colorChoice.add("Dark Blue");
				  colorChoice.add("Cyan");
				  colorChoice.add("Magenta");
				  colorChoice.add("Yellow");
				  colorChoice.add("Brown");
				  colorChoice.addItemListener(this);
				  bottom.add(colorChoice);

				  setBackground(Color.lightGray);
				  setLayout(new BorderLayout(3,3));
				  add("Center",canvas);
				  add("South",bottom);

			   } // end init()

	   public Insets getInsets()
	 {
			 // Say how much of a border to leave around the edges of the applet.
		  return new Insets(3,3,3,3);
	   }

	   public void itemStateChanged(ItemEvent evt)
		{
			 // This is called when the user selects an item from the colorChoice
			 // menu.  The index of the selected item specifies the color to use
			 // for drawing.  The canvas is notified of the new drawing color
			 // by calling its setDrawing Color method.
		  int colorIndex = colorChoice.getSelectedIndex();
		  canvas.setDrawingColor(colorList[colorIndex]);
	   }

} // end class SimpleDrawApplet



			class Line 
			{ 
				// an object of this class represents a colored line segment
			   int x1, y1;   // One endpoint of the line segment.
			   int x2, y2;   // The other endpoint of the line segment.
			   Color color;  // The color of the line segment.
			}



  class SimpleDrawCanvas extends Canvas implements ActionListener, MouseListener 
	{
       // A canvas where the use can draw lines in various colors.

   Color currentColor;  // Color that is currently being used for drawing new lines.

	  SimpleDrawCanvas()
		{
				 // Construct the canvas, and set it to listen for mouse events.
			  setBackground(Color.white);
			  currentColor = Color.black;
			  addMouseListener(this);
	   }

   void setDrawingColor(Color c) 
	   { 
         // Set current color to c.
			currentColor = c;
	   }

		 void doClear() 
		{
			// Clear all the lines from the picture.
			repaint();
		}

	void doUndo()
		 { 
				// Remove most recently added line from the picture.
		}

	 public void actionPerformed(ActionEvent evt)
	   {
        // A button has been clicked; do the appropriate command.
      String command = evt.getActionCommand();
      if (command.equals("Clear"))
          doClear();
      else if (command.equals("Undo"))
          doUndo();
		}

		int startX, startY;  // When the user presses the mouse button, the
								    // location of the mouse is stored in these variables.
									// This information is needed when the mouse button
									// is released.

		 public void mousePressed(MouseEvent evt)
			{
				 // This is called by the system when the user presses the mouse button.
				 // Record the location at which the mouse was pressed.  This location
				 // is one endpoint of the line that will be drawn when the mouse is
				 // released.  This method is part of the MouseLister interface.
				  startX = evt.getX();
				  startY = evt.getY();
			}

	   public void mouseReleased(MouseEvent evt)
		{
					 // This is called by the system when the user releases the mouse button.
					 // Draw a line in the current color.  The line starts at the point
					 // (startX, startY), which is where the mouse button was pressed, and
					 // it ends at the point where the mouse release occurs.  This method
					 // is part of the MouseListener interface.

				  int endX = evt.getX();  // Where the mouse was released.
				  int endY = evt.getY();

				  Graphics g = getGraphics();  // Get a graphics context for drawing on the canvas.

				  g.setColor(currentColor);  // Draw the line in the current drawing color.
				  g.drawLine(startX, startY, endX, endY);

				  g.dispose();  // To be nice to the operating system, free the graphics context.

		   } // end mouseReleased

		   public void mouseClicked(MouseEvent evt) { }  // Other methods in the MouseListener interface
		   public void mouseEntered(MouseEvent evt) { }
		   public void mouseExited(MouseEvent evt) { }

} // end class SimpleDrawCanvas