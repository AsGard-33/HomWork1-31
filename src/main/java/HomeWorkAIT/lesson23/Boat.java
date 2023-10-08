package HomeWorkAIT.lesson23;

public class Boat implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Lodka dvigaetsya");

    }

    @Override
    public void stop() {
        System.out.println("Lodka ostanovilas");

    }

    @Override
    public void fuelUp() {
        System.out.println("Lodka zapravlena toplevom");

    }
    public void oars(){
        System.out.println("Vesla na bortu");
    }
}
