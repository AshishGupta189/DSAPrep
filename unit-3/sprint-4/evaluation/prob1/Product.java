package evaluation26sep.prob1;
import java.util.*;
public class Product implements Comparable<Product>{
    String productName;
    double productPrice;

    @Override
    public String toString() {
        return
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice ;
    }

    public Product() {
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product o) {
        if(this.productPrice==o.productPrice) return 0;
        if(this.productPrice>o.productPrice) return 1;
         return -1;

    }
}
