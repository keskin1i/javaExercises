package polymorphismDemo;

public class CustomerMenager {
    private BaseLogger loggers;

    public CustomerMenager(BaseLogger loggers) {
        this.loggers = loggers;
    }

    public BaseLogger getLoggers() {
        return loggers;
    }

    public void setLoggers(BaseLogger loggers) {
        this.loggers = loggers;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.loggers.log("log mesajı");
    }
}
