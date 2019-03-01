import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  

/*
    <applet code="DigitalClock" width=310 height=300>
    </applet>
*/

public class DigitalClock extends Applet implements Runnable {  
  
   Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";
   String str="";
  
   public void init() {  
      //setBackground( Color.green);  
   }  
  
   public void start() {  
        t = new Thread( this );  
        t.start();  
   }  
  
    
   public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 )
            {
	hours -= 12;
	str="pm";
            }
            else
	str="am";
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );    
            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
    
  public void paint( Graphics g ) {
      showStatus("Digital Clock");
      Font f1=new Font("Arial",Font.BOLD,28);
      g.setFont(f1);
      g.setColor( Color.blue );  
      g.drawString( timeString+str, 78, 140 );  
   }  
}  