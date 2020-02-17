
public class ReadonlyStorage<MyType extends Comparable<? super MyType>> {
//public class ReadonlyStorage<MyType> {
	private MyType data;

	public ReadonlyStorage(MyType data) {
		super();
		this.data = data;
	}

	public MyType getData() {
		return data;
	}
	
	
}
