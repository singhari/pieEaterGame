package game;


import javax.swing.*;


public class PieEater {
	
	JFrame frame;
	public static final int HEIGHT = 600;
	public static final int WIDTH = 800;
	GamePanel pan;
	
	public PieEater() {
		frame = new JFrame();
		pan = new GamePanel();
		frame.addKeyListener(pan);
		setup();
	}
	
	void setup() {
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(pan);
	}
	
	public static void main(String[] args) {
		PieEater pe = new PieEater();
		pe.setup();
		//System.out.println(System.getProperty("java.runtime.version"));
	}
}
