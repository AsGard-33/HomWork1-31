package HomeWorkAIT.lesson18;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Создайте метод, который принимает переменное число аргументов типа String и
        возвращает одну строку, составленную из всех переданных строк,
        разделенных пробелами.*/
        String spisok = gluingString("privet","kak","tvoi","dela");
        System.out.println(spisok);
    }
    static String gluingString (String... strings){
        String result = "";
        for (String spisok : strings){
            result = result.concat(spisok + " ");

            }

        return result;

    }
}
