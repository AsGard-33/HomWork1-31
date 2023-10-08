package HomeWorkAIT.lesson27;

public class Electronics extends  Product{
    private int warrantyYears;

    public Electronics(String name, double price, int quantity, int warrantyYears) {
        super(name, price, quantity);
        this.warrantyYears= warrantyYears;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String getInfo() {
        return "Electronics: " + getName() + " Stoimost: " + getPrice() + " Kolichestvo: " + getQuantity() + " Garanty: " + getWarrantyYears() + " years";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }
}
