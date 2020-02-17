package su.strannik;

public class Lamp implements Electricity{

	@Override
	public void onElectricity() {
		System.out.println("Лампа зажглась!");
	}

}
