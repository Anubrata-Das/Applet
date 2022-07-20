//Adapter class
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
	<applet code = AdapterDemo width=400 height=300></applet>
`*/

public class AdapterDemo extends Applet
{
		public void init()
		{
			addMouseListener(new MouseAdapterDemo(this));
		}
}
class MouseAdapterDemo extends MouseAdapter
{
		AdapterDemo ob;
		public MouseAdapterDemo(AdapterDemo ob)
		{
			this.ob=ob;
		}
		public void mousePressed(MouseEvent me)
		{
			ob.showStatus("Mouse pressed");
		}
}		