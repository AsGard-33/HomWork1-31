package HomeWorkAIT.Lesson11;
import java.util.Arrays;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Дан массив содержащий три разных числа, представляющих три разных цвета.
         Отсортируйте его так, чтобы одинаковые цвета шли подряд.*/
        int[] colors = {1,2,3,1,2,3,1,2,3};
        int color1 = 1;
        int color2 = 2;
        int color3 = 3;
        int color;

        int[] sortirovka = new int[colors.length];
        int index = 0;

        for (int i = 0; i < colors.length; i++) {
            color = colors[i];
            if (color == color1) {
                sortirovka[index] = color1;
                index++;
            }
        }

        for (int i = 0; i < colors.length; i++) {
            color = colors[i];
            if (color == color2) {
                sortirovka[index] = color2;
                index++;
            }
        }

        for (int i = 0; i < colors.length; i++) {
            color = colors[i];
            if (color == color3) {
                sortirovka[index] = color3;
                index++;
            }
        }

        System.out.println("Cveta osortirovani po indexam: " + Arrays.toString(sortirovka));
    }
}