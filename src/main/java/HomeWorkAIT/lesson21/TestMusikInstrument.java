package HomeWorkAIT.lesson21;

import java.util.ArrayList;
import java.util.List;

public class TestMusikInstrument {
    public static void main(String[] args) {
        MusicalInstrument pervij = new MusicalInstrument("Skripka","Orkestrovaja",3456);
        MusicalInstrument vtoroj = new MusicalInstrument("Skripka 2","Solnaja",5000);
        StringInstrument string1 = new StringInstrument("Balalajka","Strunno-shipkovij instrument",1013,3);
        StringInstrument string2 = new StringInstrument("Kontrobass","smichkovij",4300,4);
        WindInstrument wind1 = new WindInstrument("Saksofon","Bariton",4400,"metal");
        WindInstrument wind2 = new WindInstrument("Blok-flejta","Soprano",100,"derevo");

        System.out.println("Zadacha a):_____________________");
        pervij.play();
        vtoroj.play();
        string1.play();
        string2.play();
        wind1.play();
        wind2.play();
        System.out.println("Zadacha b):_______________________");

        List<MusicalInstrument> musikInstrument = new ArrayList<>();
            musikInstrument.add(pervij);
            musikInstrument.add(vtoroj);
            musikInstrument.add(string1);
            musikInstrument.add(string2);
            musikInstrument.add(wind1);
            musikInstrument.add(wind2);
            for (MusicalInstrument instrument1 : musikInstrument){
                instrument1.play();

            }System.out.println("Zadacha c):_________________________");
        System.out.println("Zamena muzikalnogo instrumenta: " + vtoroj.getName());
        vtoroj.setName("Trombon");
        System.out.println("Uspeshnaja zamena na: " + vtoroj.getName());

        System.out.println("Zamena Type novogo instrumenta: " + vtoroj.getName());
        vtoroj.setType("Alt");
        System.out.println("Type uspeshno izmenen na: " + vtoroj.getType());

        System.out.println("zamena stoimosty izmenennogo insrumenta: " + vtoroj.getName());
        vtoroj.setPrice(1350);
        System.out.println("Stoimost uspeshno izmenena na: " + vtoroj.getPrice());

        System.out.println("Zamena kollichestva strun u: " + string2.getName());
        string2.setNumberOfStrings(5);
        System.out.println("Struny uspeshno zameneny na: " + string2.getNumberOfStrings());

        System.out.println("Zamena materiala u: " + wind2.getName());
        wind2.setMaterial("red wood");
        System.out.println("Material uspeshno izmenen na: " + wind2.getMaterial());
        System.out.println("Zadanie d):______________________");

        System.out.println("Arenda sostavlyaet 10% v month ot stoimosti instrumenta");
        pervij.rentalCost();
        vtoroj.rentalCost();
        string1.rentalCost();
        string2.rentalCost();
        wind1.rentalCost();
        wind2.rentalCost();


    }
}
