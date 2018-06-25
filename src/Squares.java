import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Squares {

	String pic1, pic2, name;
	int x, y, width, height;
	
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public Squares() {
		;
	}
	
	public Squares(String pic1, String pic2, int x, int y, int width, int height, String name) {
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.name = name;
		
		BufferedImage myPic1 = null;
		
		try {
			myPic1 = ImageIO.read(new File(pic1));
			
		} catch (IOException ex) {System.out.println("error in image upload");}
		
		
		label = new JLabel(new ImageIcon(myPic1));
		label.setBounds(x, y, width, height);
		label.addMouseListener(new clickListener(this));
	}
	
	public JLabel getLabel() {
		return label;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void changePic() {
		//JOptionPane.showMessageDialog(null, "change pic reached for " + this.name);
		BufferedImage myPic2 = null;
		try {myPic2 = ImageIO.read(new File(pic2));}
		catch(IOException ex) {System.out.println("error in image upload");}
		label.setIcon(new ImageIcon(myPic2));
	}
}
