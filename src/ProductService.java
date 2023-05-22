import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> productList = new ArrayList<>();
    public void addProduct(Product p) {
        productList.add(p);
    }

    public List<Product> getAllProduct() {
        return productList;
    }
}
