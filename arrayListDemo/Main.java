package arrayListDemo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList arrayList = new ArrayList();
       arrayList.add(1);
       arrayList.add(2);
       arrayList.add(3);
       arrayList.add(4);
       arrayList.add("isim");
        //System.out.println(arrayList.size());
        arrayList.set(0,11);
        System.out.println(arrayList.get(0));
        for (Object i : arrayList) {
            System.out.println(i);

        }
    }
}
