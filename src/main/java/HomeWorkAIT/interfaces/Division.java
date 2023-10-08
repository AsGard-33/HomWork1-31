package HomeWorkAIT.interfaces;

public class Division implements  Oparation{
    @Override
    public double execute(double numberOne, double numberTwo) {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        } else {
            System.out.println("delenie na nol");

        }
        return numberOne ;
    }
}
