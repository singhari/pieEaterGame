package game;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ObjectManager implements ActionListener{
	RocketShip rocket;
	ArrayList<Pie> pieList = new ArrayList<Pie>();
	Random random = new Random();
	int pieNumber;
	int level = 1;
	int score = 0;
	
	public ObjectManager(RocketShip rocket) {
		this.rocket = rocket;
		pieNumber = 5*level;
		for(int i = 0; i < pieNumber; i++) {
			addPie();
			pieList.get(i).isActive = true;
		}
	}
	
	void addPie() {
		pieList.add(new Pie(random.nextInt(PieEater.WIDTH-60),random.nextInt(PieEater.HEIGHT-60),50,50));
	}
	void update() {
	//	checkCollision();
		for(Pie ali : pieList) {
			ali.update();
//			if(ali.y > PieEater.HEIGHT) {
//				ali.isActive = false;
//			}
		}
		if(!pieList.get(pieList.size() - 1).isActive) {
			level = 2;
		}
	//	else { 
		checkCollision();
		purgeObjects();
	//	}
	}
	
	void purgeObjects() {
		for(int i = 0; i < pieList.size(); i++) {
			if(!pieList.get(i).isActive) {
				pieList.remove(i);
			}
		}
	}
	
	void checkCollision() {
		for(Pie pir : pieList) {
		//	System.out.println("for loop");
			if(pir.collisionBox.intersects(rocket.collisionBox)) {
				pir.isActive = false;
				score++;
				System.out.println("pie touched and your score is " + score);
			}
		}
	}
	
	int getScore() {
		return score;
	}
	void draw(Graphics g) {
		rocket.draw(g);
		for(Pie al : pieList) {
			al.draw(g);
		}
	}

	boolean scoreMaker() {
		int truer = 0;
		for(Pie pir : pieList) {
			if(pir.collisionBox.intersects(rocket.collisionBox)) {
				pir.isActive = false;
				//score++;
				System.out.println("smth happened lol");
				truer = 1;
			}
		}
		if(truer ==0 ) {
			return false;
		}
		else {
			return true;
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
}
