import java.awt.*;
import java.awt.event.*;
import java.applet.*;
@SuppressWarnings("serial")
public class stac1 extends Applet implements ActionListener,ItemListener,Runnable
{
  String msg="  ";
  Button b1,b2;
  TextArea t0;
  int a=5;
  public void init()
  {
    setLayout(new FlowLayout(FlowLayout.LEFT));
	b1=new Button("Features");
	add(b1);
	b1.addActionListener(this);	
	b2=new Button("Enter");
	add(b2);
	b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==b1)
	{
	   t0=new TextArea(5,40);
	   add(t0);
	   t0.setText("Size of Stack is:10\nNuber of elements are present are:");
	}
  }  
  public void itemStateChanged(ItemEvent e)
  {  
	repaint();
  }
    int x_pos = 20; // x - Position des Balles
	int y_pos = 300; // y - Position des Balles
	int length = 20;
	int breadth = 20;
	Thread th,th1;
	public void start()
	{
        Thread th = new Thread(this);
		th.start();
    }
	public void run()
	{
       Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        while (true) 
		{    
		    
			  x_pos++;
            if(x_pos==670)
			{
			  stop();
			}
		    repaint();
			try 
			{
			  Thread.sleep(20);
            }
			catch (InterruptedException ex) 
			{
				// do nothing
			}
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}
/*	void suspend1()
	{
	   while(true)
	   {
		  x_pos++;
		  if(x_pos==700)
		  {
			stop();
		  }
		  repaint();
		  try 
		  {
			Thread.sleep(20);
		  }
		  catch (InterruptedException ex)
		  {
			// do nothing
		  }
	    } 
	}	*/
	@SuppressWarnings("deprecation")
	public final  void stop()
	{
		th.stop();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
        g.drawRect(x_pos - length, y_pos - breadth, 2 * length, 2 * breadth);
		g.drawLine(100,250,700,250);
		g.drawLine(100,350,700,350);
	}
}

    
	

