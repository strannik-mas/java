
public class Program {

	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		try {
			db.executeCommand();
		}finally {
			db.close();
		}	
		
	}

}
