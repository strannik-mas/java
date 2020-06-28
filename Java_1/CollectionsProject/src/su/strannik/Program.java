package su.strannik;

import java.util.*;
import java.io.*;

public class Program {
	public static void savePersons(Map<String, Integer> p) throws IOException {
		FileOutputStream fos = new FileOutputStream("persons.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Map<String, Integer> persons = new Hashtable<String, Integer>();
		persons.put("sasha", 10);
		persons.put("masha", 20);
		persons.put("sasha", 35);
		persons.put("alex", 45);
		
		/*
		 * String name = "alex"; if(persons.containsKey(name)) { int age =
		 * persons.get(name); System.out.printf("%s %d\n", name, age); }
		 */
		
		savePersons(persons);
		persons = null;
		
		persons = loadPersons();
		
		for(Map.Entry<String, Integer> p : persons.entrySet())
			System.out.printf("%s - %d\n", p.getKey(), p.getValue());
	}

	public static Map<String, Integer> loadPersons() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("persons.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Map<String, Integer> p = (Map<String, Integer>)ois.readObject();
		ois.close();
		return p;
	}

}
