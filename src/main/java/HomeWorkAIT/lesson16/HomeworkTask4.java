package HomeWorkAIT.lesson16;

import java.util.ArrayList;

public class HomeworkTask4 {

    public static void main(String[] args) {
        /* Создайте метод concatenate, который принимает массив строк и
        возвращает одну строку, состоящую из всех элементов массива, объединенных вместе.*/
        ArrayList<String> spisok = stroki();
        System.out.println("Massiv na vhode: " + spisok);

        String concatenate = concatenate(spisok.toArray(new String[0]));
        System.out.println("Rezultat s poluchenih elementov massiva: " + concatenate);
    }
    static ArrayList<String> stroki(){
        ArrayList<String> inputStroki = new ArrayList<>();
        inputStroki.add("Pogoda ");
        inputStroki.add("za ");
        inputStroki.add("oknom ");
        inputStroki.add("ochen ");
        inputStroki.add("prijatnaja ");
        inputStroki.add("segodnya!");
        return inputStroki;
    }
    static String concatenate(String[]massiv){
        String result = "";
        for (String index : massiv){
            result = result.concat(index);// vmesto += index
        }
        return result;
    }
}
