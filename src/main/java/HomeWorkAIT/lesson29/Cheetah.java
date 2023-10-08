package HomeWorkAIT.lesson29;

public class Cheetah extends Animal implements Swiming,Running,Roaring,Feeding{
    public Cheetah(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println(name + ":");
        run();
        swim();
        roar();
        eat();

    }

    @Override
    public void run() {
        System.out.println(" runs fast,за 3 секунды может развивать скорость до 110 км/ч.");
    }

    @Override
    public void swim() {
        System.out.println( " floats in the water.");

    }

    @Override
    public void roar() {
        System.out.println(" Mjau");
    }

    @Override
    public void eat() {
        System.out.println("est siroe myaso");
    }
}
