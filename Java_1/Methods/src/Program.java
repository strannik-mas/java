import static java.lang.System.out;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;

public class Program {
	
	
	public static double average(int x, int y) {
		double avg = (x+y)/2D;
		return avg;
	}
	
	public static double average2(int[] m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		return (double)summa/m.length;
	}
	
	public static double average3(int... m) {
		int summa = 0;
		for(int k : m)
			summa += k;
		return (double)summa/m.length;
	}
	
	public static void sayHello() {
		out.println("Hello");
	}
	
	
	
	public void sayHello2() {
		out.println("Hello2");
	}
	
	public void sayHello22() {
		sayHello22("Stranger");
	}
	
	public void sayHello22(String name) {
		out.printf("Hello2, %s.\n", name);
	}
	
	public void sayHello3(String name, int age) {
		out.printf("Hello2, %s. Your age %d\n", name, age);
	}

	static void test1(int a) {
		a++;
		out.printf("test 1 a = %d\n", a);
	}
	
	static void test2(int[] a) {
		a[0]++;
		out.printf("test 1 a = %d\n", a[0]);
	}
	
	public static List<String> sortName(String... names){
		List<String> persons = Arrays.asList(names);
		Collections.sort(persons);
		return persons;
	}
	
	public static void main(String[] args) {
		//sayHello();
		/*
		 * Program.sayHello(); Program p = new Program(); p.sayHello2();
		 
		Program p = new Program();
		p.sayHello22();
		
		p.sayHello3("sasha", 35);
		out.println(average(10, 20));
		out.println(average2(new int[] {10, 20, 30}));
		out.println(average3(10, 20, 30, 30));
		int a = 10;
		test1(a);
		out.printf("main 1 a = %d\n", a);
		int[] a = {10};
		test2(a);
		out.printf("main 1 a = %d\n", a[0]);*/
		
		List<String> personsRes = sortName("Вася", "Алекс", "Петя", "Аня");
		for(String name : personsRes)
			out.println(name);
		/*
		 * for (int i=0; i < personsRes.size(); i++) { out.println(personsRes.get(i)); }
		 */
	}

}
