package HomeWorkAIT.Lesson11;

public class ForEach {
    public static void main(String[] args) {
        // vivodit summu chisel v massive
        int[] array = {1,2,3,4,5};
        int summ = 0;
        for (int num:array){
            summ += num;
        }
        System.out.println(summ);
        // proga kotoraja vivodit maksimalnoe chislo
        int [] erray2 = {1,22,3,4,5,6};
        int max =0;
        for (int num:erray2){
            if (num> max){
                max = num;
            }
        }
        System.out.println("maksimalnij element: " + max);
        //schitaet kolichestvo elementov v massive naprimer bolshe 10
        int[] array3 = {5,15,7,22,13,9};
        int chislo = 10;
        int schetchik = 0;
        for ( int num : array3){
            if(num>chislo);
            schetchik++;

        }
        System.out.println("dfkjgh: " + schetchik);
        //kopiruet iz odnogo v drugoj massiv
        int[] sourceArray = {1,2,3,4,5};
        int[] targetArray = new int[sourceArray.length];
        int index = 0;
        for (int number : sourceArray){
            targetArray[index] = number;
            index++;
        }
        for (int number : targetArray){
            System.out.print(number + " ");

        }

        //podscitivaet kolichestvo bukv "a" v stroke
        String text = "Hallo Deutschland";
        int kollichestvo = 0;
        for (char letter : text.toCharArray()){
            if (letter =='a' || letter == 'A'){
                kollichestvo++;
            }

        }
        System.out.println("Kollichestvo bukv  'a' v stroke:  " + kollichestvo);


    }
}
