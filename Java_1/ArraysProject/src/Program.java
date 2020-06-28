/**
 * 
 */

import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;

/**
 * @author Alex
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
		/*
		int sz = 3;
		//int[] m = new int[sz];
		//int[] m = new int[] {23, 56, 78};
		int[] m = {23, 56, 78};
		
		m[0] = 12;
		m[1] = 34;
		out.println(m.length);
		out.println(m[2]);
		
		String[] names = {"zzz", "ddd", "nnn", "aaa"};
		Arrays.sort(names);
		
		for(int i=0; i <names.length; i++)
			out.println(names[i]);
		
		//многомерный массив
		int[][] matrix = 
			{
					{1, 2, 3},
					{4,5,6}
			};
		
		for(int i=0; i <matrix.length; i++)
		{
			for(int j=0; j <matrix[i].length; j++)
				out.println(matrix[i][j]);
		}*/
		/*
		int a = 10;
		int b = a;
		a = 11;
		
		int[] a = {10};
		//int[] b = a;
		int[] b = a.clone();
		a[0] = 11;
		out.printf("a = %d\nb = %d\n", a[0], b[0]);*/
		}
	
		{
			List<String> persons = new ArrayList<String>();
			
			persons.add("casha");
			persons.add("casha2");
			persons.add("casha3");
			persons.add("casha4");
			
			persons.set(2, "sss");
			/*
			 * Collections.sort(persons); Collections.reverse(persons); if
			 * (persons.contains("sss")) { for (int i=0; i < persons.size(); i++) {
			 * out.println(persons.get(i)); } }
			 */
			
			Collection<String> names = persons;
			/*
			 * Iterator<String> iter = names.iterator(); while(iter.hasNext()) { String name
			 * = iter.next(); out.println(name); }
			 */
			for(String name : names)
				out.println(name);
		}
	}
}
