package su.strannik.ex1;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		TaskManager tm = new TaskManager();
		Client cl1 = new Client("Deleate all_1");
		Client cl2 = new Client("Deleate all_2");
		Client cl3 = new Client("Deleate all_3");
		
		tm.addTaskListener(cl1);
		tm.addTaskListener(cl2);
		tm.addTaskListener(cl2);
		tm.addTaskListener(cl3);
		
		tm.works();
		
		tm.removeTaskListener(cl1);
		tm.removeTaskListener(cl2);
		tm.removeTaskListener(cl2);
		tm.removeTaskListener(cl3);
	}

}
