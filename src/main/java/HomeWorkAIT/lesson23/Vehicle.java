package HomeWorkAIT.lesson23;
/*Создайте интерфейс Vehicle с методами drive(), stop(), и fuelUp().
Реализуйте этот интерфейс в классах Car и Boat. Добавьте методы,
специфичные для каждого транспортного средства, но сохраняйте общий интерфейс для
управления.*/

public interface Vehicle {
    void drive();
    void stop();
    void fuelUp();
}
