package HomeWorkAIT.lesson25;
/*Java Интерфейсы: Swimmer и Runner
Задание
Часть 1: Создание интерфейсов и методов
Создайте интерфейс Swimmer:

Добавьте метод swim().
Добавьте метод dive().
Добавьте константу MIN_SWIM_DISTANCE с типом int и значением 25.
Добавьте дефолтный метод warmUp(), который выводит сообщение "Warming up before swimming."
Создайте интерфейс Runner:

Добавьте метод run().
Добавьте метод jump().
Добавьте константу MIN_RUN_DISTANCE с типом int и значением 100.
Добавьте дефолтный метод stretch(), который выводит сообщение "Stretching before running."
Часть 2: Реализация интерфейсов
Создайте класс Athlete, реализующий интерфейсы Swimmer и Runner:
Реализуйте все методы из обоих интерфейсов.
В методах swim() и run() используйте константы MIN_SWIM_DISTANCE и MIN_RUN_DISTANCE для вывода дистанции.
Часть 3: Тестирование
Создайте тестовый класс:
В тестовом классе создайте объект класса Athlete.
Вызовите все методы этого объекта, включая дефолтные.*/
public class Athlete implements Swimmer,Runner{
    @Override
    public void run() {
        System.out.println("minimum running distance: " + MIN_RUN_DISTANCE + " meters");

    }

    @Override
    public void jump() {
        System.out.println("A runner performs a jump at the end of the race");

    }

    @Override
    public void stretch() {
        Runner.super.stretch();
    }

    @Override
    public void swim() {
        System.out.println("minimum swimming distance: " + MIN_SWIM_DISTANCE + " meters");

    }

    @Override
    public void dive() {
        System.out.println("diving into the water before a distance swim");

    }

    @Override
    public void warmUp() {
        Swimmer.super.warmUp();
    }
}
