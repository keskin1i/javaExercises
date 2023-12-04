package jdbcIntro;

import staticDemo.DataBaseHelper;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    static String userName="root";
    static String password="5711453Muhammed";
    static String dbUrl="jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
      Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
      try{

          connection= dbHelper.getConnection();

          statement=connection.prepareStatement("Update city set population=700000 where id=4080");
        int result= statement.executeUpdate();
          System.out.println("Güncelleme sonucu: "+result);

      }catch (SQLException e){
          System.out.println(e.getMessage());
      }finally {
          statement.close();
         connection.close();
      }
        
    }
   /* Connection connection=null;
    DbHelper dbHelper=new DbHelper();
    Statement statement=null;
    ResultSet resultSet;
      try{

        connection= dbHelper.getConnection();
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select code,name,continent,region from country");
        ArrayList<Country> countries=new ArrayList<>();
        while(resultSet.next()){
            countries.add(new Country(
                    resultSet.getString("code"),
                    resultSet.getString("name"),
                    resultSet.getString("continent"),
                    resultSet.getString("region")));
        }
        System.out.println(countries.size());
    }catch (SQLException e){
        System.out.println(e.getMessage());
    }finally {
        try {
            connection.close();
        } catch (SQLException e) {

            dbHelper.errorMessage(e);
        }
        }*/
    public static void insertData() throws SQLException {
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        try{

            connection= dbHelper.getConnection();

            statement=connection.prepareStatement("insert into city(name,countrycode,district,population) values('Düzce','TUR','Düzce',50000)");
            int result= statement.executeUpdate();
            System.out.println("insert edildi");

            ArrayList<Country> countries=new ArrayList<>();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            statement.close();
            connection.close();
        }
    }
    }



