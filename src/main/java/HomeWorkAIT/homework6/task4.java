package HomeWorkAIT.homework6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту пирамиды (n): ");
        int numberHeight = scanner.nextInt();

        for (int i = 0; i < numberHeight; i++) {
            for (int y = 0; y < numberHeight - i - 1; y++) {
                System.out.print(" ");
            }
            for (int s = 0; s < 2 * i + 1; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
