package ex1;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {

        Data    d = new Data();
		/*
		 * Worker1 w2=new Worker1(2, d); Worker1 w1=new Worker1(1, d);
		 */
        Worker2 w1=new Worker2(1, d);
        Worker2 w2=new Worker2(2, d);
        Worker2 w3=new Worker2(3, d);

        w3.join();
        System.out.println("end of mian...");
    }
}
