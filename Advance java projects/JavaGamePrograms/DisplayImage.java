    import java.awt.*;  
    import java.applet.*;  
      
/*
<applet code="DisplayImage" width=500 height=500>
</applet>
*/
      
    public class DisplayImage extends Applet {  
      
      Image picture;  
      
      public void init() {  
        picture = getImage(getDocumentBase(),"sonoo.jpg");  
      }  
        
      public void paint(Graphics g) {  
        g.drawImage(picture, 30,30, this);  
      }  
          
      }     