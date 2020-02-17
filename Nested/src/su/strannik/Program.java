package su.strannik;

public class Program {
	public static final int STEPS = 1000000;
	
	public static double integral(MathFunction f, double a, double b) {
		double h = (b-a)/STEPS;
		double summa = 0D;
		
		for(int i=0; i < STEPS; i++) {
			double x = a+h*i+h/2;
			//double y = Math.sin(x);
			double y = f.function(x);
			summa += y*h;
		}
		
		return summa;
	}

	public static void main(String[] args) {
		{
			/*class Sinus implements MathFunction{

				@Override
				public double function(double x) {
					// TODO Auto-generated method stub
					return Math.sin(x);
				}

			}
			
			Sinus s  = new Sinus();*/
			double r1 = integral(
					new MathFunction() {
						
						@Override
						public double function(double x) {
							// TODO Auto-generated method stub
							return Math.sin(x);
						}
					},
					0,
					Math.PI/2
					);
			System.out.println(r1);
			
			final double k = 2;
			
			double r2 = integral(
					new MathFunction() {
						
						@Override
						public double function(double x) {
							// TODO Auto-generated method stub
							return Math.cos(k*x);
						}
					},
					0,
					Math.PI/2
					);
			System.out.println(r2);
		}
		{
			Outer.Nested n = new Outer.Nested();
		}
		{
			Outer o = new Outer(19);
			Outer.Nested n = new Outer.Nested();
			n.updateOuterData(o);
			
			System.out.println(o.getData());
			Outer.l.multiple();
			System.out.println(o.getData());
			
			Outer.l2.multiple();
			System.out.println(o.getData());
		}
		{
			Outer o = new Outer(10);
			Outer.Inner inner = o.new Inner();
			Outer.Inner inner2 = o.new Inner();
			
			inner.updateOuterData();
			inner2.updateOuterData();
		}
		
		{
			Invoice inv = new Invoice("Рога и копыта");
			Invoice.Line l1 = inv.new Line("Book", 2, 100);
			
			inv.new Line("DVD", 3, 400);
			l1.setQuantity(1);
			System.out.println(inv);
		}
	}

}
