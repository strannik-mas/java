/**
 * 
 */
package su.strannik;

import static java.lang.System.out;

/**
 * @author Alex
 *
 */
public class Program {
	static int counter;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
			int a = 1000;
			short sh = 20;
			byte bt = 127;
			byte bt2 = 0x1f;
			
			long lg = 12344L;
			
			lg = a;
			int a2 = (int)lg;
			
			out.println(a2);
			
			double d1 = 12.5;
			double d2 = 2D;
			float f1 = 1.5F;
			
			int x = 5;
			
			double y = x/2D;
			out.println(y);
			
			
			int b1 = Integer.MAX_VALUE;
			int b2 = 2;
			
			lg = (b1 + b2) + 10L; 
			out.println(lg);
			
			
			char ch = 'A';
			short sh2 = (short)ch;
			
			char ch2 = '\u005F';
			out.println(sh2);
			out.println(ch2);
		}
		
		{
			boolean b1 = true;
			boolean a1 = false;
			
			boolean c = a1 && b1;
			c = a1 || b1;
			c = !a1;
		}
		
		{
			int x = 5; // 0101
			int y = 7; // 0111
			
			//int z = x & y;
			//int z = x | y;
			//int z = ~x;
			// x ^ y ^ y == x;
			//поменять значения 2 переменных, не задействуя третью
			x = x ^ y;
			y = x ^ y;
			x = x ^ y;
			
			int z = x ^ y;
			//out.println(z);
			out.println(x);
			out.println(y);
			
			int a = 5; //0101
			int b = a << 1; //01010
			//b = a >> 1; //0010 c учетом знака
			a = -5;
			b = a >>> 1; //0010 без учета знака
			out.println(b);
		}
		
		{
			int a = 10;
			//a = a*2;
			a *=2;
		}
		
		{
			int a;
			out.println(counter);
		}
	}

}
