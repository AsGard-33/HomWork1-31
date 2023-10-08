package HomeWorkAIT.Lesson9;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Напишите программу, которая выводит строку в обратном порядке.
         Ваша программа должна пройти по всей строке с конца до начала
         и вывести её на экран.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedity tekst: ");
        String tekst = scanner.nextLine();

        for (int i =tekst.length()-1; i >=0; i--) {

            System.out.print(tekst.charAt(i));
        }
    }
}
