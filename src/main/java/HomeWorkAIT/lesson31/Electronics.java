package HomeWorkAIT.lesson31;

public class Electronics extends Product{
    private String brand;
    private int warrantyPeriod;

    public Electronics(int id, String name, float price, String description, String brand, int warrantyPeriod) {
        super(id, name, price, description);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    void displayInfo() {
        System.out.println("id: " + getId() + " ,nazvanie produkta: " + getName() + " ,stoimost: " +
                getPrice() + " $, opisanie produkta: " + getDescription() + ", brand electroniki: " +
                brand + ", garantijnij period: " + warrantyPeriod + " month");
    }
}
