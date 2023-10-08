package HomeWorkAIT.Lesson13;

import java.util.ArrayList;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Создайте новый ArrayList для строк. Добавьте в него следующие строки: "Яблоко", "Банан",
        "Черешня", "Дыня", "Ежевика". Удалите из списка "Дыня". Вставьте на место "Черешня" строку
         "Вишня". Выведите содержимое списка.*/
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Aple");
        fruit.add("Banan");
        fruit.add("Cherries");
        fruit.add("Melon");
        fruit.add("Blackberry");
        System.out.println("List of fruits on the teable: " + fruit);
        fruit.remove(3);
        System.out.println("Melon was eaten for breakfast and left: " + fruit);
        String newFruit = "Cherry";
        int chengeIndex = 2;
        fruit.set(chengeIndex,newFruit);
        System.out.println("My daughter came and replased the cherries with a cherry ,now we have: " + fruit);

    }
}
