package HomeWorkAIT.lesson21;
/*Иерархия классов "Музыкальные инструменты"

1.Базовый класс Музыкальный Инструмент (MusicalInstrument): Приватные атрибуты:
 название (name), тип (type), цена (price). Конструктор для инициализации атрибутов.
  Геттеры и сеттеры для всех атрибутов. Метод играть() (play), который выводит сообщение
   "Играет [название инструмента]".
2.Класс Струнный Инструмент (StringInstrument) наследуется от Музыкальный Инструмент:
 Дополнительный атрибут: количество струн (numberOfStrings). Конструктор для инициализации
  всех атрибутов. Геттер и сеттер для нового атрибута. Переопределенный метод играть(),
   который выводит "Играет [название инструмента] с [количество струн] струнами".
3.Класс Духовой Инструмент (WindInstrument) наследуется от Музыкальный Инструмент:
 Дополнительный атрибут: материал (material), например, "дерево" или "металл". Конструктор
  для инициализации всех атрибутов. Геттер и сеттер для нового атрибута. Переопределенный
   метод играть(), который выводит "Играет [название инструмента] из [материал]".
4.Задачи:
a) Создать несколько экземпляров каждого класса и вызвать метод играть() для каждого из них.
b) Создать массив или список объектов типа Музыкальный Инструмент и добавьте в него объекты
 всех производных классов. Пройтись по этому массиву в цикле, вызывая метод играть() для
  каждого объекта.
c) Используйте геттеры и сеттеры для всех атрибутов классов для демонстрации принципов инкапсуляции.

d) Для продвинутых: добавьте метод стоимостьАренды() (rentalCost) в базовый класс,
 который будет рассчитывать стоимость аренды инструмента на основе его цены.
  Переопределите этот метод в производных классах, если необходимо.*/
public class MusicalInstrument {
    private String name;
    private String type;
    private int price;
    private float rental;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MusicalInstrument(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public void play(){
        System.out.println("Igraet: " + getName());
    }
    public float rentalCost(){
         // Vichislyaem 10% ot stoimosti instrumenta
             rental = (float) (getPrice() * 0.10);
            System.out.println("Stoimost arendi instrumenta: " + getName() + ", sostavlyaet = " + rental + " $ v month");

        return rental;
    }
}
