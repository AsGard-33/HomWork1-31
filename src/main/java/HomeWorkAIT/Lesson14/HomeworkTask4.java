package HomeWorkAIT.Lesson14;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Создайте список слов. Удалите из списка все слова, длина которых меньше 5 символов.
        Выведите итоговый список.*/
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Karusel");
        wordList.add("Teplica");
        wordList.add("Vagon");
        wordList.add("Vesy");
        wordList.add("Sol'");
        wordList.add("Bobr");
        wordList.add("Gorodskoj");

        Iterator<String> iterator = wordList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (element.length() < 5){
                iterator.remove();
            }
        }
        System.out.println("Itogovyj spisok: " + wordList);


    }
}
