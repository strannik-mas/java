package demo1;

public class MyThread2 implements Runnable {
	public Thread thread;
	public volatile boolean cancel = false;		//volatile - для компилятора, чтобы он не убирал if

	public MyThread2()
	{
		thread = new Thread(this);
	}

	@Override
	public void run() {
		try {
			double d = 9999.0;
			for (int i = 0; i < 30; i++) {
				if (cancel) {
					//return;		//для завершения потока
					throw new InterruptedException();
				}
				for (int j = 0; j < 1000000; j++)
					d = d*d/d;
				System.out.println("Name = " + Thread.currentThread().getName() +
						", i = " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
