import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class clickListener implements MouseListener{

	Squares ob = new Squares();

	public clickListener(Squares newSquare) {
		ob = newSquare;
	}

	public void mouseClicked(MouseEvent e) {
		ob.changePic();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
