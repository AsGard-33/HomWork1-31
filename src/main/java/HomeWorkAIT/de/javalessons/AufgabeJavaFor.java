package HomeWorkAIT.de.javalessons;

import java.util.Scanner;

public class AufgabeJavaFor {
    public static void main(String[] args) {
        //Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite slovo:");
        String wordString = scanner.next();
        int counter = args.length;
        for (int i = 0; i < wordString.length(); i++){
            char checkLetter = wordString.charAt(i);
            if (checkLetter =='a'){
                counter++;
            }
        }
        System.out.println("Latter was counted:" + counter);
    }
}
