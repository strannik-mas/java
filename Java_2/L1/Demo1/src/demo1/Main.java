package demo1;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final MyThread1 mt = new MyThread1();
		MyThread2 omt = new MyThread2();
		mt.setDaemon(true);	//убивает поток, но не сразу - когда дадут процессорное время
		
		System.out.println(mt.isDaemon());
		System.out.println(omt.thread.isDaemon());
		mt.start();
		omt.thread.start();
                
//		new Thread() {
//@Override public void run()
//			{
//				for (int i = 0; i < 30; i++)
//					System.out.println("Name = " + Thread.currentThread().getName() +
//							", i = " + i);
//			}
//		}.start();

		//mt.join();
		//omt.thread.join();
		Thread.sleep(100);
		//omt.thread.interrupt();	//ничего не меняет - только установка cancel
		omt.cancel = true;
                
                System.out.println("end of main");
	}

}
