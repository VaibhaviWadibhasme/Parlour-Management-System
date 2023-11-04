
//WAP to perform all mouse events on applet viewer



import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseAllEvents extends Applet implements MouseListener, MouseMotionListener 
{
	String msg= "";
	int X=0,Y=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		X= e.getX();
		Y= e.getY();
		msg="Drag";
		repaint();
		
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		X= e.getX();
		Y= e. getY();
		repaint();	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		msg="Clicked";
		repaint();
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		msg="pressed";
		repaint();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		msg="Released";
		repaint();
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		msg="Entered";
		repaint();
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		msg="Exited";
		repaint();
		
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 110, 130);
//		g.drawString("mouse at" + X +  " , " + Y,80,100);
		g.drawString(X +","+Y,X,Y);
	}
	}
	
