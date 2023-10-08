package HomeWorkAIT.lesson29;

abstract class Animal {
    protected String name; //Имя животного.

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void displayInfo();//Абстрактный метод для вывода информации о животном.
}
