package HomeWorkAIT.lesson29;

public class Tiger extends Animal implements Feeding,Running,Roaring {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(" runs fast,Скорость: 49 – 65 км/ч (в рывке)!");
    }

    @Override
    public void roar() {
        System.out.println(" grrrr!");

    }

    @Override
    public void displayInfo() {
        System.out.println(name + ": ");
        eat();
        run();
        roar();
    }

    @Override
    public void eat() {
        System.out.println(" ест мясо.");
    }
}
