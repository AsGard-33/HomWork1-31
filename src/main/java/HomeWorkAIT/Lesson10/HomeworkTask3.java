package HomeWorkAIT.Lesson10;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Написать программу, которая определяет, является ли массив строго возрастающим.*/
        int[]massiv;
        massiv = new int[]{1,2,3,4,5,6};
        boolean elementPlus = true;
        for (int i = 1; i < massiv.length; i++){
            if (massiv[i] <= massiv[i-1]){
                elementPlus = false;
                break;
            }
        }if (elementPlus){
            System.out.println("Massiv javlyetsya strogo vozrastajushim");
        } else {
            System.out.println("Massiv ne javlyetsya strogo vozrastajushim");
        }
    }
}
