package su.strannik.event;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
	private List<ElectricityConsumer> listeners = new ArrayList<>();
	
	/**
	 * подписка на событие
	 * @param listener
	 */
	public void addElectricityListener(ElectricityConsumer listener) {
		listeners.add(listener);
	}
	
	/**
	 * отписка от события
	 * @param listener
	 */
	public void removeElectricityListener(ElectricityConsumer listener) {
		listeners.remove(listener);
	}
	
	public void switchOn() {
		System.out.println("Выключатель включен");
		
		/* if (consumer != null) { consumer.electricityOn(); } */
		 for(ElectricityConsumer c : listeners) {
			 c.electricityOn(this);
		 }
	}
}
