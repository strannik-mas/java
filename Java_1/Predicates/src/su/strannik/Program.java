package su.strannik;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Sergey", 38));
		persons.add(new Person("Dasha", 41));
		persons.add(new Person("Glasha", 2));
		persons.add(new Person("Sasha", 37));
		persons.add(new Person("Anna", 18));
		persons.add(new Person("asldfjk", 17));
		
		//императивный подход
		/*
		 * for(Person person : persons) { System.out.println(person); }
		 */
		
		int summa = 0;
		int adultPersons = 0;
		for(Person p: persons)
			if (p.getAge() >= 18) {
				summa += p.getAge();
				adultPersons++;
			}
		
		double averageAge = (double) summa/adultPersons;
		System.out.println(averageAge);
		
		//декларативный подход
//		persons.stream().forEach(person-> System.out.println(person));
//		persons.stream().forEach(System.out::println);
		
		/*
		 * persons.stream().filter(p->{ return p.getAge() >= 18;
		 * }).forEach(System.out::println);
		 */
		
//		persons.stream().filter(p->p.getAge() >= 18).forEach(System.out::println);
		
//		persons.stream().filter(p->p.getAge() >= 18).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);
		
		/*
		 * persons.stream().filter(p->p.getAge() >= 18).sorted((p1, p2) ->
		 * p1.getName().compareTo(p2.getName())) .map(p -> p.getName())
		 * .forEach(System.out::println);
		 */
		
		//средний возраст
		double averageAge2 = persons.stream()
		.filter(p->p.getAge() >= 18)
		.mapToInt(p -> p.getAge()).average().getAsDouble();
		System.out.println(averageAge2);
	}

}
