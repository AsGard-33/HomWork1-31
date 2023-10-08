package HomeWorkAIT.lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /* Создайте метод, который принимает массив целых чисел и возвращает
        среднее арифметическое этих чисел.*/
        ArrayList<Integer> spisok = vvediteChisla();

        System.out.println("Spisok massiva: " + spisok);
        double avarage = sredneeArifmeticheskoe(spisok);
        System.out.println("Srednee arifmeticheskoe: " + avarage);
    }
    static ArrayList<Integer> vvediteChisla(){
    ArrayList<Integer> celieChisla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite celie chisla massiva: ");
        while(true){
           int inputNumber = scanner.nextInt();
           if (inputNumber < 0 ){
               break;
           }
           celieChisla.add(inputNumber);
        }
        return celieChisla;
    }
    static double sredneeArifmeticheskoe(ArrayList<Integer>massiv){
        int sum = 0;
        for (int num : massiv){
            sum += num;
        }
        return(double) sum / massiv.size();

    }
}
