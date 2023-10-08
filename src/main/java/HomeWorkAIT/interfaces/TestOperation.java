package HomeWorkAIT.interfaces;

public class TestOperation {
    public static void main(String[] args) {
        Oparation operation = new Addition();
        System.out.println(operation.execute(10,24));

        operation = new Division();
        System.out.println(operation.execute(30,10));

        operation = new Subtraction();
        System.out.println(operation.execute(30,20));

        operation = new Multiplication();
        System.out.println(operation.execute(40,15));
    }
}
