package HomeWorkAIT.homework6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int numberInt = scanner.nextInt();

        if (numberInt <=0){
            System.out.println("chislo dolgno bit pologitelnim");
        }
        else {
            for (int i = 2; i<numberInt-1; i++){
            boolean result = true;
            for (int y=2; y <= 1+i/2; y++){
                if (i %y == 0){
                    result = false;
                    break;
                }
            }
            if (result){
                System.out.printf("%d", i);
            }
            }
        }



    }
}