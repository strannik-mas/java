package su.strannik.graph;

import java.util.*;

public abstract class GraphObject {
	public static final String DEFAULT_COLOR = "BLACK";
	public String color = "Black";
	
	private static List<GraphObject> scene = new ArrayList<GraphObject>();
	
	public GraphObject() {
		this(DEFAULT_COLOR);
		System.out.println("GraphObject() ctor");
		
	}
	
	public GraphObject(String color) {
		this.color = color;
		System.out.println("GraphObject(color) ctor");
		scene.add(this);
	}
	
	public abstract void draw();
	
	@Override
	public String toString() {
		return String.format("GraphObject %s\n", color);
	}
	
	public void delete() {
		if(scene.contains(this))
			scene.remove(this);
	}
	
	public static void clearScene() {
		scene.clear();
	}
	
	public static void drawScene() {
		System.out.println("********");
		for(GraphObject g : scene)
			g.draw();
	}
	
	public static void scaleScene(double factor) {
		for(GraphObject g : scene) {
			if(g instanceof Scaleable) {
				Scaleable c = (Scaleable)g;
				c.scale(factor);
			}
		}
	}
	
	public static void moveScene(int dx, int dy) {
		for(GraphObject g : scene)
			if(g instanceof Moveable) {
				Moveable moveObj = (Moveable)g;
				moveObj.move(50, 150);
			}
	}
}
