import java.applet.Applet;
import java.awt.*;

public class MyApp extends Applet{
    String m="";
    public void init(){
        setBackground(Color.pink);
    }
    public void start(){
        m="Hello";
    }
    public void paint(Graphics g){
        g.drawString(m,50,40);
    }
    public void destroy(){}
}
