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

    public Product getProduct(String pname){
              for(Product p : productList){
            if(pname.equalsIgnoreCase(p.getProduct_name().toLowerCase()) || pname.equals(Integer.toString(p.getId())) )
                return p;

        } return null;
    }
}
