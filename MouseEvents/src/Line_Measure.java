

//WAP to drag a line and measurement of line 




import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Line_Measure extends Applet implements MouseListener , MouseMotionListener
{
	int X=0 , Y=0 , x=0 , y=0;
	public void init()
	{
		setSize(900,900);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();	
	}

	@Override
	public void mouseMoved(MouseEvent e )
	{	
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{	
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		X= e.getX();
		Y= e.getY();
		repaint();	
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{	
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{	
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{	
	}
	public void paint(Graphics g)
	{
//		g.setStroke(new BasicStroke(4));
		g.setColor(Color.BLUE);
		g.drawLine(x, y, X, Y);
		int distance = (int) Math.sqrt(((int)Math.pow((x-X),2))+ ((int)Math.pow((y-Y),2)));
		String abc=Integer.toString(distance);
		g.drawString(abc, 400, 400);	
	}
}
