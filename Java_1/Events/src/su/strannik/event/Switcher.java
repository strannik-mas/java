package su.strannik.event;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	private List<ElectricityConsumer> listeners = new ArrayList<>();
	
	/**
	 * �������� �� �������
	 * @param listener
	 */
	public void addElectricityListener(ElectricityConsumer listener) {
		listeners.add(listener);
	}
	
	/**
	 * ������� �� �������
	 * @param listener
	 */
	public void removeElectricityListener(ElectricityConsumer listener) {
		listeners.remove(listener);
	}
	
	public void switchOn() {
		System.out.println("����������� �������");
		
		/* if (consumer != null) { consumer.electricityOn(); } */
		 for(ElectricityConsumer c : listeners) {
			 c.electricityOn(this);
		 }
	}
}
