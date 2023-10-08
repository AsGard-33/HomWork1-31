package HomeWorkAIT.Lesson10;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Написать программу, которая возвращает обратный массив. int[]{1, 2, 3, 4, 5}
        вернет {5, 4, 3, 2, 1}. С клавиатуры массив вводить не надо.*/
        int[] massiv;
        massiv = new int[]{1,2,3,4,5};
        massiv[0] = 5;
        massiv[1] = 4;
        massiv[2] = 3;
        massiv[3] = 2;
        massiv[4] = 1;

        for (int i = 0; i < massiv.length; i++){
            System.out.print(massiv[i]);}
    }
}
