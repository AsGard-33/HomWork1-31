package HomeWorkAIT.homework6;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        System.out.println("Число в обратном порядке: " + reversedNumber);
    }
}