package su.strannik;

public class Outer {
	public static MOperator l;
	public static MOperator l2;
	
	/**
	 * модификатор доступа не может расшир€ть модификатор доступа внешнего класса
	 * @author Alex
	 *
	 */
	public static class Nested {
		public void updateOuterData(Outer o) {
			o.data++;	//получает доступ ко всем пол€м, независимо от модификатора
		}
	}
	
	/**
	 * ќбъект inner класса можно создать только при наличии внешнего класса, прив€зав его к внешнему
	 * @author Alex
	 * дл€ реализации бизнескейсов, где есть отношение один ко многим
	 * например дл€ таблиц - дл€ наборов строк (коллекци€ объектов inner классов), прив€занных к родительской таблице
	 * модификатор доступа не может расшир€ть модификатор доступа внешнего класса
	 */
	public class Inner {
		public void updateOuterData() {
			data++;		//inner класс считает пол€ внешнего класса своими, независимо от модификатора
		}
	}
	
	private int data = 0;

	public Outer(int data) {
		super();
		this.data = data;
		Nested n;	//внутри можно обращатьс€ по имени
	}
	
	public int getData() {
		final int k = 2;
		/**
		 * тоже, что и иннер клас, но scope другой
		 * хорошо реализовывать замыкани€, т.к. экземпл€р локального класса сохран€ет контекст, в рамках которого он создан
		 * ограничени€:  должны быть финализированы переменные, используемые в замыкании
		 * модификаторы доступа писать Ќ≈Ћ№«я
		 * @author Alex
		 *
		 */
		class Local implements MOperator{
			public void multiple() {
				data *= k;
			}
		}
		l = new Local();
	
		/**
		 * анонимный класс - тоже, что и локальный, если не нужно создавать другие объекты этого класса
		 */
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
