//MouseEventDemo1.java
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
	<applet code=MouseEventDemo1 width=500 height=300>
	</applet>
*/

public class MouseEventDemo1 extends Applet implements MouseListener,MouseMotionListener
{
	String m;
	int xa,ya;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(m,xa,ya);
	}
	public void mouseEntered(MouseEvent me)
	{
		showStatus("Mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		showStatus("Mouse Exited");
	}
	public void mousePressed(MouseEvent me)
	{
		m="Mouse Pressed";
		xa=me.getX();
		ya=me.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		m="Mouse Released";
		xa=me.getX();
		ya=me.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		m="Mouse Clicked";
		xa=me.getX();
		ya=me.getY();
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		m="Mouse Moved";
		xa=me.getX();
		ya=me.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		m="Mouse Dragged";
		xa=me.getX();
		ya=me.getY();
		repaint();
	}
}