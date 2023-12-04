package jdbcIntro;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String password="5711453Muhammed";
    private String dbUrl="jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
         return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void errorMessage(SQLException e){
        System.out.println("Hata: "+e.getMessage());
        System.out.println("Hata kodu: "+e.getErrorCode());
    }
}
