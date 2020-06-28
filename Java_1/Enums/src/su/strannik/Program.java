package su.strannik;
import static java.lang.System.out;
public class Program {
	/**
	 * class Colors extends Enum<Colors>{}
	 *
	 */
	enum Colors {
		red, green, blue;
		private Colors() {
			
		}
		public static final Colors DEFAULT = Colors.green;
		public void show() {
			out.println(this.name().toUpperCase());
		}
	}
	
	public static void main(String[] args) {
		Colors c1 = Colors.red;
		out.println(c1.name());
		out.println(c1.ordinal());
		int n = c1.ordinal();
		
		Colors c2 = Colors.values()[(n+1)];
		out.println(c2.name());
		
		Colors c3 = Colors.valueOf("blue");
		out.println(c3);
		
		c3.show();
	}

}
