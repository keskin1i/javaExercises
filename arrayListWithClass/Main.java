package arrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Ahmet", "Yılmaz"));
        customers.add(new Customer(2, "Mehmet", "Demir"));
        customers.add(new Customer(3, "Ali", "Veli"));
        customers.add(new Customer(4, "Veli", "Demir"));
        customers.add(new Customer(5, "Ayşe", "Yılmaz"));
        customers.add(new Customer(6, "Fatma", "Demir"));
        customers.remove(2);
        for (Customer i : customers) {
            System.out.println(i.name + " " + i.surname);
        }
    }
}
