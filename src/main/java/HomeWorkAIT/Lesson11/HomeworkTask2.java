package HomeWorkAIT.Lesson11;
import java.util.Arrays;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Написать программу, обьединяющую два массива в один массив.*/
        int[] mas1;
        mas1 = new int[]{1,2,3,4,5};
        int[]mas2;
        mas2 = new int[]{6,7,8,9,10};
        int[] newUnion = new int[mas1.length + mas2.length];

        for (int i = 0; i <mas1.length; i++){
            newUnion[i] = mas1[i];
        }
        for (int i = 0; i< mas2.length; i++){
            newUnion[mas1.length +i] = mas2[i];
        }
        System.out.println("Objedinennye massivy: " + Arrays.toString(newUnion));

    }
}
