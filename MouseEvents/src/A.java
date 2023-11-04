//write a program to create N frame and perform   color changing operations on enter exit event



    import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;


	public class A extends JFrame
	{

		
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);       // for get input form user 
			System.out.println("enter how many frames do you want to create: ");
			int no = s.nextInt();
//			SampleFrame f[] =new SampleFrame[no];    //create frame object 
			
			for(int i=0;i<no;i++)
			{
	          JFrame  f=new JFrame();
	            
				f.setTitle("handle mouse events");
				f.setSize(300,200);
				f.setVisible(true);
				f.setAlwaysOnTop(true);
				Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
				
				 if(i==0)
					 f.setLocation((d.width-300)/2,(d.height-200)/2);
				 else if(i==1)
					 f.setLocation((d.width-300)/12,(d.height-200)/12);
				 else if(i==2)
					 f.setLocation((d.width-300),(d.height-200)/12);
				 else if(i==3)
					 f.setLocation((d.width-300)/12,(d.height-200));
				 else if(i==4)
					 f.setLocation((d.width-300),(d.height-200));
				 
			}

		}

	
	


	class SampleFrame extends Frame implements MouseListener 
	{
		
		private static final long serialVersionUID = 1L;
		Random ra=new Random();
		SampleFrame(int i)
		{
			addMouseListener(this);
			
		}
		public void mouseClicked(MouseEvent e) {
			
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent evtObj) {
			
		}
		public void mouseEntered(MouseEvent e) {
			int r= ra.nextInt(256);
			int g= ra.nextInt(256);
			int b= ra.nextInt(256);
			setBackground(new Color(r,g,b));
			
		}
		public void mouseExited(MouseEvent e) {
			int r= ra.nextInt(256);
			int g= ra.nextInt(256);
			int b= ra.nextInt(256);
			setBackground(new Color(r,g,b));
			
			
		}
		
	}


}