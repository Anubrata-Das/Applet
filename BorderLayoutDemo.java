//Border Layout
import java.awt.*;
import java.awt.event.*;
class MyWindow extends Frame
{
	Button btnN;
	Button btnW;
	Button btnS;
	Button btnE;
	TextField txt;
	
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
		
		txt=new TextField(30);
		btnN=new Button("North Button");
		btnE=new Button("East Button");
		btnS=new Button("South Button");
		btnW=new Button("West Button");
		
		
		setLayout(new BorderLayout());
		
		add(btnN,BorderLayout.NORTH);
		add(btnE,BorderLayout.EAST);
		add(btnS,BorderLayout.SOUTH);
		add(btnW,BorderLayout.WEST);
		add(txt,BorderLayout.CENTER);
		
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