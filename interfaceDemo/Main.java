package interfaceDemo;

public class Main {
    public static void main(String[] args) {

       Worker worker = new Worker("Muhammed","Yemekler yendi","Maaşlar alındı.");
        System.out.println(worker.getWorkable());
        System.out.println(worker.getEatable());
        System.out.println(worker.getPayable());
        worker.work();
    }
}
