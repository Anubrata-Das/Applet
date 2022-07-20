//Anonymous Inner class
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
	<applet code = AIC width=400 height=300></applet>
`*/

public class AIC extends Applet
{
		public void init()
		{
			addMouseListener(new MouseAdapter()
								{
										public void mousePressed(MouseEvent me)
										{
											showStatus("Mouse Pressed");
										}
								}
							);
		}
}
