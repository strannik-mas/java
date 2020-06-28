package su.strannik;

public class Person implements Comparable<Person> {
	public String name = "Guest";
	public int age = 100;
	
	public static int counter = 0;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s - %d", name, age);
	}

	@Override
	public int compareTo(Person o) {
		
		//return this.name.compareTo(o.name);
		return this.age - o.age;
	}
}
