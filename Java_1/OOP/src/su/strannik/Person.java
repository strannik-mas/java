package su.strannik;

import java.io.Serializable;
import java.util.*;

public class Person implements Serializable {
	public String name = "Guest";
	public transient int age = 100;
	
	public static int counter = 0;
	
	static List<Person> persons = new ArrayList<Person>();
	
	static
	{
		counter = 0;
	}
	
	/*
	 * ��������� �����������
	 */
	public Person() {
		//super();
		this("unknown"); //����� ������������ ������ ���� 1 ����������
	}
	
	public Person(String name) {
		//this.name = name;
		this(name, 18);		//�������� ����������� � 2 �����������
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		counter++;
		
		persons.add(this);
	}
	
	public void show() {
		System.out.printf("%s - %d\n", name, age);
	}
	
	public static void showCounter() {
		System.out.printf("Total persons: %d\n", counter);
	}
	
	public static void showAll() {
		for(Person p : persons)
			p.show();
	}
}
