package HomeWorkAIT.Lesson11;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Напишите программу, которая подсчитывает количество четных и нечетных чисел в массиве.*/
        int[] massive;
        massive = new int[]{1,2,3,4,5,6,7,8,9};
        int chisloChetnoe = 0;
        int chisloNeChetnoe = 0;


        for (int i = 0; i < massive.length; i++){
            if (massive[i]%2 == 0){
                chisloChetnoe++;
            } else {
                chisloNeChetnoe++;
            }
        }
        System.out.println("Kollichestvo chetnih chisel: " + chisloChetnoe);
        System.out.println("Ne chetnih chisel: " + chisloNeChetnoe);
    }
}
