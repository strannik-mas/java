package su.strannik;

public class BoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int data;
	
	public BoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public BoundException(String arg0, int data) {
		super(arg0);
		this.data = data;
	}

	public int getData() {
		return data;
	}

}
