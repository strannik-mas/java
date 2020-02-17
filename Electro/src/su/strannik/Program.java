package su.strannik;

public class Program {
	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		Televisor tv = new Televisor();
		
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(tv);
		
		sw.addElectricityListener(
				new Electricity() {
					
					@Override
					public void onElectricity() {
						System.out.println("Всё накрылось!");
					}
				}
		);
		
		sw.switchOn();
	}
}
