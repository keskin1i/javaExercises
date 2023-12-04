package staticDemo;

public class DataBaseHelper {
    public static class Crud {

        public void add() {
            System.out.println("Veritabanına eklendi");
        }
        public static void update() {
            System.out.println("Veritabanına güncellendi");
        }
        public void delete() {
            System.out.println("Veritabanından silindi");
        }
    }
    public static class Connection {
        public static void createConnection() {
            System.out.println("Bağlantı kuruldu");
        }
    }
}
