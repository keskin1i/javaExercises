package prod;

public class ProductMeneger {
public void add(Product product) {
    //jdbc
    System.out.println("Urun eklendi : " + product.getName()+" "+product.getDescription());
}
}
