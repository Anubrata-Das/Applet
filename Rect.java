import java.net.*;
import java.awt.*;
import java.applet.*;

/*<applet code = Rect width=800 height =700>
</applet>
*/

public class Rect extends Applet{
	public void paint(Graphics g){
		g.drawRect(40,70,180,100);
		g.fillRect(280,30,100,180);
	}
}	