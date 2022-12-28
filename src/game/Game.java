package game;

import javax.swing.JFrame;

import game.display.GamePanel;

public class Game {
	
	private JFrame frame;
	private GamePanel gamePanel;
	
	public static final int WIDTH = 790;
	public static final int HEIGHT = 680;
	
	public Game(String title) {
		
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

}
