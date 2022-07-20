//Inner class
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
	<applet code = InnerDemo width=400 height=300></applet>
`*/

public class InnerDemo extends Applet
{
		public void init()
		{
			addMouseListener(new MouseAdapterDemo());
		}
		class MouseAdapterDemo extends MouseAdapter
		{
				public void mousePressed(MouseEvent me)
				{
					showStatus("Mouse Pressed");
				}
		}		
}
