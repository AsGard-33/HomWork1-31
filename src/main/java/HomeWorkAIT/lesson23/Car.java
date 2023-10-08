package HomeWorkAIT.lesson23;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("avto edet");

    }

    @Override
    public void stop() {
        System.out.println("avto ostanovilos");

    }

    @Override
    public void fuelUp() {
        System.out.println("avto zapravleno toplivom");

    }
    public  void replacingTires(){
        System.out.println("Shini zameneny na novie");
    }
}
