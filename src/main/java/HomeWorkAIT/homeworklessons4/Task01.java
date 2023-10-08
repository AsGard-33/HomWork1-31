package HomeWorkAIT.homeworklessons4;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo:");
        int num1 = scanner.nextInt();
        System.out.println("Vvedite vtoroe chislo:");
        int num2 = scanner.nextInt();
        System.out.println("Vvedite operaciju (+,-,*,/) : ");
        String operacija = scanner.next();

        int resultat = 999;


        switch (operacija){
            case "+":
                resultat = num1+num2;

                break;
            };
        System.out.println("resultat:" + resultat);
            scanner.close();

        }





        }





