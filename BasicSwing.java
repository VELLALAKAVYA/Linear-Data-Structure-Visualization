

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
public class BasicSwing extends JFrame
{
 
	JPanel p=new JPanel();
	public JPanel controlPanel;
	private JLabel statusLabel;
	JButton b1=new JButton("Stack");
	JButton b2=new JButton("Queue");
	JLabel l=new JLabel("Program Visualization");
	String choices[]=
		{
			"Operations",
			"Push",
			"Pop",
			"Insert",
			"delete"
		};
	JComboBox cb=new JComboBox(choices);
   public static void main(String[] args)
   {
	  
     new BasicSwing();
    
     
   } 
	 public BasicSwing()
	 {
		 super("Basic Swing App");
		 setSize(400,300);
		 setResizable(true);
		 p.add(l);
		 p.add(b1);
		 
		
		 p.add(cb);
		 add(p);
		 
		 setVisible(true);
	 }
   
}
