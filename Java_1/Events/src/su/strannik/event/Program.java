package su.strannik.event;

import static java.lang.System.out;

public class Program {
	
	public static void fire(Object sender) {
		out.println("FIRe static !!!");
	}

	public static void main(String[] args) {
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		Radio radio = new Radio();
		
		//event subscribe
//		sw.consumer = lamp;
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(lamp);
		sw.addElectricityListener(radio);
		
		/*
		 * class Fire implements ElectricityConsumer {
		 * 
		 * @Override public void electricityOn() { out.println("�����"); }
		 * 
		 * }
		 */
		
//		sw.addElectricityListener(new Fire());
		/*
		 * sw.addElectricityListener(new ElectricityConsumer() {
		 * 
		 * @Override public void electricityOn() { out.println("�����"); } });
		 */
		/*
		sw.addElectricityListener(
		
		 * ()-> { out.println("Fire"); }
		 
				()->out.println("Fire")
		);*/
		
		final String message = "AAA �������!";	//����� final �� ������
		
		sw.addElectricityListener(sender-> out.println("FIRE@@22~!"));
		sw.addElectricityListener(sender-> {
			out.println("FIRE@@22~!" + message);
			out.println("FIRe!");
		});
		
		sw.addElectricityListener(sender-> out.println(message));
//		sw.addElectricityListener(sender-> Program.fire(sender));
		sw.addElectricityListener(Program::fire);	//���� ��������� ������ � �������� ��������� � ����������� ������-���������
		
		
		
		sw.switchOn();
	}

}
