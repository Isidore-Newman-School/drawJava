import java.awt.*; 

public class Fish {
    private int x;
    private int y;
    private Color c;
    
	public Fish() {
		x = (int) (Math.random() * 100);
		y = (int) (Math.random() * 100);
		c = new Color((int)(Math.random() * 0x1000000)); 
	}
	
	public void display(Graphics g) {
		int size = 40;
		g.setColor(c);
		g.fillOval(x-size/2, y-size/4, size, size/2);
		int tailX = x + size/2;
		int xp[] = {tailX, tailX+10, tailX+10, tailX};
		int yp[] = {y, y-10, y+10, y};
		g.fillPolygon(xp, yp, 4);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setColor(Color c) {
		this.c = c;
	}
}
