package HomeWorkAIT.de.javalessons.homework;

public class Aufgabe02 {
    public static void main(String[] args) {
        int year = 1909;

        if ((year %4 == 0 && year % 100 != 0)|| (year%400==0)) {

            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}