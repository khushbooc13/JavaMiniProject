    import java.awt.*;  
    import java.applet.*;  
	/*
	<applet code="AnimationExample" width=500 height=500>
	</applet>
	*/
    public class AnimationExample extends Applet {  
      
      Image picture;  
      
      public void init() {  
        picture =getImage(getDocumentBase(),"Untitled.png");  
      }  
        
      public void paint(Graphics g) {  
        for(int i=0;i<500;i++){  
          g.drawImage(picture, i,30, this);  
      
          try{Thread.sleep(100);}catch(Exception e){}  
        }  
      }  
    }  