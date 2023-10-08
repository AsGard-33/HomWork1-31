package HomeWorkAIT.lesson8;

import java.util.Scanner;

public class homeworkTask2 {
    public static void main(String[] args) {
        /*Напишите программу, которая будет запрашивать у пользователя ввести пароль.
        Если пароль не соответствует заранее заданному, программа должна повторно
        запросить пароль. Используйте цикл do-while для этого.*/

        Scanner scanner = new Scanner(System.in);
        String password = "33 Bogatirya";

        do {
            System.out.println("Enter password: ");
            password = scanner.nextLine();
            if (password.equals("33 Bogatirya")){
                System.out.println("Wellcome");
                break;
            }
            else {
                System.out.println("Password invalid,try again; ");
            }
        }
        while (true);
    }
}
