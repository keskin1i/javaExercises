package polymorphismDemo;

public class ConseoleLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Default console log: " + message);
    }
}
