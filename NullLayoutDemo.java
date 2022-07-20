//Null Layout
import java.awt.*;
import java.awt.event.*;
class MyWindow extends Frame
{
	Label lbl;
	TextField txt;
	Button btn;
	TextArea txr;
	
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
		
		lbl=new Label("Hello From My Label");
		txt=new TextField(30);
		btn=new Button("Click Me");
		txr=new TextArea(3,50);
		
		setLayout(null);
		
		lbl.setBounds(50,40,120,20);
		txt.setBounds(50,70,100,20);
		btn.setBounds(50,100,80,20);
		txr.setBounds(50,130,150,80);
		
		add(lbl);
		add(txt);
		add(btn);
		add(txr);
		
		setVisible(true);
	}
}
class NullLayout
{
	public static void main(String[] args)
	{
		new MyWindow();
	}
}