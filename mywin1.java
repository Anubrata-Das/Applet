import java.awt.*;
import java.awt.event.*;

class MyWindow extends Frame
{
	public MyWindow ()
	{
		super("My window"); //setTitle("My Window");
		addWindowListener(new WindowAdapter()
							{
								public void windowClosing(WindowEvent we)
								{
									System.exit(0);
								}
							}
						);
		setSize(8000,4000);
	}
}

class Demo
{
	public static void main(String[] args)
	{
		new MyWindow().setVisible(true);
	}
}
	