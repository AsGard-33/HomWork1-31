package HomeWorkAIT.lesson26;
/*Часть 2: Наследование и Реализация
 1.Создайте класс Car, который реализует интерфейс Vehicle.
 2.Создайте класс Bicycle, который также реализует интерфейс Vehicle.
 3.Оба класса должны переопределять методы start() и stop().*/
public class Car extends EnginePoweredVehicle implements Vehicle {
    public Car(String engineType) {
        super(engineType);
    }

    public static final int MAX_SPEED = 150;

    @Override
    public void speed() {
        System.out.println("maximum speed: " + Car.MAX_SPEED + "km/h");
    }

    @Override
    public void start() {
        System.out.println("the Car is running");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
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
