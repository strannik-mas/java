package su.strannik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

	public static void main(String[] args){
		Person p2 = new Person("abc", 18);
		System.out.println(p2);
		p2 = null;
		
		System.gc();
		
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sergey", 35));
		persons.add(new Person("Sanya", 5));
		persons.add(new Person("Ecksa", 25));
		persons.add(new Person("Mosla", 33));
		
		//Collections.sort(persons);
		Collections.sort(
			persons,
			new Comparator<Person>()
			{

				@Override
				public int compare(Person p1, Person p2) {
					return p1.name.compareTo(p2.name);
				}
				
			}
		);
		
		for(Person p : persons)
			System.out.println(p);
		
		
		Collections.sort(
				persons,
				new Comparator<Person>()
				{

					@Override
					public int compare(Person p1, Person p2) {
						return p1.age - p2.age;
					}
					
				}
			);
			
			for(Person p : persons)
				System.out.println(p);
	}

}
