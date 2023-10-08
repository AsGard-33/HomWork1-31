package HomeWorkAIT.lesson8;

public class homeworkTask1 {
    public static void main(String[] args) {
        /*Напишите программу, которая будет считать от 10 до 1 в обратном порядке,
         используя цикл do-while.*/
        int number = 11;
        System.out.println("Vivod chisel v obratnom porydke; ot 10 - do 1");
        do {
            number--;
            System.out.println("Object: " + number);
        }
        while (number>=2);
        System.out.println("The and");

    }
}
