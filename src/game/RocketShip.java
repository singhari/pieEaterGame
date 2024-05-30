package game;

import java.awt.*;

public class RocketShip extends GameObject{

	public RocketShip(int x, int y, int width, int height) {
		super(x,y,width,height);
		speed =15;
	}
	
	void up() {
		y-=speed;
	}
	void down() {
		y+=speed;
	}
	void right() {
		x+=speed;
	}
	void left() { 
		x-=speed;
	}

	
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(x, y, width, height);
	}
}
