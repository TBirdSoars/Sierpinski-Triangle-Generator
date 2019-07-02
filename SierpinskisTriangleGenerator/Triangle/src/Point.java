// Creates the points that will be drawn in real time in TriPanel

import java.awt.*;
import java.util.Random;
import java.text.DecimalFormat;

public class Point {
	// Declares position variables, size of point, and bounds for drawing points
	private int rx, ry, newX, newY;
	final int pw, bound, top, bot, left, right, mid;
	private Random p;
//	private boolean triDrawn;
	
	public Point(int winX, int winY, int b)
	{
		rx = winX/2;
		ry = winY/2;
		
		pw = 2;
		
		bound = b;
		
		top = bound;
		bot = winY - bound;
		left = bound;
		right = winX - bound;
		mid = winX/2;
		
		p = new Random();
		
//		triDrawn = false;
	}
	
	public void draw (Graphics g)
	{
//		if(triDrawn == false) {
			g.fillOval(mid, top, pw, pw);
			g.fillOval(left, bot, pw, pw);
			g.fillOval(right, bot, pw, pw);
			
//			triDrawn = true;
//		} else {
			g.fillOval (rx, ry, pw, pw);
//		}
	}
	
//	public void drawTri (Graphics g)
//	{
//		g.fillOval(mid, top, pw, pw);
//		g.fillOval(left, bot, pw, pw);
//		g.fillOval(right, bot, pw, pw);
//	}
	
	public void nextLocation()
	{
		// declare coordinates based on 1 of 3 original points
		int randP = p.nextInt(3)+1;
		if(randP==1) {
			newX = rx+(mid-rx)/2;
			newY = top+(ry-top)/2;
						
			rx = newX;
			ry = newY;
		}
		if(randP==2) {
			newX = left+(rx-left)/2;
			newY = ry+(bot-ry)/2;
						
			rx = newX;
			ry = newY;
		}
		if(randP==3) {
			newX = rx+(right-rx)/2;
			newY = ry+(bot-ry)/2;
						
			rx = newX;
			ry = newY;
		}
	}
}
