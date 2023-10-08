package HomeWorkAIT.lesson21;

public class StringInstrument extends MusicalInstrument{
    private int numberOfStrings;

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public StringInstrument(String name, String type, int price, int numberOfStrings) {
        super(name, type, price);
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play(){
        System.out.println("Igraet: " + getName() + " s " + getNumberOfStrings() + " strunami.");

    }
}
