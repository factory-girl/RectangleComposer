import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.lang.Math;
import java.util.ArrayList;

/**
   A class which draws rectangles in random positions.
*/
public class RectangleComposer2 extends JComponent {
	private Rectangle2D.Double rectangle;
	private int x;
	private int y;
	private int width;
	private int height;
	private int number;
	private ArrayList<Rectangle2D.Double> rectList = new ArrayList<Rectangle2D.Double>();
	
    public RectangleComposer2()
    {  
    	x = 0;
    	y = 0;
    	width = 45;
    	height = 60;
    	rectangle = null;
    }
    
    /**
     * Sets attributes and number of rectangles to be drawn
     * @param number number of rectangles to be drawn
     */
    public void setNumberAndPosition(int number)
    {
    	this.number = number;
    	for (int i = number; i > 0; i--) {
    		rectangle = new Rectangle2D.Double(Math.random()*100, Math.random()*100, width, height);
    		rectList.add(rectangle);
    	}
    	repaint();
    }
    
    public int getNumber() {
    	return number;
    }
    
    /**
     * Method that draws rectangle
     * @param g graphics component
     */
    public void paintComponent(Graphics g)
    {	
    	if (rectangle == null) return;
    	Graphics2D g2 = (Graphics2D) g; 
    	for (Rectangle2D.Double rect : rectList) {
    		g2.draw(rect);
    	}
   }
}
