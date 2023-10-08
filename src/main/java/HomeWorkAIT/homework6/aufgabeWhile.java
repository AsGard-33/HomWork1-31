package HomeWorkAIT.homework6;

import java.util.Scanner;

public class aufgabeWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numberInt = scanner.nextInt();

        while (numberInt != 0){
            System.out.println("ogidaju drugoe chislo");
            numberInt= scanner.nextInt();
        }
        System.out.println("chislo vvedeno verno");

        System.out.print("vvedite slovo");
         String checkWorld = scanner.next();
         while (!checkWorld.equals("stop")){
            System.out.println("ogidaju drugoe slovo");
            checkWorld = scanner.next();

        }
        System.out.println("chislo vvedeno verno");
    }
}
