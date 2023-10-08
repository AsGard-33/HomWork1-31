package HomeWorkAIT.Lesson9;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Реализуйте программу, которая возводит число в степень
        без использования встроенной функции Math.pow(). Попробуйте реализовать алгоритм
        быстрого возведения в степень для улучшения эффективности.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite chislo: ");
        double base = scanner.nextDouble();
        System.out.print("Vvedite stepen: ");
        int exponent = scanner.nextInt();


        long result = 1;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                result /= base;
            }
        }
        System.out.println("Resultat: " + result);
    }
}
