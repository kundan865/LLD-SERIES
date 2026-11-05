package lecture5_6_SOLID_DESIGN.OCP.violated;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    List<Product> getProducts() {
        return products;
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }
}
