package HomeWorkAIT.Lesson14;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Создайте два списка типа String: первый содержит имена, второй - фамилии. Создайте третий список,
        который будет содержать полные имена (имя и фамилия), объединив два предыдущих списка.
        Выведите третий список на экран.*/
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        List<String> fullName = new ArrayList<>();
        firstName.add("Alexey");
        firstName.add("Renat");
        firstName.add("Mihail");
        firstName.add("Igor");
        lastName.add("Nazarov");
        lastName.add("Ahmetov");
        lastName.add("Zadornov");
        lastName.add("Zimmermann");


        for (int i = 0; i < firstName.size(); i++){
            String rezult = firstName.get(i) + " " + lastName.get(i);
            fullName.add(rezult);
        }
        System.out.println("Tretij spisok na osnove dvuh" + fullName);
    }
}
