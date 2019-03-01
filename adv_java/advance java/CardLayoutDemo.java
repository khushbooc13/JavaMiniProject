import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="CardLayoutDemo" width=300 height=300>
</applet>
*/

public class CardLayoutDemo extends Applet implements ActionListener , MouseListener
{
	Checkbox Win98,winNT,solaris,mac;
	Panel osCards;
	CardLayout cardLO;
	Button Win,Other;

	public void init()
	{
		Win=new Button("Windows");
		Other=new Button("Other");
		add(Win);
		add(Other);
		cardLO=new CardLayout();
		osCards=new Panel();
		osCards.setLayout(cardLO);  // set panel layout to card layout
		Win98=new Checkbox("Windows 98/XP",null,true);
		winNT=new Checkbox("Windows NT/2000");
		solaris=new Checkbox("Solaris");
		mac=new Checkbox("Mac OS");
		Panel winPan=new Panel();
		winPan.add(Win98);
		winPan.add(winNT);
		//add other check boxes to a panel
		Panel otherPan=new Panel();
		otherPan.add(solaris);
		otherPan.add(mac);
		//add panels to card deck panel
		osCards.add(winPan,"Windows");
		osCards.add(otherPan,"Other");
		//add cards to main applet panel
		add(osCards);
		//register to receive action events
		Win.addActionListener(this);
		//register mouse events
		addMouseListener(this);
	}

	//Cycle through panels
	public void mousePressed(MouseEvent me)
	{
		cardLO.next(osCards);
	}

	//provide empty implementations for the other MouseListener methods
	public void mouseClicked(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Win)
		{
			cardLO.show(osCards,"Windows");
		}
		else 
		{
			cardLO.show(osCards,"other");
		}
	}

}