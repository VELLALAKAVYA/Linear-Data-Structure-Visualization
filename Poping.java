import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Poping extends Applet implements Runnable 
{

    int x_pos = 170; // x - Position des Balles
	int y_pos = 380; // y - Position des Balles
	int length = 20;
	int breadth = 20;
	Thread th1;

	public void start() {

		Thread th1 = new Thread(this);
		th1.start();

	}
	public void run() {

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true) {
			if (x_pos == 170)

				y_pos--;

	
			 if(y_pos==100)
			  {
				  suspend1();
			  }
				repaint();
			try {
				Thread.sleep(10);

			} catch (InterruptedException ex) {
				// do nothing
			}

			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}
	
	void suspend1()
	{
	   while(true)
	   {
		x_pos++;
		repaint();
		try {
			Thread.sleep(10);

		} catch (InterruptedException ex) {
			// do nothing
		}
		} 
		}	
	
	public void paint(Graphics g) {
		g.setColor(Color.red);

		g.drawRect(x_pos - length, y_pos - breadth, 2 * length, 2 * breadth);
	}

}

		
