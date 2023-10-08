package HomeWorkAIT.Lesson12;

public class HomeworkTask4 {
    /*Дан отсортированный массив и целевое число. Напишите функцию, которая определяет,
        можно ли получить эту сумму, взяв два числа из массива. Верните индексы этих чисел.*/
    public static int[] index(int[] nums, int target){
        for(int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return  new int[] {-1,-1};
        }
    public static void main(String[] args) {
        int[] massiv = {1,3,5,7,9};
        int celevoeChislo = 5;
        int[] result = index(massiv,celevoeChislo);

        if (result[0] != -1 && result[1] != -1){
            System.out.println("indeksi chisel c zadanoj summoj: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("ne najdeno dvuh chisel s zadannoj summoj.");
        }


    }
}
