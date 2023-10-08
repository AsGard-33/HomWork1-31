package HomeWorkAIT.Lesson10;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Написать программу, которая возвращает сумму всех элементов массива.*/
        int[]massiv;
        massiv = new int[6];
        massiv = new int[]{1,22,3,4,5,6};
        int sum = 0;
        for ( int i = 0;i < massiv.length; i++){
            sum += massiv[i];

        }
        System.out.println("Summa vseh elementov massiva ravna: " + sum);
    }
}
