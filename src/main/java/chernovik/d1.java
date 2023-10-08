package chernovik;

public class d1 {
    public static void main(String[] args) {
        String spisok = gluingString("privet,kak,tvoi,dela");
        System.out.println(spisok);
    }

    static String gluingString(String input) {
        String[] strings = input.split(",");
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            result += strings[i].trim();
            if (i < strings.length - 1) {
                result += " "; // Добавляем пробелы между строками, кроме последней
            }
        }

        return result;
    }
}