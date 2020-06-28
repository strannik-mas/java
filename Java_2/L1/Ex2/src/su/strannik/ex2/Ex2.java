package su.strannik.ex2;

class Data
{
    int count =0;
    static int countSt =0;
}

class MyThread implements Runnable {
  
	private final Object synk = new Object();	// для синхронизации внутренних данных
    Data obj;
    
    MyThread(Data d){
        obj = d;
        new Thread(this).start();
    }
    /*synchronized перед методом ничего не даст, т.к. использует другой объект*/
    void Add(){
        try {
            synchronized (obj) {
            	Thread.sleep(10);
                int n=obj.count;
                n++;
                Thread.sleep(10);
                obj.count=n;
			}
        } catch (InterruptedException ex) {       }
    }
    synchronized static void AddStatic() {
                try {
            Thread.sleep(10);
            int n=Data.countSt;
            n++;
            Thread.sleep(10);
            Data.countSt=n;
        } catch (InterruptedException ex) {       }
    }
    public void run() {
        for(int i=0; i<10; i++) Add();
        for(int i=0; i<10; i++) AddStatic();
    }
}

public class Ex2 {

    public static void main(String[] args) throws Exception {
        Data d=new Data();
        MyThread t1=new MyThread(d);
        MyThread t2=new MyThread(d);

        Thread.sleep(1000);
        System.out.println(d.count);
        System.out.println(Data.countSt);    }

}
