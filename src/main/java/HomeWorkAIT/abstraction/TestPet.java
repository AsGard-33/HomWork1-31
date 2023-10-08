package HomeWorkAIT.abstraction;

public class TestPet {
    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.makeSaund();
        pet = new Cat();
        pet.makeSaund();
        pet.setName("Milli");
        pet.showName();
    }
}
