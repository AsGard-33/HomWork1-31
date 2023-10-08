package HomeWorkAIT.Lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /* Создайте метод, который принимает список чисел и возвращает список только четных
        чисел из него.*/
        //vvodim chisla v stroku
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers: ");
        String inputLine = scanner.nextLine();
        //razbivaem stroku na otdelnie simvoly
        String [] spisokVvedenihChisel = inputLine.split(" ");
        //sozdaem spisok s preobrazovaniem simvolov v chisla
        List<Integer> spisok = new ArrayList<>();
        for (String indexPoSpisku : spisokVvedenihChisel){
            int number = Integer.parseInt(indexPoSpisku);
            spisok.add(number);
        }
        //vivodim spisok s chetnimi chislami
        List<Integer> even = searchForEven(spisok);
        System.out.println(even);
    }
    // metod kotoryi nahodit chetnie chisla
    static List<Integer> searchForEven(List<Integer> spisok) {
        List<Integer> even = new ArrayList<>();
        for (Integer number : spisok) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }
}
