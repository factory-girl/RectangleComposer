import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

/**
 * A class that composes a GUI for RectangleComposer
 *
 */
public class RectangleCompFrame2 extends JFrame
{
	   private static JTextField numberField;
	   private static RectangleComposer2 rectangle2;
	   private static final int FRAME_WIDTH = 1000;
	   private static final int FRAME_HEIGHT = 700;
	   
	/**
	 * Composes panel with text, labels, fields and buttons
	 */
	public RectangleCompFrame2() 
	{
		 rectangle2 = new RectangleComposer2();
	     rectangle2.setPreferredSize(new Dimension(400,350));

	     numberField = new JTextField(5);
	    
	     JLabel numberLabel = new JLabel("Number of rectangles to draw: ");

	     JPanel panel = new JPanel();

	     panel.add(numberField);
	     panel.add(numberLabel);
	     panel.add(createDrawButton());
	     panel.add(rectangle2);

	     setSize(FRAME_WIDTH, FRAME_HEIGHT);
	     add(panel);
	}
	
	/**
	 * Creates draw button and parses given text number of rectangles to be drawn
	 * @return drawButton
	 */
	private JButton createDrawButton()
	{
		JButton drawButton = new JButton("Draw");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
				int number = Integer.parseInt(numberField.getText());
	         
	            rectangle2.setNumberAndPosition(number);

	            numberField.setText("");
	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }
	
	public static JButton createMoreButton()
	{
		JButton drawButton = new JButton("More");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
	         
				int number = rectangle2.getNumber();
		         
	            rectangle2.setNumberAndPosition(number*2);

	            numberField.setText("");
	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }
	
	public static JButton createFewerButton()
	{
		JButton drawButton = new JButton("Fewer");
		
		class DrawButtonListener implements ActionListener
	    {
			public void actionPerformed(ActionEvent event)
			{
	         
				int number = rectangle2.getNumber();
		         
	            rectangle2.setNumberAndPosition((number/2));

	            numberField.setText("");
	         }
	      }

	      ActionListener listener = new DrawButtonListener();
	      drawButton.addActionListener(listener);      

	      return drawButton;
	 }
}
