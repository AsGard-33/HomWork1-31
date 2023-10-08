package HomeWorkAIT.abstraction;

public class Dog extends Pet{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    void makeSaund() {
        System.out.println("Dog says woof");

    }
}
