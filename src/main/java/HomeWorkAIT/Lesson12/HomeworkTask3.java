package HomeWorkAIT.Lesson12;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Создайте программу, которая симулирует бросок монеты. Пользователь вводит,
        сколько раз хочет бросить монету, а программа считает и показывает, сколько раз
        выпал орел и решка. Используйте do-while для повторения эксперимента до тех пор,
        пока пользователь не решит завершить.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Odna popitka odna monetka, dlya vihoda vvedite '0'.");
        int orel = 0;
        int reshka = 0;

        do {
            System.out.println("Vvedite chislo gelaemih popitok: ");
            int brosok = scanner.nextInt();

            if (brosok > 0) {
                for (int i = 0; i < brosok; i++) {
                    int random = (int) (Math.random() * 2);
                    if (random == 0) {
                        orel++;
                    } else {
                        reshka++;
                    }
                }
                System.out.println("Orel vipal: " + orel + " raz(a).");
                System.out.println("Reshka vipala:  " + reshka + " raz(a).");
                orel = 0;
                reshka = 0;
            } else {
                break;
            }
        } while (true);
        System.out.println("Good bay!");
    }
}