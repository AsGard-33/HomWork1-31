package HomeWorkAIT.lesson27;

public class Product {
    private String name;
    private  double price;
    private  int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getInfo(){
        return "product information: " + getName() + " Stoimost: " + getPrice() + " Kolichestvo: " + getQuantity();
    }

}
