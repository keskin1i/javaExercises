package thereadingDemo;

public class KronometreThread implements Runnable{
    private Thread t;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating : " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running : " + threadName);

            try {
                for(int i=0;i<10;i++){
                    System.out.println("Thread : " + threadName + ", " + i);}
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());


        }
        System.out.println("Thread " + threadName + " exiting.");


    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
