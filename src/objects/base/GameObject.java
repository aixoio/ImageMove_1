package objects.base;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class GameObject implements Updatable, Drawable {

	protected float x;
	protected float y;
	
	protected float width;
	protected float height;
	
	protected Color color;
	
	
	
	@Override
	public void draw(Graphics2D g2d) {
		
		g2d.setColor(this.color);
		g2d.fillRect((int) this.x, (int) this.y, (int) this.width, (int) this.height);
		
	}
	
	
	
	
	
	public GameObject(float x, float y, float width, float height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}





	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
}
