package HomeWorkAIT.homeworklessons4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chernovik {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a list of numbers separated by spaces: ");
            String inputLine = scanner.nextLine();

            String[] numberStrings = inputLine.split(" ");
            List<Integer> numbers = new ArrayList<>();

            for (String numberStr : numberStrings) {
                int number = Integer.parseInt(numberStr);
                numbers.add(number);
            }

            List<Integer> evenNumbers = filterEven(numbers);
            System.out.println("Even numbers: " + evenNumbers);
        }

        static List<Integer> filterEven(List<Integer> numbers) {
            List<Integer> evenNumbers = new ArrayList<>();

            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }

            return evenNumbers;
        }
    }




