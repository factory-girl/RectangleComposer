import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;

/**
 * A class that composes a RectangleComposerFrame
 */
public class RectangleComposer2Viewer {
	public static void main(String[] args) {
		JMenu menu = new JMenu();
		JFrame frame = new RectangleCompFrame2();
		frame.setLayout(new BorderLayout());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("Rectangle Composer");
	    frame.setLayout(new BorderLayout());
	    menu.add(RectangleCompFrame2.createMoreButton());
	    menu.add(RectangleCompFrame2.createFewerButton());
	    frame.add(menu, BorderLayout.NORTH);
	    menu.setVisible(true);
	    frame.setVisible(true);
	    
	    
	 }

}