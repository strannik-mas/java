package su.strannik;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Class.forName("su.strannik.Person");
		//System.out.println(Person.counter);
		Person.showCounter();
		Person p;
		p = new Person("Алекс", 55);
		Person p3 = new Person();
		/*
		 * p.name = "Алекс"; p.age = 55;
		 */
		
		Person p2 = new Person("pasldkfj", 150);
		/*
		 * p2.name = "ppap"; p2.age = 5555;
		 
		p2.show();
		p3.show();
		
		p.show();
		//System.out.println(Person.counter);
		Person.showCounter();*/
		
		Person.showAll();
		
	}

}
