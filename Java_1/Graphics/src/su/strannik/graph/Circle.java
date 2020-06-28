package su.strannik.graph;

public class Circle extends GraphObject implements Scaleable, Moveable {
	public Point center = new Point();
	public int radius = 100;
	
	public Circle(int x, int y, int radius, String color) {
		super(color);
		this.center.x = x;
		this.center.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("circle center:(%d, %d), radius: %d\n", this.center.x, this.center.y, this.radius);
	}
	
	@Override
	public void draw() {
		center.draw();
		System.out.printf("Circle radius: (%d) \n", this.radius);
	}
	
	@Override
	public Circle clone() {
		// TODO Auto-generated method stub
		return new Circle(this.center.x, this.center.y, radius, "white");
	}
	
	public void scale(double factor) {
		setRadius((int)(radius * factor));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		center.x += dx;
		center.y += dy;		
	}
}
