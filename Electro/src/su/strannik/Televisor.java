package su.strannik;

public class Televisor implements Electricity {

	@Override
	public void onElectricity() {
		System.out.println("Телевизор вкл!");
	}

}
