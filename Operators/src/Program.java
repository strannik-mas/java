import static java.lang.System.out;
import java.util.Scanner;

public class Program {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int a = -1000;
		
		if (a > 0) {
			out.println("a>0");
			out.println("a more 0");
		}
		else {
			if (a < -100)
				out.println("a<-100");
			else
				out.println("a<0");
		}
		
		int n = 2;
		String s;
		s = n==0 ? "zero" : "no zero";
		out.println(s);
		
		int n =20;
		switch(n) {
		case 1:
			out.println("one");
			break;
		case 2:
			out.println("two");
			break;
		case 3:
			out.println("three");
			break;
			default:
				out.println("lazha");
		}
		*/
		Scanner sc = new Scanner(System.in); out.println("Введите сколько ворон"); 
		int s = sc.nextInt();
		String end = "";
		int s3 = s % 100;
		if (s3 <= 20 && s3 >= 11) {
			end = "";
		}else {
			int s2 = s % 10;
			switch(s2) {
			case 1:
				end = "а";
				break;
			case 2:
			case 3:
			case 4:
				end = "ы";
				break;
			}
		}
		out.printf("На ветке %d ворон%s", s, end);
	}
}
