package HomeWorkAIT.abstraction;

public class Cat extends Pet{
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
        System.out.println("Cat says miju");

    }
}
