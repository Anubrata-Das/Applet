import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code=MouseEventDemo2 width=400 height=300>
  </applet>
*/
public class MouseEventDemo2 extends Applet implements MouseMotionListener
{
  	int xa[]=new int[1000];
	int ya[]=new int[1000];
	int i=0;
	
	public void init()
	{
		addMouseMotionListener(this);
		setBackground(Color.black);
	}
    public void paint(Graphics g)
	{
		
       for(int j=0;j<i;j++)
       { 
		   Color c = new Color((j*50000)+100000);
		   g.setColor(c);
		   g.fillOval(xa[j],ya[j],50,50);
	   }
    }
	
	public void mouseMoved(MouseEvent me)
	{
		showStatus(me.getX()+","+me.getY());
	}
    public void mouseDragged(MouseEvent me)
    {
		xa[i]=me.getX();
		ya[i]=me.getY();
		i++;
		repaint();
	}
}			 