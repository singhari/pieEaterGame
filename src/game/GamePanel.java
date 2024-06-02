package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener{

    final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font instructionFont;
    int fntx = 66;
    int fnty = 115;
    Timer frameDraw;
    RocketShip rocket = new RocketShip(250, 400, 50, 50);
    ObjectManager objMan = new ObjectManager(rocket);
    int score;

    
    public GamePanel() {
    	titleFont = new Font("Times New Roman", Font.PLAIN, 48);
    	instructionFont = new Font("Times New Roman", Font.PLAIN, 20);
        frameDraw = new Timer(1000/60,this);
        frameDraw.start();
    }
    
   void updateMenuState() {
	   
   }
   void updateGameState() {
	   objMan.update();
   }
   void updateEndState()  {
	   
   }
    
   void drawMenuState(Graphics g) {
	   g.setColor(Color.LIGHT_GRAY);
	   g.fillRect(0, 0, PieEater.WIDTH, PieEater.HEIGHT);
	   g.setFont(titleFont);
	   g.setColor(Color.WHITE);
	   g.drawString("Pie Eater", fntx, fnty);
   }
   void drawGameState(Graphics g) {
	   g.setColor(Color.GREEN);
	   g.fillRect(0, 0, PieEater.WIDTH, PieEater.HEIGHT);
	   objMan.draw(g);
   }
   void drawEndState(Graphics g)  {
	   g.setColor(Color.LIGHT_GRAY);
	   g.fillRect(0, 0, PieEater.WIDTH, PieEater.HEIGHT);
	   g.setFont(titleFont);
	   g.setColor(Color.WHITE);
	   score = objMan.getScore();
	   g.drawString("You ate " + score + " pies!", fntx, fnty);
   }
   
   void startGame() {

   }
   
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState == MENU){
		    updateMenuState();
		}else if(currentState == GAME){
		    updateGameState();
		}else if(currentState == END){
		    updateEndState();
		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(objMan.level ==2 ) {
			currentState = END;
		}
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else {
		        currentState++;
		    }
		}   
		if (e.getKeyCode()==KeyEvent.VK_UP) {
			   // System.out.println("UP");
			    if(!(rocket.y < 0)) {
			    	rocket.up();
			    }
			}
			if (e.getKeyCode()==KeyEvent.VK_DOWN) {
			    //System.out.println("DOWN");
			   // if(!(rocket.y > HEIGHT)) {
			    	rocket.down();
			  //  }
			}
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			    //System.out.println("RIGHT");
			   // if((rocket.x < WIDTH)) {
			    	rocket.right();
			    
			}
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			    //System.out.println("LEFT");
			    if(!(rocket.x < 0)) {
			    	rocket.left();
			    }
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				
				
			}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
