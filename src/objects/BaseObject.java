package objects;

import java.awt.Color;
import java.util.Random;

import game.Game;
import objects.base.GameObject;

public class BaseObject extends GameObject {
	
	private float xv;
	private float yv;
	
	private Random random;

	public BaseObject(float x, float y, float width, float height, Color color) {
		super(x, y, width, height, color);
		this.xv = 0;
		this.yv = 0;
		this.random = new Random();
	}

	@Override
	public void update() {
		
		this.x += this.xv;
		this.y += this.yv;
		
		byte dir = (byte) (this.random.nextInt(4));
		
		final float SPEED = 1;
		
		switch (dir) {
		
			case 0: // Up
				this.yv -= SPEED;
				break;
				
			case 1: // Down
				this.yv += SPEED;
				break;
				
			case 2: // Left
				this.xv -= SPEED;
				break;
				
			case 3: // Right
				this.xv += SPEED;
				break;
				
		}
		
		
		this.x = Game.clamp(this.x, (float) (Game.WIDTH - this.width), 0f);
		this.y = Game.clamp(this.y, (float) (Game.HEIGHT - (float) (this.height * 1.3f)), 0f);
		
		
		
	}

}
