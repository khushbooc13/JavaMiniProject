import java.awt.*;
import java.applet.*;
public class compdemo extends Applet
{
	//Declaring AWT Components
	TextField txtField;
	TextArea txtArea;
	Button bttn;
	Label name;
	Label about;
	//Applet's init() method
	public void init()
	{
		//Creating AWT components
		txtField=new TextField();
		txtArea=new TextArea();
		bttn=new Button("Submit");
		name=new Label("Name please:");
		about=new Label("about Yourself");
		//Adding AWT components to the applet
		add(name);
		add(txtField);
		add(about);
		add(txtArea);
		add(bttn);
	}
}

/*
<applet code="compdemo.class" height=100 width=200>
</applet>
*/