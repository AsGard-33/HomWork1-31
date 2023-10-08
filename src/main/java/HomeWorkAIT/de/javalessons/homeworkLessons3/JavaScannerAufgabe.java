package HomeWorkAIT.de.javalessons.homeworkLessons3;

import java.util.Scanner;

public class JavaScannerAufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite vashe imya:");
        String name = scanner.nextLine();
        System.out.println("privet" + name);
        scanner.close();
    }
}
