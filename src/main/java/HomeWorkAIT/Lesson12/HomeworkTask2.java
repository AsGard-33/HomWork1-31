package HomeWorkAIT.Lesson12;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Напишите программу, которая принимает два целых числа n и m и использует
        два вложенных цикла for для печати прямоугольника из звездочек размером n x m.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite razmer visoti prymougolnika: ");
        int visota = scanner.nextInt();
        System.out.println("Vvedite razmer shiriny prymougolnika: ");
        int shirina = scanner.nextInt();
        char napolnitel = '*';

        for (int i = 0; i < visota; i++){
            for (int y = 0; y < shirina; y++){
                System.out.print(napolnitel);
            }
            System.out.println();

        }

    }
}
