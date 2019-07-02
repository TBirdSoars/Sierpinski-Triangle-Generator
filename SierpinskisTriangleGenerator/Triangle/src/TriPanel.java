// Generates a new (random) sierpinki's triangle when run and displays it graphically

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Runnable;

public class TriPanel extends JPanel {
	// Declares size of panel and points, bounds of triangle vertices, and initial point
	private int winX;
	private int winY;
	private int bound;
	private Point o;
	
	// Sets up GUI for TriPanel and instantiates first point
	public TriPanel()
	{
		winX = 1000;
		winY = 1000;
		bound = 100;
				
		o = new Point(winX, winY, bound);
		
//		setPreferredSize (new Dimension(winX, winY));
	}
	
	// Draws points - figure out how to draw continuously
	public void paintComponent(Graphics g)
	{
//		o.draw(g);
		
		for(int i=0; i<100000; i++)
		{
			o.draw(g);
			o.nextLocation();
			
			long end = System.currentTimeMillis() + 10;
			
			while(System.currentTimeMillis() < end)
			{
				// wait 10 whole milliseconds...
			}
		}
	}
}