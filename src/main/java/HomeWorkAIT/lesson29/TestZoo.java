package HomeWorkAIT.lesson29;

public class TestZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Bird vorobej = new Bird("vorobej", true);
        Bird kurica = new Bird("kurica", false);
        Predator lion = new Predator("lion", 10);
        Predator eagle = new Predator("eagle", 5);
        Tiger tiger = new Tiger("Tiger");
        Cheetah cheeatah = new Cheetah("Cheetah");
        zoo.addAnimal(vorobej);
        zoo.addAnimal(kurica);
        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);
        zoo.addAnimal(tiger);
        zoo.addAnimal(cheeatah);
        //Sortiruem givotnih po imeni
        zoo.sortAnimalsByName();
        System.out.println("_______ZOO_______");
        //Vivodim otsortirovannih givotnih
        zoo.displayAllAnimals();
        System.out.println("_______\uD83D\uDC05_______");
        tiger.displayInfo();
        System.out.println("______\uD83D\uDC26________");
        vorobej.displayInfo();
        System.out.println("_______\uD83D\uDC14_______");
        kurica.displayInfo();
        System.out.println("______\uD83D\uDC2F________");
        cheeatah.displayInfo();
    }
}
