import static java.lang.System.out;

public class DBConnection {
	public DBConnection() {
		out.println("Open connection");
	}
	
	public void executeCommand() {
		out.println("Executing command...");
	}
	
	private boolean isClosed = false;
	public void close() {
		if (! isClosed) {
			out.println("Close connection");
			isClosed = true;
		}
			
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		close();
	}
}
