package HomeWorkAIT.lesson29;

public class Bird extends Animal implements Feeding,Flying{
    private boolean canFly; //параметр, показывающий, может ли птица летать.
    public Bird(String name,boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void flying() {
        System.out.println(name + " flies very fast");
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird: " + name + ", Can fly: " + canFly );
        flying();
        eat();
    }

    @Override
    public void eat() {

        System.out.println(name + " клюет зернышки.");

    }
}
