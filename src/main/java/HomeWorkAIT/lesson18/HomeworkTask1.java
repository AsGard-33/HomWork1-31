package HomeWorkAIT.lesson18;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Создайте метод, который принимает переменное число аргументов типа int и
        возвращает их сумму.*/

        int spisok = printNumbers(3, 3, 55, 33);
        System.out.println("Summa chisel: " + spisok);
    }
    static int printNumbers(int ... numbers){
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
}
