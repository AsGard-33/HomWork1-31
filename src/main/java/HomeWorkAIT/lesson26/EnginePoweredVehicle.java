package HomeWorkAIT.lesson26;

public class EnginePoweredVehicle implements Vehicle{
    private String engineType;

    public EnginePoweredVehicle(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public void speed() {
        Vehicle.super.speed();
    }

    @Override
    public void start() {
        Vehicle.super.start();
    }

    @Override
    public void stop() {
        Vehicle.super.stop();
    }

    @Override
    public void honk() {
        Vehicle.super.honk();
    }

    @Override
    public void steeringWheel() {
        Vehicle.super.steeringWheel();
    }
    void showEngineType(){
        System.out.println("engine's type: " + engineType);
    }
}
