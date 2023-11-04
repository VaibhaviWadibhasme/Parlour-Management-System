
// Draw polygon using mouse events in applet




import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class polygon extends Applet implements MouseListener, MouseMotionListener {
	
	private int x[] , y[];
	private int num;
	public void init()
	{
		setSize(700,700);
		addMouseListener(this);
		addMouseMotionListener(this);
		x = new int[100];
		y = new int[100];
		
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
	}
	public void getInputLine(int x1, int y1, int x2,int y2)
	{
		Graphics g = getGraphics();
		g.drawLine(x1, y1, x2, y2);
		g.dispose();
	}
	public void printPolygon()
	{
		if(num < 2)
		{
			return;	
		}
		Graphics g = getGraphics();
		if (num == 2)
		{
			g.drawLine(x[0],y[0],x[1],y[1]);
		}
		else
		{
			g.setColor(Color.RED);
			g.fillPolygon(x,y,num);
		}
		g.dispose();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isShiftDown())
		{
			num = 0;
			repaint();
		}
		else if (num > 0 && (Math.abs(x[0] - e.getX()) <= 2) && (Math.abs(y[0] - e.getY()) <= 2))
		{
			printPolygon();
			num=0;
		}
		else if (e.isMetaDown() || num == 100)
		{
			printPolygon();
			num=0;
		}
		else
		{
			x[num] = e.getX();
			y[num] = e.getY();
			num++;
			if (num >= 2)
			{
				getInputLine(x[num-2], y[num-2],x[num-1], y[num-1] );
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
	
}
