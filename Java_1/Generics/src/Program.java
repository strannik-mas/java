
public class Program {

	public static void main(String[] args) {
		ReadonlyStorage<String> s1 = new ReadonlyStorage<String>("dfdfdf");
		ReadonlyStorage<Integer> s2 = new ReadonlyStorage<Integer>(5);
		ReadonlyStorage<Double> s3 = new ReadonlyStorage<Double>(5D);
		//ReadonlyStorage s4 = new ReadonlyStorage("nnn");
		//ReadonlyStorage<Object> s5 = new ReadonlyStorage<Object>(5D);
		
		System.out.println(s1.getData());
		System.out.println(s2.getData());
		System.out.println(s3.getData());
	}

}
