package HomeWorkAIT.lesson21;

public class WindInstrument extends MusicalInstrument{
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public WindInstrument(String name, String type, int price, String material) {
        super(name, type, price);
        this.material = material;
    }
    @Override
    public void play(){
        System.out.println("Igraet: " + getName() + " iz " + getMaterial());
    }
}
