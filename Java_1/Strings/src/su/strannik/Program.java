/**
 * 
 */
package su.strannik;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Alex
 *
 */
public class Program {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		{
			/*
			 * String s1 = "asdf;lkj"; String s2 = new String("Привед");
			 * 
			 * String hello = "Прувед"; String name = "Sanya"; String res = hello +
			 * name.toUpperCase();
			 * 
			 * char ch = s1.charAt(2); out.println(s1); out.println(ch); out.println(s2);
			 * out.println(res); out.println(name);
			 * 
			 * 
			 * String r = ""; for(int i=1; i<=100; i++) r += String.valueOf(i) + ' ';
			 * 
			 * StringBuilder sb = new StringBuilder(); for(int i=1; i<=100; i++)
			 * sb.append(i).append(" "); String r = sb.toString(); out.println(r);
			 * 
			 * Scanner sc = new Scanner(System.in); out.print("Введите строку"); String s =
			 * sc.nextLine();
			 * 
			 * String s22 = "Sasha";
			 * 
			 * out.println(s);
			 * 
			 * boolean rs = (s.equals(s22));
			 * 
			 * out.println(rs);
			 */
		}

		{
			/*
			String s1 = "Привет";
			//String s1 = new String("Привет");
			//String s1 = "При" + "вет";
			String s3 = "вет";
			//String s2 = "Привет";
			String s2 = "При" + s3;
			boolean rs = (s1 == s2);
			out.println(rs);
			*/
		}
		
		{
			/*
			int a=5;
			int b=7;
			out.printf("a = %5d \nb=%d", a, b);
			
			String name = "Sanya";
			String r = String.format("Привет, %s!", name);
			out.println(r);
			
			double d = 5D/2;
			out.printf("d = %-10.2f\n", d);
			*/
		}
		
		{
			/*
			Date now = new Date();
			out.printf("%1$Ty-%1$tB-%1$td", now);
			*/
		}
		
		{
			/*
			BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in)
					);
			
			String s  = reader.readLine();
			
			int x = Integer.parseInt(s);
			
			Scanner sc = new Scanner(System.in);
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			out.printf("x1 = %d, x2 = %d", x1, x2);
			sc.close();
			//out.println(x);
			out.printf("введи температуру в градусах цельсия\n");
			Scanner sc = new Scanner(System.in);
			double x1 = sc.nextDouble();
			double x2 = x1*9/5+32;
			out.printf("\nградусы фаренгейта: %.2f", x2);*/
		}
	}

}
