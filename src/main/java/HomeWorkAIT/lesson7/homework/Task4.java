package HomeWorkAIT.lesson7.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Напишите программу, которая рисует ромб из звездочек заданной высоты.
         Высоту ромба вводит пользователь.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите высоту ромба (нечетное число): ");
        int height = scanner.nextInt();

        if (height % 2 == 0) {
            System.out.println("Высота ромба должна быть нечетным числом.");
            return;
        }

        int halfHeight = height / 2;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < Math.abs(halfHeight - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < height - 2 * Math.abs(halfHeight - i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}