package game;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;

import game.display.GamePanel;
import objects.BaseObject;
import objects.base.ObjectHandler;

public class Game {
	
	private JFrame frame;
	private GamePanel gamePanel;
	
	public static final int WIDTH = 747;
	public static final int HEIGHT = 747;
	
	public static ObjectHandler handler;
	
	public Game(String title) {
		
		Game.handler = new ObjectHandler();
		
		this.frame = new JFrame();
		this.gamePanel = new GamePanel();
		
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setSize(Game.WIDTH, Game.HEIGHT);
		this.frame.setTitle(title);
		this.frame.setResizable(false);
		this.frame.setLayout(null);
		
		
		this.gamePanel.setBounds(0, 0, Game.WIDTH, Game.HEIGHT);
		this.frame.add(this.gamePanel);
		
		
		
		this.frame.setVisible(true);
		
		this.gamePanel.startGameLoop();
		
	}
	
	public static int clamp(int var, int max, int min) {
		if (var >= max) {
			return max;
		} else if (var <= min) {
			return min;
		} else {
			return var;
		}
	}
	
	public static float clamp(float var, float max, float min) {
		if (var >= max) {
			return max;
		} else if (var <= min) {
			return min;
		} else {
			return var;
		}
	}
	
	public static void genObjects(int total) {
		
		Random random = new Random();
		
		for (int i = 0; i < total; i++) {
			
			Game.handler.add(new BaseObject(random.nextInt(Game.WIDTH), random.nextInt(Game.HEIGHT), random.nextInt(250), random.nextInt(250), new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256))));
			
		}
		
		
	}

}
