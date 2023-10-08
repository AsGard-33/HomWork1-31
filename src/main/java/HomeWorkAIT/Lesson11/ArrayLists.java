package HomeWorkAIT.Lesson11;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>listInt = new ArrayList<>();
        Integer element = 10;
        ArrayList<String>listString = new ArrayList<>();
        ArrayList<Double>listDouble = new ArrayList<>();


        listInt.add(element);
        //listInt.add(0,5);//dobavlenie elementa na nugnij index
        //listInt.set(2,4);// zamena indexa
        System.out.println(listInt);
        System.out.println(element);


    }
}
