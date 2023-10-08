package HomeWorkAIT.lesson26;
/*Часть 1: Интерфейсы с дефолтными методами и константами
  Создайте интерфейс под названием Vehicle с методами:

  start(): выводит информацию о том, что транспортное средство запущено.
  stop(): выводит информацию о том, что транспортное средство остановлено.
  В интерфейсе Vehicle, добавьте дефолтный метод honk(), который выводит "Би-би!".

  Добавьте константу MAX_SPEED в интерфейс Vehicle.*/
public interface Vehicle {
    int MAX_SPEED =30;
    default void speed(){
        System.out.println("maximum speed: " + Vehicle.MAX_SPEED + " km/h");
    }
    default void start(){
        System.out.println("the vehicle is running");
    }

    default void stop(){
        System.out.println("vehicle stopped");
    }

    default void honk(){
        System.out.println("Bip-bip");
    }
    default void steeringWheel (){
        System.out.println("steering wheel is in good condition");
    }

}
