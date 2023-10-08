package HomeWorkAIT.lesson18;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /*Создайте метод, который принимает переменное число аргументов типа double и
        возвращает их среднее значение.*/
        double number = returnAvarage(2.3, 33.44, 55.234, 44.2);
        System.out.println(number);

    }

    static double returnAvarage(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;

        }
        return sum / numbers.length;
    }
}
