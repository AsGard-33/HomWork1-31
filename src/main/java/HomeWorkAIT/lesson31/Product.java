package HomeWorkAIT.lesson31;

public class Product {
    private int id;
    private  String  name;
    private float price;
    private String description;


    public Product(int id, String name, float price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;

    }

    void displayInfo() {
        System.out.println("id: " + id + " ,nazvanie produkta: " + name + " ,stoimost: " + price + ", opisanie produkta: " + description );
    }
    void applyDiscount(double percentage){
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
        } else {
            System.out.println("nevernoe znachenije.");
        }

    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
