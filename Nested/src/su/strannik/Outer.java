package su.strannik;

public class Outer {
	public static MOperator l;
	public static MOperator l2;
	public static class Nested {
		public void updateOuterData(Outer o) {
			o.data++;
		}
	}
	
	public class Inner {
		public void updateOuterData() {
			data++;		//inner класс считает поля внешнего класса своими
		}
	}
	
	private int data = 0;

	public Outer(int data) {
		super();
		this.data = data;
	}
	
	public int getData() {
		final int k = 2;
		class Local implements MOperator{
			public void multiple() {
				data *= k;
			}
		}
		l = new Local();
		
		l2 = new MOperator() {
			
			@Override
			public void multiple() {
				data *= k;
				data -= 1000;
			}
		};
		
		
		//l.multiple();
		
		return data;
	}
}
