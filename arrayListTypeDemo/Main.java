package arrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // <String>
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Ahmet");
        list.add("Zeynep");
        list.add("Ceyda");
        list.remove("Veli");
        Collections.sort(list);
        for (String i:list) {
            System.out.println(i);
        }
    }
}
