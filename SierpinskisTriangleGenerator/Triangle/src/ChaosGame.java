// Does the whole triangle thing

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChaosGame
{
	// Creates the frame for the program
	public static void main(String[] args)
	{
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(1000, 1000));
		
		JFrame frame = new JFrame ("Sierpinskis Trinagle");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(p);
		frame.pack();
		frame.setVisible(true);
		
		(new TriPanel()).paintComponent(p.getGraphics());
	}
}