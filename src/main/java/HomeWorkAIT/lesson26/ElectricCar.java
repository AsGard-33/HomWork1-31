package HomeWorkAIT.lesson26;

public class ElectricCar extends EnginePoweredVehicle{
    public static final int MAX_SPEED = 300;

    public ElectricCar(String engineType) {
        super(engineType);
    }

    @Override
    public void speed() {
        System.out.println("maximum speed: " + ElectricCar.MAX_SPEED + "km/h");
    }

    @Override
    public void start() {
        System.out.println("The electric car is fully charged, you can move in front");
    }

    @Override
    public void stop() {
        System.out.println("electric car is discharged, the car will be stopped");
    }

    @Override
    public void honk() {
        super.honk();
    }

    @Override
    public void steeringWheel() {
        super.steeringWheel();
    }

    @Override
    void showEngineType() {
        System.out.println("the elektrik car has an engine type: " + getEngineType());
    }
}
