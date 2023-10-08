package HomeWorkAIT.lesson7.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* Напишите программу, которая принимает число N и вычисляет сумму всех чисел
        от 1 до N, используя цикл. Пример:вводится число 10.
        На консоль выводится (10+9+8+7+6+5+4+3+2+1): "Сумма чисел 55"*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = 0;
        String summa = "";

        for (int i = N; i >= 1; i--) {
            sum += i;
            if (i != N) {
                summa += "+";
            }
            summa += i;
        }

        System.out.println("(" + summa + "): \"Сумма чисел " + sum + "\"");
    }
}