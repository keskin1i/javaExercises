package prod;

public class Main {
    public static void main(String[] args) {


        Product product = new Product(2,"laptop","asus laptop",5000,3);
       // product = new Product();
        product.setId(1);
        product.setName("laptop");
        product.setDescription("asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductMeneger productMeneger = new ProductMeneger();
        productMeneger.add(product);


    }
}
