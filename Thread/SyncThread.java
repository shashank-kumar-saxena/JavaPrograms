
public class SyncThread {
    static int count=0;
    public static void main(String[] args) throws InterruptedException {
        SyncThread p=new SyncThread();
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2000;i++)
                {
                    p.incre();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2000;i++)
                {
                    p.incre();
                }
            }
        },"Hello");
        t.start();

        t2.start();
        t.join();
        t2.join();;
        System.out.println(count);
    }
    public synchronized void incre(){
            count++;
    }
}
