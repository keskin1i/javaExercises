package polymorphismDemo;

public class DataBaseLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Default log Database: " + message);
    }
}
