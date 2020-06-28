package su.strannik;

public class Outer {
	public static MOperator l;
	public static MOperator l2;
	
	/**
	 * ����������� ������� �� ����� ��������� ����������� ������� �������� ������
	 * @author Alex
	 *
	 */
	public static class Nested {
		public void updateOuterData(Outer o) {
			o.data++;	//�������� ������ �� ���� �����, ���������� �� ������������
		}
	}
	
	/**
	 * ������ inner ������ ����� ������� ������ ��� ������� �������� ������, �������� ��� � ��������
	 * @author Alex
	 * ��� ���������� ������������, ��� ���� ��������� ���� �� ������
	 * �������� ��� ������ - ��� ������� ����� (��������� �������� inner �������), ����������� � ������������ �������
	 * ����������� ������� �� ����� ��������� ����������� ������� �������� ������
	 */
	public class Inner {
		public void updateOuterData() {
			data++;		//inner ����� ������� ���� �������� ������ ������, ���������� �� ������������
		}
	}
	
	private int data = 0;

	public Outer(int data) {
		super();
		this.data = data;
		Nested n;	//������ ����� ���������� �� �����
	}
	
	public int getData() {
		final int k = 2;
		/**
		 * ����, ��� � ����� ����, �� scope ������
		 * ������ ������������� ���������, �.�. ��������� ���������� ������ ��������� ��������, � ������ �������� �� ������
		 * �����������:  ������ ���� �������������� ����������, ������������ � ���������
		 * ������������ ������� ������ ������
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
		 * ��������� ����� - ����, ��� � ���������, ���� �� ����� ��������� ������ ������� ����� ������
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
