package HomeWorkAIT.lesson16;

import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {
        //Создайте метод, который принимает три числа и возвращает наибольшее из них.
        //vvodim tri chisla po ocheredy
        System.out.println("Vvedite chislo 1: ");
        int chislo1 = vvodchisel();
        System.out.println("Vvedite chislo 2: ");
        int chislo2 = vvodchisel();
        System.out.println("Vvedite chislo 3: ");
        int chislo3 = vvodchisel();
        // nahodim maksimalnoe chislo s pomoshju metoda
        int maximal = maximalnoe(chislo1,chislo2,chislo3);
        System.out.println("Maksimalnoe chislo: " + maximal);
    }
    //metod na vvod chisel s klaviatury
    static int vvodchisel(){
        Scanner scanner = new Scanner(System.in);
        int chisla = scanner.nextInt();
        return chisla;
    }
    //metod na poisk maksimalnogo chisla
    static int maximalnoe (int pervoe,int vtoroe, int tretje){
        int max = pervoe;
        if (vtoroe > pervoe){
            max = vtoroe;
        }
        if (tretje > vtoroe){
            max = tretje;
        }
        return max;
    }
}
