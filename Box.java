import java.net.*;
import java.awt.*;
import java.applet.*;

/*<applet code = Box width=400 height =300>
</applet>
*/

public class Box extends Applet{
	public void paint(Graphics g){
		g.drawRect(100,100,200,100);
		g.drawRect(150,150,200,100);
		g.drawLine(100,100,150,150);
		g.drawLine(300,100,350,150);
		g.drawLine(100,200,150,250);
		g.drawLine(300,200,350,250);
	}
}	