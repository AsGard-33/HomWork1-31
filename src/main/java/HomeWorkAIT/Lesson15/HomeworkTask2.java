package HomeWorkAIT.Lesson15;

import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {
        /* Напишите метод, который принимает строку и возвращает её в обратном порядке.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter simbols: ");
        String simbols = scanner.nextLine();

        String mirror = returnLine(simbols);
        System.out.println(mirror);


    }
    static String returnLine(String input) {
        StringBuilder mirror = new StringBuilder();
        for (int i = input.length()-1; i >=0; i--) {
            mirror.append(input.charAt(i));
        }
        return mirror.toString() ;
    }
}
