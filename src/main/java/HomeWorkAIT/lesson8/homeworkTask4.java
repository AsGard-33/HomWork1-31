package HomeWorkAIT.lesson8;

import java.util.Scanner;

public class homeworkTask4 {
    public static void main(String[] args) {
        /* Банковский аккаунт: Создайте программу, которая имитирует работу
        банковского аккаунта. Пользователь может выбирать действия,
        такие как внесение средств, снятие средств и проверка баланса.
        Используйте цикл do-while, чтобы продолжать работу с аккаунтом до тех пор,
        пока пользователь не решит выйти.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vas privedstvuet bank'AVAL'");

        String vibor;
        //String vnesenijeSredstv;
        //String snyatieSredstv;
        //String proverkaBalansa;
        double balans = 3000;
        String vihod;
        do {
            System.out.println("Chto vi hotite sdelat: 'vnesenije sredstv','snyatie sredstv','proverka balansa','vihod'");
            vibor = scanner.nextLine();

            if (vibor.equals("vnesenije sredstv")) {
                System.out.println("Vnesite sredstva: ");
                double kolichestvo =scanner.nextDouble();
                scanner.nextLine();
                balans += kolichestvo;
                System.out.println("Sredstva vneseny: " +"vash balans " + balans);

            } else if (vibor.equals("snyatie sredstv")){
                System.out.println("snyatie sredstv: ");
                double kolichestvo =scanner.nextDouble();
                scanner.nextLine();
                if (balans>= kolichestvo){
                    balans -= kolichestvo;
                    System.out.println("Sredstva snyaty: " +"ostatok na schete " + balans);
                }else{
                    System.out.println("Nedostatochno sredstv: " +"vash balans " + balans);
                }

            } else if (vibor.equals("proverka balansa")) {
                System.out.println("Vash balans: " + balans);

            } else if (vibor.equals("vihod")) {
                System.out.println("Vi vipolnili vihod,bank 'AVAL' gelaet vam uspehov");
                break;

            }else {
                System.out.println("Necorectnij vibor,try again");
            }


        }while(true);
    }
}
