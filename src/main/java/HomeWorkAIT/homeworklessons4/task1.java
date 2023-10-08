package HomeWorkAIT.homeworklessons4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scaner =new Scanner(System.in);
        System.out.println("vvedite cislo:");
        String numberString = scaner.next();
        int numberLenght = numberString.length();
                boolean result;
        if (numberLenght%2 != 0){
          System.err.println("proverka ne vozmogna" + numberString);
        }
        else {
            int numberIntIndex0 = Integer.valueOf(numberString.charAt(0));
            int numberIntIndex1 = Integer.valueOf(numberString.charAt(1));
            int numberIntIndex2 = Integer.valueOf(numberString.charAt(2));
            int numberIntIndex3 = Integer.valueOf(numberString.charAt(3));
        }
        System.out.println("n");

    }
}
