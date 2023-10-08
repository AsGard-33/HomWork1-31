package HomeWorkAIT.Lesson11;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Написать программу проверяющую, есть ли дубликаты в массиве.*/

        int[] massive = {1,2,2,3,4,5,6};
        boolean dublicat = false;

        for (int i = 0; i < massive.length - 1; i++) {
            for (int y = i + 1; y < massive.length; y++) {
                if (massive[i] == massive[y]) {
                    dublicat = true;
                    break;
                }
            }
            if (dublicat) {
                break;
            }
        }
        if (dublicat){
            System.out.println("V massiv est dublicat");
        } else {
            System.out.println("V massive net dublicat");
        }
    }
}
