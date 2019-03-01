/*Determining a Platform's Capabilities
Not all platforms support all of these capabilities. An UnsupportedOperationException exception is thrown 
when code attempts to invoke the setShape or setOpacity methods on a platform that does not support these capabilities.
Therefore, it is best practice to first check that the platform supports the capability that you want to implement. 
The GraphicsDevice class provides the 
isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency) method that you can use for this purpose.
You pass one of three enum values, defined in GraphicsDevice.WindowTranslucency, to this method:

    TRANSLUCENT – The underlying platform supports windows with uniform translucency, 
	where each pixel has the same alpha value.
    PERPIXEL_TRANSLUCENT – The underlying platform supports windows with per-pixel translucency. 
	This capability is required to implement windows that fade away.
    PERPIXEL_TRANSPARENT – The underlying platform supports shaped windows.

The GraphicsConfiguration class also provides the isTranslucencyCapable method to determine 
if PERPIXEL_TRANSLUCENT translucency is supported by the given GraphicsConfiguration object.
Version note: The translucent and shaped window API was first added to 
the Java SE 6 Update 10 release as a private API. 
This functionality was moved to the public AWT package in the JDK 7 release.
This tutorial describes the API that is available in the JDK 7 release. 
See Java SE 6 Update 10 API for a mapping of the private API in the Java SE 6 Update 10 release to the public
API in the JDK 7 release. 

 Determine what the default GraphicsDevice can support.

GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment();
GraphicsDevice gd = ge.getDefaultScreenDevice();

boolean isUniformTranslucencySupported = gd.isWindowTranslucencySupported(TRANSLUCENT);

boolean isPerPixelTranslucencySupported =gd.isWindowTranslucencySupported(PERPIXEL_TRANSLUCENT);

boolean isShapedWindowSupported =gd.isWindowTranslucencySupported(PERPIXEL_TRANSPARENT);

Note: None of these capabilities work on windows in full-screen mode.
Invoking any of the relevant methods while in full-screen mode causes an IllegalComponentStateException 
exception to be thrown.
How to Implement Uniform Translucency
You can create a window where each pixel has the same translucency by invoking the
setOpacity(float) method in the Window class. 
The float argument passed to this method represents the translucency of the window and 
should be a value between 0 and 1, inclusive. 
The smaller the number, the more transparent the window. 
There is also a corresponding getOpacity method.

The TranslucentWindowDemo.java example creates a window that is 55 percent opaque (45 percent translucent). 
If the underlying platform does not support translucent windows, the example exits.
The code relating to opacity is shown in bold.
*/

import java.awt.*;
import javax.swing.*;
import static java.awt.GraphicsDevice.WindowTranslucency.*;

public class TranslucentWindowDemo extends JFrame 
{
    public TranslucentWindowDemo() 
			{
				super("TranslucentWindow");
				setLayout(new GridBagLayout());

				setSize(300,200);
				setLocationRelativeTo(null);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				//Add a sample button.
				add(new JButton("I am a Button"));
			}

		 public static void main(String[] args) 
					{
						// Determine if the GraphicsDevice supports translucency.
							GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment();
							GraphicsDevice gd = ge.getDefaultScreenDevice();

							//If translucent windows aren't supported, exit.
							if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) 
							{
								System.err.println("Translucency is not supported");
								System.exit(0);
							}
						
								JFrame.setDefaultLookAndFeelDecorated(true);

								// Create the GUI on the event-dispatching thread
									 SwingUtilities.invokeLater(new Runnable()
									{
									  public void run() 
										 {
											 TranslucentWindowDemo tw = new TranslucentWindowDemo();

											// Set the window to 55% opaque (45% translucent).
											tw.setOpacity(0.60f);

											// Display the window.
											tw.setVisible(true);
										}
									 });

                  }// static void main is closed
    }// class closed
