package interfaceDemo;

public class Worker implements IWorkable, IEatable, IPayable {

    private String workable;
    private String eatable;
    private String payable;

    public Worker(String workable, String eatable, String payable) {
        this.workable = workable;
        this.eatable = eatable;
        this.payable = payable;
    }

    //our worker class
    @Override
    public void work() {
        System.out.println("I can work");
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void pay() {
        System.out.println("I can pay");
    }

    public String getWorkable() {
        return workable;
    }

    public void setWorkable(String workable) {
        this.workable = workable;
    }

    public String getEatable() {
        return eatable;
    }

    public void setEatable(String eatable) {
        this.eatable = eatable;
    }

    public String getPayable() {
        return payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }
}
