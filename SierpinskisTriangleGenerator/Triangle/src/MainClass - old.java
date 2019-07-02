// generates a new random sierpinki's triangle when run and displays it graphically

import java.util.Random;
import javax.swing.*;
import java.awt.*;

public class MainClass extends JPanel {
	// size of panel
	int winX = 1000;
	int winY = 1000;
	
	// size of fillOvals
	int pw = 2;
	
	// bounds of triangle vertices
	int bound = 100;
	int top = bound;
	int bot = winY - bound;
	int left = bound;
	int right = winX - bound;
	int mid = winX/2;
	
	// first point - update for random later
	int rx = 500;
	int ry = 500;
	
	// random to determine next random vertex from 3 corners
	Random p = new Random();
	
	// make JFrame
	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.getContentPane().add(new MainClass());
	    
		frame.setSize(1000, 1000);
		frame.setTitle("Sierpinskis Triangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	// Draw points
	public void paint(Graphics g) {
		// starting points
		g.fillOval(mid, top, pw, pw);
		g.fillOval(left, bot, pw, pw);
		g.fillOval(right, bot, pw, pw);
		
		// first new point
		g.fillOval(rx, ry, pw, pw);
		
		for(int i=0; i<1000000; i++) {
			// represent coordinates of next point
			int newX, newY;
			
			// declare coordinates based on 1 of 3 original points
			int randP = p.nextInt(3)+1;
			if(randP==1) {
				newX = rx+(mid-rx)/2;
				newY = top+(ry-top)/2;
				
				g.fillOval(newX, newY, pw, pw);
				
				rx = newX;
				ry = newY;
			}
			if(randP==2) {
				newX = left+(rx-left)/2;
				newY = ry+(bot-ry)/2;
				
				g.fillOval(newX, newY, pw, pw);
				
				rx = newX;
				ry = newY;
			}
			if(randP==3) {
				newX = rx+(right-rx)/2;
				newY = ry+(bot-ry)/2;
				
				g.fillOval(newX, newY, pw, pw);
				
				rx = newX;
				ry = newY;
			}
		}
	}
}