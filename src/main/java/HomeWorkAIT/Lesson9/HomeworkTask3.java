package HomeWorkAIT.Lesson9;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Напишите программу, которая выводит шахматную доску заданного размера N х N,
         используя символы "#" и " ".*/
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Vvedite chetnoe chislo razmera shachmatnoj doski: ");
            size = scanner.nextInt();

            if (size % 2 != 0) {
            }
            else if (size == 0){
            }
        } while (size % 2 != 0 || size == 0);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}