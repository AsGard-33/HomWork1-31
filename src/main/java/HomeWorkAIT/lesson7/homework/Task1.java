package HomeWorkAIT.lesson7.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Напишите программу, которая находит минимальную и максимальную цифру
         в числе введенном с клавтатуры используя циклы. Пример: вводится число 5987.
         На консоль выводится: "минимальная цифра 5, максимальная 9".*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String numberMiniMax = scanner.nextLine();

        int min = 9;
        int max = 0;

        for (int i = 0; i<numberMiniMax.length(); i++){
            char numberChar = numberMiniMax.charAt(i);
            int number = Character.getNumericValue(numberChar);
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println("Minimalnoe cifra: "+ min);
        System.out.print("Maximalnoe cifra: "+ max);


    }
}
