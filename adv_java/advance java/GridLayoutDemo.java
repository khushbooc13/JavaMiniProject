import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="GridLayoutDemo" width=300 height=300>
</applet>
*/

public class GridLayoutDemo extends Applet 
{
	static final int n=3;
	public void init()
	{
		setLayout(new GridLayout(n,n,5,5));
		for(int i=0;i<n;i++)
		{
			for(int y=0;y<n;y++)
			{
				int k=i*n+y;
				if(k>=0)
				{
					add(new Button(""+k));
				}
			}
		}
	}
}