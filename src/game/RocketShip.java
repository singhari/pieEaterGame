package game;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RocketShip extends GameObject{

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	public RocketShip(int x, int y, int width, int height) {
		super(x,y,width,height);
		speed =15;
		if (needImage) {
		    loadImage ("rocket.png");
		}
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

	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}
}
