package su.strannik;

import su.strannik.graph.*;

public class Program {

	static Object test() {
		int x = 10;
		Integer y = x;   //new Integer(x);   -> boxing
		int z = y;		//unboxing
		
		Integer a = 10;
		Integer b = 20;
		Integer c = a*b;
		
		double d2 = 3.4;
		Object o2 = d2;		//(Object)(new Double(d))
		return o2;
	}
	
	public static void main(String[] args) {		
		Point p1 = new Point(100, 299, "red");
		//Point p1 = new Point(100, 299);
		//Point p1 = new Point();
		//p1.x = 100;
		//p1.y = 200;
		GraphObject g1 = p1;
		
		
		System.out.println("--------------------------------");
		p1.draw();
		g1.draw();
		System.out.println("--------------------------------");
		g1 = new Circle(10, 10, 20, "red");
		
		if (g1 instanceof Point) {
			Point p3 = (Point)g1;
			p3.draw();
		}
		
		Object o1 = new Point(10, 10);
		
		double d = 5.5;
		Object o2 = d;
		
		Object o3 = test();
		System.out.println(o3);
		
		Point p2 = p1.clone();
		p2.setX(-1000);
		//p2.x = 1000;
		p1.move(10, 10);
		//p1.color = "red";
		p1.draw();
		//p1.toString();
		System.out.println(p1.hashCode());
		System.out.println(p1);
		System.out.println(p1.toString());
		
		System.out.println(p2);
		
		Circle c1 = new Circle(150, 200, 500, "grey");
		System.out.println(c1);
		c1.setRadius(20);
		c1.scale(2);
		c1.draw();
		GraphObject.scaleScene(2.0);
		GraphObject.drawScene();
	}

}
