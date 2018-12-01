
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Swing1
{
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;

   public Swing1()
   {
      prepareGUI();
   }

   public static void main(String[] args)
   {
      Swing1  swingContainerDemo = new Swing1();  
      swingContainerDemo.showJFrameDemo();
   }

   private void prepareGUI()
   {
      mainFrame = new JFrame("Program Visualization Tool");
      mainFrame.setSize(1500,1500);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() 
      {
         public void windowClosing(WindowEvent windowEvent)
         {
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    

      statusLabel.setSize(350,100);

      msglabel = new JLabel("Operations.", JLabel.CENTER);
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showJFrameDemo()
   {
      headerLabel.setText("Program Visualization");   
      final JFrame frame = new JFrame();
      frame.setSize(1500, 1500);
      frame.setLayout(new FlowLayout());       
      frame.add(msglabel);
      frame.addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent windowEvent)
         {
            frame.dispose();
         }        
      });    
      JButton Button1 = new JButton("Stack");
      JButton Button2 = new JButton("Queue");
      
      Button1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            statusLabel.setText("Stack Data Structure is selected.");
            //frame.setVisible(true);
            JButton b1 = new JButton("Push");
            {
            	b1.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e1)
            	{
            		
            		    }
	
            	
            	});
            }
            
            JButton b2 = new JButton("Pop");
            controlPanel.add(b1);
            controlPanel.add(b2);
         }
      });
      controlPanel.add(Button1);
      
      
      
	   
      Button2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e) 
         {
            statusLabel.setText("Queue Data Structure is selected.");
            //frame.setVisible(true);
            JButton b3 = new JButton("Insert");
            JButton b4 = new JButton("Delete");
            controlPanel.add(b3);
            controlPanel.add(b4);
         }
      });
      controlPanel.add(Button2);
      mainFrame.setVisible(true);  
   }
   }
