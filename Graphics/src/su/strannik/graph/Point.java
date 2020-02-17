package su.strannik.graph;

public class Point extends GraphObject implements Cloneable, Moveable {
	int x;
	int y;
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String color = "yellow";
	
	public Point() {
		this(0, 0);
		System.out.println("Point() ctor");
	}
	
	public Point(int x, int y) {
		this(x,y, DEFAULT_COLOR);
		System.out.println("Point(x,y) ctor");
	}
	
	public Point(int x, int y, String color) {
		super(color);
		System.out.println("Point(x,y, color) ctor");
		this.x = x;
		this.y = y;
		//this.color = color;
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	@Override
	public void draw() {
		//super.draw();
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return String.format("Point (%d, %d) %s\n", x, y, super.color);
	}
	
	@Override
	public Point clone() {
		// TODO Auto-generated method stub
		return new Point(x, y ,color);
	}
}
