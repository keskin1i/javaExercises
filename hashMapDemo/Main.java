package hashMapDemo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("hello", "merhaba");
        sozluk.put("java", "java");
        sozluk.put("world", "dua");
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("hello"));
        for (String i : sozluk.keySet()) {
            System.out.println(i + " : " + sozluk.get(i));
        }


    }
}
