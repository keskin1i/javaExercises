package staticDemo;

public class Main {
    public static void main(String[] args) {

        ProductMenager productMenager = new ProductMenager();
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.price = 5000;
        productMenager.add(product);


        DataBaseHelper.Crud.update();
        DataBaseHelper.Connection.createConnection();

    }
}
