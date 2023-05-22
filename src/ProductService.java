import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getAllProduct() {
        return productList;
    }

    public Product getProduct(String name) {
        for (Product p : productList) {
            if (name.equalsIgnoreCase(p.getProduct_name().toLowerCase()) || name.equals(Integer.toString(p.getId())))
                return p;

        }
        return null;
    }
}
