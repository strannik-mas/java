package su.strannik.event;

public class Lamp implements ElectricityConsumer {
	public void lightOn() {
		System.out.println("����� ��������");
	}

	@Override
	public void electricityOn(Object sender) {
		lightOn();
	}
}
