package HomeWorkAIT.lesson23;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();

        car.stop();
        car.replacingTires();
        car.fuelUp();
        car.drive();

        boat.stop();
        boat.oars();
        boat.fuelUp();
        boat.drive();
    }
}
