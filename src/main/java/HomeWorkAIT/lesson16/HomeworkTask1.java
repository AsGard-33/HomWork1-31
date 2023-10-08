package HomeWorkAIT.lesson16;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /* Напишите метод, который принимает два числа и символ операции (+, -, *, /) и
        возвращает результат этой операции.*/
        System.out.println("Vvedite pervoe chislo: ");
        int chislo1 = vvodChisel();
        System.out.println("Vvedite vtoroe chislo: ");
        int chislo2 = vvodChisel();
        System.out.println("Vvedite dejstvie: ");
        char dejstvie = vvodOperacii();


        int result = vipolnenjaOperacij(chislo1, chislo2, dejstvie);
        System.out.println(result);



    }
    // sozdaem metod dlya vvoda chisel s klaviatury
    static int vvodChisel(){
        Scanner scanner = new Scanner(System.in);
        int chisla = scanner.nextInt();
        return chisla;
    }
    //sozdaem metod dlya vvoda dejstvij s klaviatury v vide char
    static char vvodOperacii(){
      Scanner scanner = new Scanner(System.in);
      char operacija = scanner.next().charAt(0);
      return operacija;

    }
    static  int vipolnenjaOperacij(int chislo1, int chislo2, int dejstvie){
        int result = 0;
        switch(dejstvie){
            case '+':
                result = chislo1 + chislo2;
                break;
            case '-':
                result = chislo1 - chislo2;
                break;
            case '*':
                result = chislo1 * chislo2;
                break;
            case '/':
                if (chislo2 != 0){
                    result = chislo1 / chislo2;
                } else {
                    System.err.println("Delenie na nol ne vozmogno");
                }
                break;
            default:
                System.out.println("Nepravilnyj vvod");
        }
        return result;
    }
}
