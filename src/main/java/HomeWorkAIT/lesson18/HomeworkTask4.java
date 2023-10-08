package HomeWorkAIT.lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Создайте метод, который принимает переменное число массивов типа int и
        возвращает новый массив, который является результатом складывания
        всех переданных массивов (объединение всех элементов)..*/
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        int[] array3 =calculateArray(array1,array2);
        System.out.println(Arrays.toString(array3));

    }
    static int[] calculateArray (int[]... numbers){
        List<Integer> tempList = new ArrayList<>();
        for (int[] array : numbers){
            for (int num : array){
                tempList.add(num);
            }
        }

        int[] combiArray = new int [tempList.size()];
        for (int i = 0; i < tempList.size(); i++){
            combiArray[i] = tempList.get(i);
        }
        return combiArray;
    }


}

