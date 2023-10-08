package HomeWorkAIT.lesson26;

public class Bicycle implements Vehicle{
    public static final int MAX_SPEED = 30;

    @Override
    public void speed() {
        System.out.println("maximum speed: " + Bicycle.MAX_SPEED + " km/h");
    }

    @Override
    public void start() {
        System.out.println("the bicycle is running");;
    }

    @Override
    public void stop() {
        System.out.println("bicycle stopped");
    }

    @Override
    public void honk() {
       System.out.println("jilin-jilin");
    }

    @Override
    public void steeringWheel() {
        Vehicle.super.steeringWheel();
    }
}
