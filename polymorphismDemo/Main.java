package polymorphismDemo;

public class Main {
    public static void main(String[] args) {

    /*  BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(),new ConseoleLogger()};
      for (BaseLogger logger: loggers){
          logger.Log("Log mesajı");
      }*/

        CustomerMenager customerMenager = new CustomerMenager(new DataBaseLogger());
        customerMenager.add();

    }
}
