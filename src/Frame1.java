import javax.swing.JFrame;

public class Frame1 {

	public JFrame frame;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		Frame1 window = new Frame1();
		window.frame.setVisible(true);

	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Squares x = new Squares("images\\black-X.png", "images\\blue-X.png", 0, 0, 450, 450, "x");
		Squares o = new Squares("images\\black-O.png", "images\\blue-O.png", 450, 0, 450, 450, "o");
		Squares sq = new Squares("images\\black-sq.png", "images\\blue-sq.png", 0, 425, 450, 450, "sq");
		Squares tri = new Squares("images\\black-tri.png", "images\\blue-tri.png", 450, 410, 450, 450, "tri");
		
		
		frame.getContentPane().add(x.getLabel());
		frame.getContentPane().add(o.getLabel());
		frame.getContentPane().add(sq.getLabel());
		frame.getContentPane().add(tri.getLabel());
	}
	

}
