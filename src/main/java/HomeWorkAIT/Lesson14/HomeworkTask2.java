package HomeWorkAIT.Lesson14;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Создайте ArrayList, который содержит несколько дублирующихся элементов. Напишите код,
        который удаляет дубликаты из списка. Выведите отредактированный список на экран.*/
        ArrayList<String> spisok = new ArrayList<>();
        spisok.add("+2");
        spisok.add("+2");
        spisok.add("-1");
        spisok.add("1");
        spisok.add("+3");
        spisok.add("+3");
        spisok.add("4");

        Iterator<String> iterator = spisok.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if (spisok.indexOf(element) != spisok.lastIndexOf(element)){
                iterator.remove();
            }

        }
        System.out.println("edited list: " + spisok);

    }
}
