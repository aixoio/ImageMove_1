package objects;

import java.awt.Color;

import objects.base.GameObject;

public class BaseObject extends GameObject {
	
	private float xv;
	private float yv;

	public BaseObject(float x, float y, float width, float height, Color color) {
		super(x, y, width, height, color);
		this.xv = 0;
		this.yv = 0;
	}

	@Override
	public void update() {
		
		this.x += this.xv;
		this.y += this.yv;
		
		
	}

}
