
//Enter - Exit multi color change in AWT


import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Scanner;


public class Multi_Window_With_Color {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many frames: ");
		int no= sc.nextInt();
		SampleFrame f[]=new SampleFrame[no];
		for(int i=0;i<no;i++)
		{
			f[i]=new SampleFrame(i);
			
			f[i].setTitle("Handle Mouse Events");
			f[i].setSize(300,200);
			f[i].setLocation(100*i,100*i);
			f[i].setAlwaysOnTop(true);
			f[i].setVisible(true);	
		}
	}

}
class SampleFrame extends Frame implements MouseListener
{
	Random ra=new Random();
	SampleFrame(int i)
	{
		addMouseListener(this);
	}
	public void mouseEntered(MouseEvent evtObj)
	{

		int r=ra.nextInt(256);
		int g=ra.nextInt(256);
		int b=ra.nextInt(256);
		setBackground(new Color(r,g,b));
	}

	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseClicked(MouseEvent me){}
	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		int r=ra.nextInt(256);
		int g=ra.nextInt(256);
		int b=ra.nextInt(256);
		setBackground(new Color(r,g,b));

		
	}	
	}

