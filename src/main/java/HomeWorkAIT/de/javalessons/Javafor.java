package HomeWorkAIT.de.javalessons;

import java.util.Scanner;

public class Javafor {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scaner.next();
        text = text.toLowerCase();
        String inverse = "";
        for (int i=text.length() - 1; i >=0; i--) {
            inverse = inverse + text.charAt(i);
        }

        if(text.equals(inverse)) {
            System.out.println("Это полиндром");
        }else {
            System.out.println("Это не полиндром");
        }

    }
}
