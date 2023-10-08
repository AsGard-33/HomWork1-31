package HomeWorkAIT.de.javalessons.homeworkLessons3;

public class Task04 {
    public static void main(String[] args) {

        String a1 = "SherlokHolms";
        String a2 = "AlisaVstraneChudes";
        String b1 = "RusskieSkazki";
        String b2 = "KartyMira";
        boolean SherlokHolms = true;
        boolean AlisaVstraneChudes = true;
        boolean RusskieSkazki = true;
        boolean KartyMira = true;


        if(a1.equals("SherlokHolms") && SherlokHolms == true)
            System.out.println(a1 + " " + "-inStock" + ";" + " " + "add  to the cart?");
        else {
            System.out.println(a1 + " " + "-not available");
        }
        if(a2.equals("AlisaVstraneChudes") && AlisaVstraneChudes == true)
            System.out.println(a2 + " " + "-inStock" + ";" + " " + " add  to the cart?");
        else {
            System.out.println(a2 + " " + "-not available");
        }
        if(b1.equals("RusskieSkazki") && RusskieSkazki == true)
            System.out.println(b1 + " " + "-inStock" + ";" + " " + " add  to the cart?");
        else {
            System.out.println(b1 + " " + "-not available");
        }
        if(b2.equals("KartyMira") && KartyMira == true)
            System.out.println(b2 + " " + "-inStock" + ";" + " " + " add  to the cart?");
        else {
            System.out.println(b2 + " " + "-not available");
        }

    }


}
