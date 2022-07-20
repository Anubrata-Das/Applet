import java.net.*;
import java.awt.*;
import java.applet.*;

/*
<applet code = MyApp3 width = 400 height = 300>
</applet>
*/
public class MyApp3 extends Applet{
	public void paint(Graphics g){
		URL ob = getCodeBase();
		g.drawString(String.valueOf(ob),50,40);
		ob = getDocumentBase();
		g.drawString(String.valueOf(ob),50,60);
	}
}	