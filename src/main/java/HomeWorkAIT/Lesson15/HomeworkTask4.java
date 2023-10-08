package HomeWorkAIT.Lesson15;

import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] args) {
        /*Создайте метод для конвертации температуры из градусов Цельсия в
        градусы Фаренгейта и наоборот.*/
        //delaem vibor s klaviatury, kakuju temperaturu hotim konvertirovat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        //Esli vibor 1. Celsius v Fahrenheit
        if (choice == 1) {
            System.out.println("Enter temperature in Celsius: ");
            //vvodim temperaturu
            double celsius = scanner.nextDouble();
            //Metod celsiusToFahrenheit vipolnyaet konvertaciju v sootvectvii s formuloj
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            //Esli vibor 2. Fahrenheit v Celsius
        } else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit: ");
            //vvodim temperaturu
            double fahrenheit = scanner.nextDouble();
            //Metod fahrenheitToCelsius vipolnyaet konvertaciju v sootvectvii s formuloj
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: " + celsius);
            //Esli vibor ne 1. i ne 2.
        } else {
            System.out.println("Invalid choice.");
        }
    }
    //Metod s formuloj konvertacii Celsius v Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    //Metod s formuloj konvertacii Fahrenheit v Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

