import static java.lang.System.out;
public class Program {
	public static final int MAX = 1000; 		//константа в java

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		metka:			//метка перехода (выход из того цикла, который помечен меткой)
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				int nm = i*j;
				out.printf("%4d", nm);
				if (j == 5) break metka;
			}
			out.println();
		}
	out.println();
	
		int c = 1;
		do {
			out.println(c); c*=2;
		}while(c<1000);
		/*
		 * while(c<1000) { out.println(c); c*=2; }
		 */
		
	}

}
