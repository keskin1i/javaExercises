package abstractDemo;

public class MySqlMenager extends BaseDatabaseMenager {
    @Override
    public void getData() {
        System.out.println("Veri getirildi: MySql");
    }
}
