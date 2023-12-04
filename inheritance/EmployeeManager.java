package inheritance;

public class EmployeeManager extends PersonManager{
    //PersonManager'den miras alır
    public void bestEmployee(){
        System.out.println("Best Employee");
    }
}
