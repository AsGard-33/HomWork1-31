package HomeWorkAIT.lesson26;

public class SportsCar extends Car {
    public static final int MAX_SPEED = 450;
    public SportsCar(String engineType) {
        super(engineType);
    }

    @Override
    public void speed() {
        System.out.println("maximum speed: " + SportsCar.MAX_SPEED + "km/h");
    }

    @Override
    public void start() {
        System.out.println("the sports car is running");
    }

    @Override
    public void stop() {
        System.out.println("sports car stopped");
    }

    @Override
    public void steeringWheel() {
        super.steeringWheel();
    }

    @Override
    void showEngineType() {
        System.out.println("the car has an engine type: " + getEngineType());
    }
}
