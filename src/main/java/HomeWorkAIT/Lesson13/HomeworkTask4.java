package HomeWorkAIT.Lesson13;

import java.util.ArrayList;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Создайте два ArrayList со строками. Найдите элементы, которые присутствуют в обоих списках
        и создайте новый список на их основе. Выведите новый список.*/
        ArrayList<String> spisok1 = new ArrayList<>();
        ArrayList<String> spisok2 = new ArrayList<>();

        spisok1.add("dobry");
        spisok1.add("chelovek, byl");
        spisok1.add("rad");
        spisok1.add("organizovivat");
        spisok1.add("vstrechi");
        spisok1.add("v 18:00,tak kak on lubil");
        spisok1.add("vecher");
         System.out.println("1. Spisok pervy: " + spisok1);

        spisok2.add("Aleksey byl");
        spisok2.add("rad");
        spisok2.add("luboi");
        spisok2.add("vstrechi");
        spisok2.add("v 18:30, tak kak luboj");
        spisok2.add("vecher");
        spisok2.add("dlya nego");
        spisok2.add("dobry");
        System.out.println("2. Spisok vtoroj: " + spisok2);
        ArrayList<String> newSpisok = new ArrayList<>();
        for (String index : spisok1){
            if (spisok2.contains(index)){
                newSpisok.add(index);
            }
        }
        String temp = newSpisok.get(1);
        String newTemp = newSpisok.get(2);
        newSpisok.set(2,newSpisok.get(3));
        newSpisok.set(3,newTemp);
        newSpisok.set(1,newSpisok.get(2));
        newSpisok.set(2,temp);
        System.out.println("3. New list s poluchenih slov, vrodeby poluchilos interesno: " + newSpisok + "\uD83D\uDE0A");
    }
}
