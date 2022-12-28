package objects.base;

import java.awt.Graphics2D;
import java.util.LinkedList;

public class ObjectHandler {
	
	private LinkedList<GameObject> list;
	
	public ObjectHandler() {
		
		this.list = new LinkedList<>();
		
	}
	
	public void add(GameObject ga) {
		
		
		this.list.add(ga);
		
	}
	
	public void remove(GameObject ga) {
		
		this.list.remove(ga);
		
	}
	
	public void update() {
		
		for (int i = 0; i < list.size(); i++) this.list.get(i).update();
		
	}
	
	public void draw(Graphics2D g2d) {
		
		for (int i = 0; i < this.list.size(); i++) this.list.get(i).draw(g2d);
		
	}
	

	public LinkedList<GameObject> getList() {
		return list;
	}

	public void setList(LinkedList<GameObject> list) {
		this.list = list;
	}
	
	

}
