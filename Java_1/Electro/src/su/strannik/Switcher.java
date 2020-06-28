package su.strannik;

import java.util.*;

public class Switcher {
	private List<Electricity> listeners = new ArrayList<Electricity>();
	
	public void addElectricityListener(Electricity listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeElectricityListener(Electricity listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
	
	public void switchOn() {
		for(Electricity listener : listeners) {
			listener.onElectricity();
		}
	}
}
