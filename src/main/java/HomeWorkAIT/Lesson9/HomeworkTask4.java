package HomeWorkAIT.Lesson9;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Напишите программу, которая выводит таблицу умножения для чисел от 1 до 10.
         Попробуйте реализовать это с использованием вложенных циклов.*/

        int result = 0;
        int numberFirst = 0;
        int numberSecond = 0;
        for ( numberFirst = 1; numberFirst <= 9; numberFirst++) {
            for ( numberSecond = 1; numberSecond <= 10; numberSecond++) {
                 result = numberFirst * numberSecond;
                String format = String.format("%2d  ", result);
                System.out.print(numberFirst + " * " + numberSecond + " = " + format + " ");

            }


            System.out.println();
        }
    }
}