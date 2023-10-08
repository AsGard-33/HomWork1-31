package HomeWorkAIT.lesson20;
/* Создайте класс Person с приватными полями name и age. Добавьте конструктор
для инициализации этих полей. Добавьте "геттеры" и "сеттеры" для этих полей.
Модифицируйте класс Person так, чтобы сеттер для возраста не позволял устанавливать
отрицательное значение. Расширьте класс Person из первого задания,
добавив сообщение об ошибке при попытке установить недопустимое значение в поле age.*/
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 177){
            this.age = age;
        } else {
            System.out.println("Nedopustimiy vozrast");
        }
    }
}
class Test{
    public static void main(String[]args){
        Person person1 = new Person("Alexey",37);
        System.out.println(person1.getName() + " " + person1.getAge());

    }
}