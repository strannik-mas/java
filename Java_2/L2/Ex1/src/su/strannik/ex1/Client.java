package su.strannik.ex1;

public class Client implements TaskListener, Runnable{
	private String name;
	private boolean work = false;
	
	public Client(String name) {
		// TODO Auto-generated constructor stub thread.start()
		this.name = name;
		(new Thread(this)).start();
	}

	@Override
	public void start(TaskData ev) {
		System.out.println("Task " + name + " date: " + ev.getDate() + " started!");
		work = true;
		synchronized (this) {
			notify();
		}
	}

	@Override
	public void stop(TaskData ev) {
		System.out.println("Task " + name + " date: " + ev.getDate() + " finished!");
		work = false;
	}

	@Override
	public void run() {
		try {
			synchronized (this) {
				while (!work) {
					wait();
				}
			}
			while (work) {
				System.out.println("works...");
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("ends...");
		}		
	}

}
