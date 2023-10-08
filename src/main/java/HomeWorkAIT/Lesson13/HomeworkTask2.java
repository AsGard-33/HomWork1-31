package HomeWorkAIT.Lesson13;

import java.util.ArrayList;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Создайте ArrayList со строками: "один", "два", "три", "четыре", "пять". Напишите программу,
        которая переставляет элементы списка в обратном порядке. Выведите список до
        и после перестановки.*/
        ArrayList<String> element = new ArrayList<>();
        element.add("odin");
        element.add("dva");
        element.add("tri");
        element.add("chetire");
        element.add("pyat");
        System.out.println("Spisok do: " + element);
        int size = element.size();
        for (int i = 0; i < size/2; i++){
            String temp = element.get(i);
            element.set(i, element.get(size -1 - i));
            element.set(size - 1 - i,temp);

        }
        System.out.println("Spisok posle: " + element);
    }
}
