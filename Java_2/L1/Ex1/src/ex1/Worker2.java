package ex1;

public class Worker2 extends Thread {
	private int id;
	private Data data;
	public Worker2(int id, Data d) {
		this.id = id;
		this.data = d;
		this.start();
	}
	@Override
	public void run() {	
			for(int i=0; i < 5; i++) {
				synchronized (data) {	
					try {	
						data.notify();
						while (id != data.getState()) {
							data.wait();
						}
						if (id == 1)
							data.Tic();
						else if (id == 2) {
							data.Tak();
						} else {
							data.Tok();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						data.notify();
					}
				}
			}
	}

}
