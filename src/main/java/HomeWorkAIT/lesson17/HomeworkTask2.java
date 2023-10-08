package HomeWorkAIT.lesson17;

public class HomeworkTask2 {
    public static void main(String[] args) {
        /*Создайте метод, который объединяет переданные строки в одну,
        разделяя их заданным разделителем.*/
        String pervij = "Masha,";
        String vtoroj = "Andrej";
        String tretij = "i Svetlana";
        String chetvertij = ",";
        String pyatyj = "poehali na more.";
        String rezult = stroki(pervij,vtoroj,tretij,chetvertij,pyatyj);
        System.out.println(rezult);

        //Vtoroj sposob
        String[] strings = {"Masha,", "Andrej", "i Svetlana,", " poehali na more."};
        String delimiter = " ";

        String result = concatenateStrings(strings, delimiter);
        System.out.println(result);

    }
    static String stroki(String a,String b,String c,String d,String e){

        return a + " " + b + " " + c + " " + d + " " + e;
    }
    //Vtoroj sposob objedinenija strok
    static String concatenateStrings(String[] strings, String delimiter) {
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
            if (i < strings.length - 1) {
                result += delimiter;
            }
        }

        return result;
    }
}
