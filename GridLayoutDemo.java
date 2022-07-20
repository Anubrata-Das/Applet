//Grid Layout
import java.awt.*;
import java.awt.event.*;
class MyWindow extends Frame
{
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	//TextField txt;
	
	public MyWindow()
	{
		super("My Window");
		addWindowListener(new WindowAdapter()
							{
								public void windowClosing(WindowEvent we)
								{
									System.exit(0);
								}
							}
						);
		setSize(400,300);	
		setBackground(Color.yellow);
		
		//txt=new TextField(30);
		btn1=new Button("Button 1");
		btn2=new Button("Button 2");
		btn3=new Button("Button 3");
		btn4=new Button("Button 4");
		btn5=new Button("Button 5");
		btn6=new Button("Button 6");
		btn7=new Button("Button 7");
		btn8=new Button("Button 8");
		btn9=new Button("Button 9");
		
		
		setLayout(new GridLayout(3,4,15,10));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		
		setVisible(true);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		new MyWindow();
	}
}