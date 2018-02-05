// Earl Bergquist, Garfield High School
// 10/11/2010
// Introduction to DrawingPanel, Graphics, Color
// http://www.garfieldcs.com/wordpress/wordpress/wp-content/uploads/2011/10/GraphicsPrimer.java

import java.awt.*;  // to use Graphics, Color

public class GraphicsPrimer {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300, 200);
		panel.setBackground(Color.BLUE);
		Graphics g = panel.getGraphics();
		
		Fish fish = new Fish();
		fish.display(g);
		
//		g.drawLine(25, 75, 100, 25); // A Line
//		g.drawRect(15,30,20,30); // Now draw a Rectangle (<x>, <y>, <width>, <height>)
//		g.drawOval(15,30,20,30); // Now draw an Oval (<x>, <y>, <width>, <height>)
		

		// Set the Color for our Graphics drawing (like the pen)
//		g.setColor(Color.GREEN);
//		g.fillRect(200,100,20,30);
//		g.fillOval(250,100,20,30);	
		
		// Using Methods, we can pass Graphics object g along...		
		//drawFace(g);
		
	}
	
	// Draws a face with a rectangular mouth
	public static void drawFace(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(50, 50, 100, 100);
		
		g.setColor(Color.BLACK);
		g.fillOval(75, 80, 5, 20);
		g.fillOval(125, 80, 5, 20);
		
		g.setColor(Color.RED);
		g.drawRect(80, 120, 40, 10);	
	}
}		




