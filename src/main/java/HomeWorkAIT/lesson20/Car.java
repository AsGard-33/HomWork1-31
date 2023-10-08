package HomeWorkAIT.lesson20;
/*Создайте класс Car с приватными полями make (марка), model (модель) и engine (двигатель).
 Двигатель должен быть отдельным классом Engine с полями type (тип) и power (мощность),
 а также сеттерами и геттерами. В классе Car добавьте методы для установки и
 получения двигателя*/
public class Car {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
class Engine {
    public String type;
    public int power;
    public Engine(String type, int power) {
        this.type = type;
        setPower(power);
    }
    public String getType(){
        return type;
    }
    public int getPower(){
        return power;
    }

    public void setPower(int power) {
        if (power > 50 && power < 1200) {
            this.power = power;
        } else {
            System.out.println("Ne korrectnaja moshnost");
        }
    }
}
class Test1 {
    public static void main (String[] args){
        Engine carEngine1 = new Engine("Benzin",600);
        Car car1 = new Car("Audi","RS6",carEngine1);
        Engine car1Engine = car1.getEngine();
        System.out.println("Marka avto: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Tip dvigatelya: " + car1Engine.getType());
        System.out.println("Moshnost dvigatelya: " + car1Engine.getPower() +" h.p.");
        //Dvigatel posle tuning, zamena informacii
        Engine carEngine2 = new Engine("Benzin",1000);
        car1.setEngine(carEngine2);
        System.out.println("Moshnost dvigatela posle tuning: " + car1.getEngine().getPower() + " h.p.");


    }
}
