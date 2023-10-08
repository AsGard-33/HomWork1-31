package HomeWorkAIT.Lesson10;

import java.util.Scanner;

public class HomevorkTask1 {
    public static void main(String[] args) {
        /*Написать программу, которая определяет, содержит ли массив заданное с клавиатуры число.*/
        Scanner scanner = new Scanner(System.in);

        int number[];
        number = new int[]{4,6,8,9,11,13,33};
        System.out.println("Vvedite iskomoe chislo: ");
        int chislo = scanner.nextInt();
        boolean ist = false;
        for (int i = 0; i < number.length; i++){
            if (number[i] == chislo){
                ist = true;
                break;
            }
        }
        if (ist){
            System.out.println("Chislo sodergitsya v massive");
        }
        else {
            System.out.println("Chislo ne sodergitsya v massive");
        }



    }
}
