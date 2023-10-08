package HomeWorkAIT.lesson8;

import java.util.Scanner;

public class homeworkTask3 {
    public static void main(String[] args) {
        /*Напишите простую игру, в которой компьютер загадывает число от 1 до 100,
         а пользователь пытается его угадать. Используйте цикл do-while,
         чтобы повторять игру, пока пользователь не угадает число.*/

        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int numberComp = (int)((Math.random()*(max-min))+min);
        System.out.println("Enter number: " + numberComp);
        /* Mogno ne pisat' +numberComp
        eto dlya proverki,srabotaet li programma na stop esli ugadaesh chislo*/



        int number = 0;

        do {
            number = scanner.nextInt();
            if (number==numberComp){
                System.out.println("You winner");
                break;


            } else if (number>100){
                System.out.println("vihodish za ramki pravil,vvedi ot 1 do 100");

            } else if (number!=numberComp) {
                System.out.println("vvedite drugoe chislo");

            }

        }while (true);

    }
}
