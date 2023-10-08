package HomeWorkAIT.Lesson13;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Создайте ArrayList из чисел: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10. Получите подсписок
        из этого списка, который содержит только числа от 4 до 8. Выведите этот подсписок.*/

        ArrayList<Integer> spisok = new ArrayList<>();


        for (int i = 1; i <= 10; i++){
            spisok.add(i) ;
        }
        System.out.println("Spisok chisel ot1-do10: " + spisok);
        List<Integer> podspisok = spisok.subList(3,8);
        System.out.println("Podspisok chisel ot4-do8: " + podspisok);
    }
}
