package HomeWorkAIT.Lesson12;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /* Дан массив целых чисел. Используя цикл for-each и изученные структуры данных,
        определите число, которое встречается чаще всего в массиве.*/
        int[] massiv = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int chastoVstrechaetsya = 0;
        int maxCount = 0;


        for (int startNumber : massiv){
            int count = 0;
            for (int number : massiv){
                if (number == startNumber){
                    count++;
                }

            }
            if (count > maxCount){
                maxCount = count;
                chastoVstrechaetsya = startNumber;
            }

        }
        System.out.println(chastoVstrechaetsya);



    }
}
