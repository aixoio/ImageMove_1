package game.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import game.Game;
import objects.BaseObject;

public class GamePanel extends JPanel implements Runnable {

	private Thread gameThread;
	private final int FPS;
	
	public GamePanel() {
		this.FPS = 24;
		
	}
	
	
	public void startGameLoop() {
		
		Game.handler.add(new BaseObject(Game.WIDTH / 2 - 50, Game.HEIGHT / 2 - 50, 100, 100, new Color(0x222222)));
		
		this.gameThread = new Thread(this);
		this.gameThread.setDaemon(false);
		this.gameThread.start();
	}

	@Override
	public void run() {
		
		this.requestFocus();
		
		double drawInterval = (double) (1000000000 / this.FPS);
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0L;
		int drawCount = 0;
		
		while (this.gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta += (double) ((double) (currentTime - lastTime) / drawInterval);
			timer += (long) (currentTime - lastTime);
			
			lastTime = currentTime;
			
			if (delta >= 1) {
				
				this.update();
				
				this.repaint();
				
				
				delta--;
				
				drawCount++;
				
				
			}
			
			if (timer >= 1000000000) {
				System.out.println("FPS: " + drawCount);
				drawCount = 0;
				timer = 0L;
			}
			
			
		}
	}
	
	private void update() {
		
		Game.handler.update();
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(0xffffff));
		
		g2d.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
		
		Game.handler.draw(g2d);
		
	}
	
}
