package game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ObjectManager implements ActionListener{
	RocketShip rocket;
	ArrayList<Pie> pieList = new ArrayList<Pie>();
	Random random = new Random();
	
	public ObjectManager(RocketShip rocket) {
		this.rocket = rocket;
	}
	
	void addPie() {
		pieList.add(new Pie(random.nextInt(PieEater.WIDTH),0,50,50));
	}
	void update() {
		for(Pie ali : pieList) {
			ali.update();
			if(ali.y > PieEater.HEIGHT) {
				ali.isActive = false;
			}
		}
		purgeObjects();
	}
	
	void purgeObjects() {
		for(int i = 0; i < pieList.size(); i++) {
			if(!pieList.get(i).isActive) {
				pieList.remove(i);
			}
		}
	}
	
	void draw(Graphics g) {
		rocket.draw(g);
		for(Pie al : pieList) {
			al.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addPie();
	}
	
}
