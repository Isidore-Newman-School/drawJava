// https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html
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
		
		Fish goldFish = new GoldFish();
		goldFish.display(g);	
	}
}		




