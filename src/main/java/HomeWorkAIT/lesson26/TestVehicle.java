package HomeWorkAIT.lesson26;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car("Benzin");
        Bicycle bicycle = new Bicycle();
        ElectricCar electricCar = new ElectricCar("Electric");
        SportsCar sportsCar = new SportsCar("benzin");

        System.out.println("___________\uD83D\uDE9B______________");
        car.honk();
        car.start();
        car.speed();
        car.showEngineType();
        car.stop();
        car.steeringWheel();


        System.out.println("____________\uD83D\uDEB4\u200D♂\uFE0F_____________");
        bicycle.honk();
        bicycle.start();
        bicycle.speed();
        bicycle.stop();
        bicycle.steeringWheel();

        System.out.println("____________\uD83C\uDFCE\uFE0F_______________");
        electricCar.honk();
        electricCar.start();
        electricCar.speed();
        electricCar.showEngineType();
        electricCar.stop();
        electricCar.steeringWheel();

        //Sozdaem massiv
        System.out.println("_____________\uD83D\uDCE5____________");

         Vehicle[] vehicles = new Vehicle[4];
         vehicles[0] = car;
         vehicles[1] = bicycle;
         vehicles[2] = electricCar;
         vehicles[3] = sportsCar;

         for (Vehicle vehicle : vehicles){
             vehicle.start();
             vehicle.stop();
             vehicle.honk();
         }

         System.out.println("____________\uD83D\uDE80_____________");
         sportsCar.honk();
         sportsCar.start();
         sportsCar.speed();
         sportsCar.showEngineType();
         sportsCar.stop();
         sportsCar.steeringWheel();


    }
}
