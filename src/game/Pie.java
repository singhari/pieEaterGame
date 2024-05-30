package game;

import java.awt.*;

public class Pie extends GameObject{

	public Pie(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	void update() {
		
	}
	
	void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
	}
	
}
