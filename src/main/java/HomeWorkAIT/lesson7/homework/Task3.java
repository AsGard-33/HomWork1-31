package HomeWorkAIT.lesson7.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Напишите программу, которая принимает от пользователя последовательность чисел
        (количество заранее не известно) и вычисляет их среднее значение.
         Пользователь сам определяет когда будет остановлен ввод чисел и
         выведено среденнее значение для уже введенных, введя 000.
         Пример: Пользователь вводит с клавиатуры "10", "20", "30", "000".
         Ввод в консоль: "Среднее значение 20"*/
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String input;

        System.out.println("Введите последовательность чисел (для завершения введите 000):");

        while (true) {
            input = scanner.nextLine();

            if (input.equals("000")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее значение: " + average);
        } else {
            System.out.println("Вы не ввели числа.");
        }
    }
}



