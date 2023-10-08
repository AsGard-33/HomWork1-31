package HomeWorkAIT.lesson17;

public class HomeworkTask1 {
    public static void main(String[] args) {
        /*Создайте метод, который выводит таблицу умножения для заданного числа.*/
        int zadannoeChislo = 3;
        umnogenije(zadannoeChislo);


    }
    static void umnogenije (int a){
        for (int i = 1; i <= 10; i++){
            int dejstvie = a * i;
            System.out.println(a + " * " + i + " = " + dejstvie);
        }

    }
}
