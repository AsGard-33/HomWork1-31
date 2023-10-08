package HomeWorkAIT.lesson31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();




    //Dobovlyaet produkti v korzinu
    void addProduct(Product product){
        products.add(product);
    }
    //Udalyaet produkti s korziny
    void removeProduct(int id){
        products.removeIf(product -> product.getId() ==id);

    }
    //raschet obshej stoimosti v korzine
    double calculateTotal(){
        double  total = 0;
        for (Product product : products){
            total += product.getPrice();
        }
        return total;

    }
    //Otobragenije sodergimogob korziny
    void displayCartContents(){
        for (Product product : products){
            product.displayInfo();
        }

    }
    void sortByPrice(){
        Comparator<Product> nameComporator = Comparator.comparing(Product :: getPrice);
        Collections.sort(products,nameComporator);
        Collections.reverse(products);

    }
    void sortByName(){
        Comparator<Product> nameComporator = Comparator.comparing(Product :: getName);
        Collections.sort(products,nameComporator);
        Collections.reverse(products);


    }
    void sortById(){
        Comparator<Product> nameComporator = Comparator.comparing(Product :: getId);
        Collections.sort(products,nameComporator);


    }

}
