package HomeWorkAIT.lesson29;

public class Predator extends Animal implements Feeding,Running,Roaring{
    private int preyCaught;
    public Predator(String name, int preyCaught) {
        super(name);
        this.preyCaught = preyCaught;
    }

    @Override
    public void roar() {
        System.out.println(name + " roars loudly.");

    }

    @Override
    public void run() {
        System.out.println(name + " runs quickly.");

    }

    @Override
    public void displayInfo() {
        System.out.println("predator: " + name + ", number of prey caught: " + preyCaught );
        run();
        roar();
        eat();

    }

    @Override
    public void eat() {
        System.out.println(name + " съедает добычу.");

    }


}
