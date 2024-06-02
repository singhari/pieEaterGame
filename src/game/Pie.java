package game;

import java.awt.*;
import java.awt.image.*;

import javax.imageio.ImageIO;

public class Pie extends GameObject{

	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	public Pie(int x, int y, int width, int height) {
		super(x, y, width, height);
		if (needImage) {
		    loadImage ("pie.png");
		}
		// TODO Auto-generated constructor stub
	}
	void update() {
		  super.update();
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
			g.setColor(Color.YELLOW);
			g.fillRect(x, y, width, height);
		}
	}
	
}
