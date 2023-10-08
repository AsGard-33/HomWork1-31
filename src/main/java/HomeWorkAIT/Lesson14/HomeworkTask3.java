package HomeWorkAIT.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /* Создайте список чисел. Получите подсписок, состоящий из первых 5 элементов исходного списка.
        Удвойте каждое число в этом подсписке. Выведите подсписок на экран*/
        ArrayList<Integer> startList = new ArrayList<>();
        startList.add(2);
        startList.add(3);
        startList.add(5);
        startList.add(7);
        startList.add(9);
        startList.add(21);
        startList.add(33);
        startList.add(66);

        List<Integer> subList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
             int result = startList.get(i);
             int doubledResult = result * 2;
             subList.add(doubledResult);
             }
        System.out.println("Podspisok s udvoenimi chislami: " + subList);









    }
}
