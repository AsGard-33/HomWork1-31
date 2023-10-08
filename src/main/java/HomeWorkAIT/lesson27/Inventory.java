package HomeWorkAIT.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements InventoryManagement {
    private List<Product> productList = new ArrayList<>();
    @Override
    public void restock(Product product, int quantity) {
        int currentQuantity = product.getQuantity();
        product.setQuantity(currentQuantity + quantity);
    }

    @Override
    public void sell(Product product, int quantity) {
        int currentQuantity = product.getQuantity();
        if (currentQuantity >= quantity) {
            product.setQuantity(currentQuantity - quantity);
            System.out.println("Produkt" + product.getName() + " dostatochno dlya prodagi");
        } else {
            System.out.println("Nedostatochnoe colichestvo produkta: " + product.getName());
        }

    }

    public void sell(String productName){
        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                sell(product, 1);
                return;
            }
        }
        System.out.println("Tovar s imenem " + productName + " ne najden.");

    }
    public void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product.getInfo());
        }
    }
}
