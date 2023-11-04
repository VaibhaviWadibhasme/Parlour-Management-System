
//Mouse events in Applet (Enter - Exit)



import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Frame_color_change extends Applet implements MouseListener {
	Frame f;
	public void init()
	{
		f=new Frame();
		f.setTitle("Demo");
		f.setVisible(true);
		f.setSize(200,300);
		f.addMouseListener(this);	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		f.setBackground(Color.RED);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		f.setBackground(new Color(0,255,0));
		
	}
	

}
