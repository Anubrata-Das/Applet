//Flow Layout
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
		
		setLayout(new FlowLayout());
		
		add(lbl);
		add(txt);
		add(btn);
		add(txr);
		
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