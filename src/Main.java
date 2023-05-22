import java.util.List;

public class Main {
    public static void main(String[] args) {

ProductService productService = new ProductService();


productService.addProduct(new Product(1,"Dell Laptop","Laptop","Self-1",2023));
productService.addProduct(new Product(1,"HP Laptop","Laptop","Self-2",2024));

      //  List<Product> products = productService.getAllProduct();

   for(Product p : productService.productList){
       System.out.println(p);
   }

    }
}
