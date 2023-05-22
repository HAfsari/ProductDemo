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
        String vname = pname.toLowerCase();
        for(Product p : productList){
            String lname = p.getProduct_name().toLowerCase();
            String lid = Integer.toString(p.getId());
            if(vname.equals(lname) || pname.equals(lid))
                return p;

        } return null;
    }
}
