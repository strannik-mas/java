package su.strannik;

import static java.lang.System.out;

public class Program {
	
	static void test(String s1, String s2) throws BoundException {
		if(s1 == null)
			throw new IllegalArgumentException("s1 is null");
		if(s2 == null)
			throw new IllegalArgumentException("s2 is null");
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			
			if(n1 < 0 || n1 > 100)
				throw new BoundException("invalid n1", n1);
			if(n2 < 0 || n2 > 100)
				throw new BoundException("invalid n2", n2);
			
			int n = n1/n2;
			out.println(n);
		} catch(NumberFormatException ex) {
			out.println("Ne chislo");
		} catch(ArithmeticException ex) {
			throw new ArithmeticException("Деление на ноль");
		} /*
			 * catch (BoundException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); out.printf("%s %d\n", e.getMessage(), e.getData()); }
			 */
		/*
		 * catch(Exception ex) { out.println("Ne chislo osn"); }
		 */ finally {
			out.println("fianl");
		}
		out.println("prodolzhenie raboty test");
	}

	public static void main(String[] args) {
		//test(null, "221");
		//test("sss222", "221");
		//test("-2", "221");
		try {
			test("222", "0");
		} catch(ArithmeticException | BoundException ex) {
			out.println(ex.getMessage());
			out.println("exeption on main");
		}
		
		out.println("prodolzhenie raboty main");
	}

}
