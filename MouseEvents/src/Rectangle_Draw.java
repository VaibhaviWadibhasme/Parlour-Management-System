

//Draw rectangle using mouse events in applet



import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Rectangle_Draw extends Applet implements MouseListener, MouseMotionListener
{
	int x1=0 , x2=0 , y1=0 , y2=0;
	public void init()
	{
		setSize(900,900);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		x2= e.getX();
		y2= e.getY();
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1= e.getX();
		y1= e.getY();
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	public void paint (Graphics g){
//	for rectangle
	
	g.setColor(Color.BLUE);
	g.drawRect(x1, y1, x2, y2);
	
//	for circle
	
	g.setColor(Color.YELLOW);
	g.fillOval(x1, y1, x2, y2);
}
}
