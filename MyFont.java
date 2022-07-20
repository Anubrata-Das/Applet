import java.applet.*;
import java.awt.*;
/*
  <applet code=MyFont width=400 height=300>
  </applet>
*/
public class MyFont extends Applet{
    String s;
    int x,y;
    Font ft;
    public void init(){
        s="Welcome to Applet";
        ft=new Font("Arial",Font.BOLD,20);
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    public void paint(Graphics g){
        Dimension d = getSize();
        x=d.width;
        y=d.height;
        g.setFont(ft);
        g.drawString(s,x/2,y/2);
    }
}