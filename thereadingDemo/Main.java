package thereadingDemo;

public class Main {
    public static void main(String[] args) {

        KronometreThread kronometreThread = new KronometreThread("Thread 1");
        kronometreThread.start();
        KronometreThread kronometreThread2 = new KronometreThread("Thread 2");
        kronometreThread2.start();
        KronometreThread kronometreThread3 = new KronometreThread("Thread 3");
        kronometreThread3.start();
    }
}
