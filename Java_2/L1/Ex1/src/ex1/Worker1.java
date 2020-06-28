package ex1;

public class Worker1 extends Thread {
	private int id;
	private Data data;
	public Worker1(int id, Data d) {
		this.id = id;
		this.data = d;
		this.start();
	}
	@Override
	public void run() {
		synchronized (data) {			
			for(int i=0; i < 5; i++) {
				try {
					while (id != data.getState()) {
						data.wait();
					}
//					if(id == data.getState()) {
						if (id == 1)
							data.Tic();
						else {
							data.Tak();
						}
						data.notify();
//					}
					/*
					 * if(i < 4) data.wait();
					 */
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
