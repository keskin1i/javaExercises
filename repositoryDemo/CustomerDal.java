package repositoryDemo;

public class CustomerDal implements IEntitiyRepository<Customer> {


    @Override
    public void add(Customer entity) {
        System.out.println("Saved to db : " );
    }

    @Override
    public void update(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }
}
