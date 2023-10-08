package HomeWorkAIT.lesson29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();


    public void addAnimal(Animal animal) {
        animalList.add(animal);

    }
    public void displayAllAnimals(){
        for (Animal animal : animalList){
            animal.displayInfo();
        }

    }
    public void sortAnimalsByName(){
        Comparator<Animal> nameComporator = Comparator.comparing(Animal :: getName);
        Collections.sort(animalList,nameComporator);
    }
}
