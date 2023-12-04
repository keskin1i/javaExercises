package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        CustomerMenager customerMenager = new CustomerMenager();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();
    }
}
