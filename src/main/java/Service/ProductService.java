package Service;

import Interface.Filter;
import org.example.Consignment8;
import org.example.Weightable;

public class ProductService {
    public static int countByFilter(Consignment8 consignment, Filter filter) {
        int count = 0;
        for (Weightable product : consignment.getProducts()) {
            if (filter.apply(product.getName())) {
                count++;
            }
        }
        return count;
    }
}