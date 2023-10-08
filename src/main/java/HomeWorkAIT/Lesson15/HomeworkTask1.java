package HomeWorkAIT.Lesson15;

import java.util.Scanner;

public class HomeworkTask1 {

    public static void main(String[] args) {
        /*Напишите метод, который принимает два целых числа и возвращает их сумму.*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("Vvedite celoe chislo: ");
             int pervoeChislo = scanner.nextInt();
            System.out.println("Vvedite vtoroe chislo: ");
             int vtoroeChislo = scanner.nextInt();
             int rezult = sum(pervoeChislo,vtoroeChislo);
             System.out.println("Sum vvedenih chisel: " + rezult);


    }
    static int sum (int a ,int b){
       return a + b;

    }
}
